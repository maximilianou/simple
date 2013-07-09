/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io.db;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author maximilianou
 */
public class ArchivoAccesoDirecto {
   
        public static void escribir(ArrayList lista, String nombreArchivo ){
        RandomAccessFile rf = null;
        try {
            //rf = new RandomAccessFile("base.txt", "rw");
            rf = new RandomAccessFile(nombreArchivo, "rw");
//            ArrayList<String> lista = new ArrayList();
//            lista.add("01@uno@dos");
//            lista.add("03@cientouno@doscientos");
//            lista.add("05@cuarenta@ocho");
//            lista.add("08@siete@setentaytres");
            rf.writeInt(lista.size());
//            for (String s : lista) {
//                rf.writeUTF(s);
//            }
            for (Object s : lista) {
                rf.writeUTF(s.toString());
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

    public static void leer( String nombreArchivo, ArrayList lista){
        RandomAccessFile rf = null;
        try {
            //rf = new RandomAccessFile("base.txt", "rw");
            rf = new RandomAccessFile(nombreArchivo, "rw");

            //ArrayList<String> lista = new ArrayList();
            int cantidadDatos = rf.readInt();
            
            for(int i = 0; i<cantidadDatos; i++){
                lista.add(rf.readUTF());
            }
//            for(Object s : lista){
//                System.out.println("["+s+"]");
//            }
            
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

    
}
