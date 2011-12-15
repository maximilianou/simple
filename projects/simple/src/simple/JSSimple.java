/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simple;

import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

/**
 *
 * @author maxi
 */
public class JSSimple {
  public static void main(String[]args){
      ScriptEngineManager sem = new ScriptEngineManager();
//      sem.registerEngineName("javascript", );
      System.out.println(sem.getEngineFactories());
  }    
    
}
