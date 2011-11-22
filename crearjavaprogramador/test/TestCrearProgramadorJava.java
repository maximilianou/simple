package simple.crearjavaprogramador.test;
//maximilianou@gmail.com
import simple.crearjavaprogramador.validation.BelowZeroException;
import simple.crearjavaprogramador.entities.ProductArticle;

public class TestCrearProgramadorJava {

    public static void main(String[] args) {
        System.out.println("Crear Buenos Aires. CrearJavaProgramador");

// Java Core Objets I
//TODO: Objets ( Source code y just text file. Mercurial )

//        Product tabletpcA = new Product();
//        Product tabletpcB = new Product();

//TODO: Atribute ( basic types )
        
/*
        tabletpcA.name = "Samsung Galaxy Tab 10";
        tabletpcA.description = "1GHz dual-core NVIDIA Tegra 2 processor, 10.1inch widescreen 1280x800 149ppi";
        tabletpcA.amount = 500;
        
        tabletpcB.name = "IPad2";
        tabletpcB.description = "1GHz Apple A5 SoC, 9.7inch 1024×768 132ppi";
        tabletpcB.amount = 500;
*/        
//TODO: Method ( what a class can do? , return )
/*
        tabletpcA.print();
        tabletpcB.print();
*/        
// DONE: package, import, public
        

//TODO: Encapsulate  ( preparing to change )
/*
        tabletpcA.setName("Samsung Galaxy Tab 10");
        tabletpcA.setDescription("1GHz dual-core NVIDIA Tegra 2 processor, 10.1inch widescreen 1280x800 149ppi");
        try{
            tabletpcA.setAmount(500);
        }catch(BelowZeroException mce){
            mce.printStackTrace();
        }
*/        
// Java Core Objets Validaciones
//TODO: Excepciones ( The system never halt whithout knowing why. )
/*
        tabletpcB.setName("IPad2");
        tabletpcB.setDescription("1GHz Apple A5 SoC, 9.7inch 1024×768 132ppi");
        
        try{
            tabletpcB.setAmount(500);
        }catch(BelowZeroException mce){
            mce.printStackTrace();
        }
        
        
        tabletpcA.print();
        tabletpcB.print();
*/        
// Java Core Objetos II
//TODO: Herencia ( reutilizando codigo, familia )
        
        
//TODO: Abstracto ( luchando contra la inconsistencia )

        ProductArticle tabletpcA = new ProductArticle();
        tabletpcA.setName("Samsung Galaxy Tab 10");
        tabletpcA.setDescription("1GHz dual-core NVIDIA Tegra 2 processor, 10.1inch widescreen 1280x800 149ppi");
        try{
            tabletpcA.setAmount(500);
        }catch(BelowZeroException mce){
            mce.printStackTrace();
        }
        
        ProductArticle tabletpcB = new ProductArticle();
        tabletpcB.setName("IPad2");
        tabletpcB.setDescription("1GHz Apple A5 SoC, 9.7inch 1024×768 132ppi");
        
        try{
            tabletpcB.setAmount(500);
        }catch(BelowZeroException mce){
            mce.printStackTrace();
        }
        tabletpcA.print();
        tabletpcB.print();
        
        
//TODO: Interface, web, html ( toString(), toHtml(), toJson()  )

        // http://www.json.org/
        // http://www.json.org/java/index.html
        // https://github.com/douglascrockford/JSON-java
        // http://sites.google.com/site/gson/Home (Info)
        // http://code.google.com/p/google-gson/  (Download) 
        
        System.out.println(tabletpcA);
        System.out.println(tabletpcB);
        
        System.out.println(tabletpcA.toJSON());
        System.out.println(tabletpcB.toJSON());

        //TODO: HTML5 form
        //TODO: HTML5 list
        //  http://diveintohtml5.info/        
        //  http://www.modernizr.com/  (Javascript lib, detect html5 featrues)
        //   http://camendesign.com/code/video_for_everybody
        //   http://videojs.com/ ( All )
        //    http://www.webmproject.org/
        
// Java Api I Memoria
//TODO: Collections

// Java Api II Comunicacion
//TODO: Streams	( File, FileReader, BufferedReader, Traductor, URL, HTTPConnection, Properties )

// Java Api III SQL
//TODO: JDBC ( hsqldb )

// Java Design Patterns I
//TODO: Configuration ( Singleton, Cache )

//TODO: Object Pool, Resource

        System.out.println("Crear Buenos Aires. CrearJavaProgramador Exito!!");
    }
}
