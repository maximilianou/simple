package compras.test;

import compras.logica.AdmProducto;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.export.Export;

public class TestExport {

    public static void exportTest() throws IOException{
        System.out.println("TestExport exportTest() [..] -- -- -- -- -- -- ");
        Export.toFilesByKey(".", AdmProducto.getProductos());
        System.out.println("TestExport exportTest() [Ok] -- -- -- -- -- -- ");
    }
    public static void main(String[] args) {
        TestProductos.initTest();
        try {
            TestExport.exportTest();
        } catch (IOException ex) {
            ex.printStackTrace();
            Logger.getLogger(TestExport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
