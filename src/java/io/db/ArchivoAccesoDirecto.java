package io.db;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/** @author maximilianou  */
public class ArchivoAccesoDirecto {
   
        public static void escribir(ArrayList lista, String nombreArchivo ){
        RandomAccessFile rf = null;
        try {
            rf = new RandomAccessFile(nombreArchivo, "rw");
            rf.writeInt(lista.size());
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
            rf = new RandomAccessFile(nombreArchivo, "rw");
            int cantidadDatos = rf.readInt();
            for(int i = 0; i<cantidadDatos; i++){
                lista.add(rf.readUTF());
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
}