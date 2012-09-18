package scripting;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;
import java.util.Locale;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticListener;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.SimpleJavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class DynamicCompiler {

    private static String classOutputFolder = ".";

    public static class MyDiagnosticListener implements DiagnosticListener<JavaFileObject> {

        public void report(Diagnostic<? extends JavaFileObject> diagnostic) {

            System.out.println("Line Number->" + diagnostic.getLineNumber());
            System.out.println("code->" + diagnostic.getCode());
            System.out.println("Message->"
                    + diagnostic.getMessage(Locale.ENGLISH));
            System.out.println("Source->" + diagnostic.getSource());
            System.out.println(" ");
        }
    }

    public static class InMemoryJavaFileObject extends SimpleJavaFileObject {

        private String contents = null;

        public InMemoryJavaFileObject(String className, String contents) throws Exception {
            super(URI.create("string:///" + className.replace('.', '/')
                    + Kind.SOURCE.extension), Kind.SOURCE);
            this.contents = contents;
        }
        public CharSequence getCharContent(boolean ignoreEncodingErrors)
                throws IOException {
            return contents;
        }
    }

    private static JavaFileObject getJavaFileObject() {
        StringBuilder contents = new StringBuilder(
                "package scripting;"
                + "public class Calculator { "
                + "  public void testAdd() { "
                + "    System.out.println(200+300); "
                + "  } "
                + "  public static void main(String[] args) { "
                + "    Calculator cal = new Calculator(); "
                + "    cal.testAdd(); "
                + "    System.out.println(777); "
                + "  } " + "} ");
        JavaFileObject so = null;
        try {
            so = new InMemoryJavaFileObject("math.Calculator", contents.toString());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return so;
    }

    /**
     * compile your files by JavaCompiler
     */
    public static void compile(Iterable<? extends JavaFileObject> files) {
        //get system compiler:
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

        // for compilation diagnostic message processing on compilation WARNING/ERROR
        MyDiagnosticListener c = new MyDiagnosticListener();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(c,
                Locale.ENGLISH,
                null);
        //specify classes output folder
        Iterable options = Arrays.asList("-d", classOutputFolder);
        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager,
                c, options, null,
                files);
        Boolean result = task.call();
        if (result == true) {
            System.out.println("Succeeded");
        }
    }

    /**
     * run class from the compiled byte code file by URLClassloader
     */
    public static void runIt() {
        // Create a File object on the root of the directory
        // containing the class file
        File file = new File(classOutputFolder);

        try {
            // Convert File to a URL
            URL url = file.toURI().toURL();
            System.out.println("url:"+url);
            URL[] urls = new URL[]{url};

            // Create a new class loader with the directory
            ClassLoader loader = new URLClassLoader(urls);

            // Load in the class; Class.childclass should be located in
            // the directory file:/class/demo/
            Class thisClass = loader.loadClass("scripting.Calculator");

            Class params[] = {};
            Object paramsObj[] = {};
            Object instance = thisClass.newInstance();
            Method thisMethod = thisClass.getDeclaredMethod("testAdd", params);
            
            thisClass = loader.loadClass("scripting.Calculator");
            

            // run the testAdd() method on the instance:
            thisMethod.invoke(instance, paramsObj);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        //1.Construct an in-memory java source file from your dynamic code
        JavaFileObject file = getJavaFileObject();
        Iterable<? extends JavaFileObject> files = Arrays.asList(file);

        //2.Compile your files by JavaCompiler
        compile(files);

        //3.Load your class by URLClassLoader, then instantiate the instance, and call method by reflection
        runIt();
        //2.Compile your files by JavaCompiler
        compile(files);

        //3.Load your class by URLClassLoader, then instantiate the instance, and call method by reflection
        runIt();
    }
}
