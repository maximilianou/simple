/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simple;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author maxi
 */
public class Simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    System.out.println("Inicio Programa");
    
    ScriptEngineManager sem = new ScriptEngineManager();
    System.out.println(sem.getEngineFactories());
            
    ScriptEngine se = sem.getEngineByName("Javascript");
        try {
            se.eval("print('Crear Buenos Aires');");
        } catch (ScriptException ex) {
            Logger.getLogger(Simple.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    System.out.println("Fin Programa");
    
    }
}
