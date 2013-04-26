package util.export;

import java.io.*;
import java.util.*;

public class Export {
    
  public static void toFilesByKey(String path, TreeMap diccionario) throws IOException{
      Iterator it = diccionario.keySet().iterator();
      while(it.hasNext()){
          Object clave = it.next();
          File archivo = new File(path + "/" + clave.toString());
          try ( FileWriter salida = new FileWriter(archivo) ) {
              salida.write( diccionario.get(clave).toString());
              salida.flush();
              salida.close();
          }
      }
  }
  
  
  
  
}
