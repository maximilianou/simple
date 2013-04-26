package script.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.script.ScriptException;

public class TestTemplate {

    public static void main(String[] args) throws FileNotFoundException, IOException, ScriptException {
        System.out.println("[..]TestTemplate.main()");
        
        System.out.println("-- Paso 1 --------------------------------------");
        String mus = Archivo.leer("src/java/script/test/mustache.js");
        mus += " var view = { title: 'Joe' }; ";
        mus += " var resultado = Mustache.render('Titulo: {{title}}. ', view); ";
        String salida = Template.ejecutar(mus);
        System.out.println(salida);
        System.out.println("-- ---- 1 --------------------------------------");
        
        
//        System.out.println("-- Paso 2 --------------------------------------");
//        
//        mus = Archivo.leer("src/java/script/test/mustache.js");
//        String losDatos = Archivo.leer("src/java/script/test/datos.json");
//        String laPlantilla = Archivo.leer("src/java/script/test/plantilla.tpl");
//        
//        mus += " var view = " + losDatos + "; ";
//        mus += " var resultado = Mustache.render('"
//                + laPlantilla
//                + "', view); ";
//
//        salida = Template.ejecutar(mus);
//        System.out.println(salida);
//        System.out.println("-- ---- 2 --------------------------------------");
//        
        System.out.println("");
        
        System.out.println("[Ok]TestTemplate.main()");
    }
}
