package io.db;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author maximilianou
 */
public class TestIndice {

    public static void escribir(){
        RandomAccessFile rf = null;
        try {
            rf = new RandomAccessFile("base.txt", "rw");

            ArrayList<String> lista = new ArrayList();
            lista.add("01@uno@dos");
            lista.add("03@cientouno@doscientos");
            lista.add("05@cuarenta@ocho");
            lista.add("08@siete@setentaytres");
            rf.writeInt(lista.size());
            for (String s : lista) {
                rf.writeUTF(s);
            }
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                rf.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
    }

    public static void leer(){
        RandomAccessFile rf = null;
        try {
            rf = new RandomAccessFile("base.txt", "rw");

            ArrayList<String> lista = new ArrayList();
            int cantidadDatos = rf.readInt();
            
            for(int i = 0; i<cantidadDatos; i++){
                lista.add(rf.readUTF());
            }
            for(String s : lista){
                System.out.println("["+s+"]");
            }
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                rf.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
    }
    
    public static void main(String[] args) {
      escribir();
      leer();
    }
}
