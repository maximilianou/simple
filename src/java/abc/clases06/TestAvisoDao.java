package abc.clases06;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maximilianou
 */
public class TestAvisoDao {

    public static void main(String[] args) {
        System.out.println("[ .. ]TestAvisoDao");
        try {
            ArrayList<Aviso> avisos = AvisoDao.getInstance().obtener();
            for (Aviso a : avisos) {
                System.out.println(a);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            Aviso a = new Aviso("Un Titulo TestAvisoDao", 2000, "" + new Date());
            AvisoDao.insertar(a);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            DB.getInstance().shutdown();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("[ OK ]TestAvisoDao");
    }
}
