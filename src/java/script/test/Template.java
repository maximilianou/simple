package script.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Template {

    public static String ejecutar(String elscript) throws ScriptException {
        String resultado = elscript;
        ScriptEngine se = new ScriptEngineManager().getEngineByName("javascript");
        se.eval(elscript);
        return resultado;
    }

    public static String leer(String archivo) throws FileNotFoundException, IOException {
        String resultado = "";
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            while (br.ready()) {
                resultado += br.readLine() + System.getProperty("line.separator");
            }
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        System.out.println("[..]Template Testing.");
        try {
            System.out.println(ejecutar("print('a');"));
        } catch (ScriptException ex) {
            Logger.getLogger(Template.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("[Ok]Template Testing.");
    }
}
