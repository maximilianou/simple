package script.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.script.ScriptException;

public class TestTemplate {

    public static void main(String[] args) throws FileNotFoundException, IOException, ScriptException {
        System.out.println("[..]TestTemplate.main()");
        String mus = Template.leer("src/java/script/test/mustache.js");
        mus += ""
         +" var view = { title: 'Joe' }; print(Mustache.render('Titulo: {{title}}. ', view)); ";
        Template.ejecutar(mus);
        System.out.println("");
        System.out.println("[Ok]TestTemplate.main()");
    }
}
