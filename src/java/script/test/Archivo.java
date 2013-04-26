

package script.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Archivo {
    public static String leer(String archivo) throws FileNotFoundException, IOException {
        String resultado = "";
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            while (br.ready()) {
                resultado += br.readLine() + System.getProperty("line.separator");
            }
        }
        return resultado;
    }
}
