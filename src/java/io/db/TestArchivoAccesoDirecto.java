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
public class TestArchivoAccesoDirecto {

    public static void main(String[] args) {
        System.out.println("[....] TestIndice");
        ArrayList<String> lista = new ArrayList();
        lista.add("01@uno@dos");
        lista.add("03@cientouno@doscientos");
        lista.add("05@cuarenta@ocho");
        lista.add("08@siete@setentaytres");
        System.out.println("[....] TestIndice escribir -------- ");
        ArchivoAccesoDirecto.escribir(lista, "base.txt");
        System.out.println("[ OK ] TestIndice escribir ~~~~~~~~ ");
        ArrayList listaRespuesta = new ArrayList();
        System.out.println("[....] TestIndice escribir -------- ");
        ArchivoAccesoDirecto.leer("base.txt", listaRespuesta);
        System.out.println("[ OK ] TestIndice escribir ~~~~~~~~ ");
        for (Object s : listaRespuesta) {
            System.out.println("[" + s + "]");
        }
        System.out.println("[ OK ] TestIndice");
    }
}
