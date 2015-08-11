package abc.clases08;

import java.io.IOException;
import java.sql.*;
import org.hsqldb.server.ServerAcl;

/**
 * @author maximilianou
 */
public class TestDB {

    private static final String SQL_CREATE =
            "CREATE TABLE IF NOT EXISTS avisos ( av_id IDENTITY, "
            + "av_titulo VARCHAR(255)  );";
    private static final String SQL_INSERT =
            "INSERT INTO avisos (av_titulo)values(?);";
    private static final String SQL_SELECT =
            "SELECT * FROM avisos;";
    private static final String SQL_DROP =
            "DROP TABLE avisos;";
    private static final String SQL_SHUTDOWN =
            "SHUTDOWN;";

    public static void main(String[] args) {
        System.out.println("[ .. ] TestDB");
        Connection c = null;
        PreparedStatement pstmt = null;
        try {
            c = DB.getInstance().getConnection();
            pstmt = c.prepareStatement(SQL_CREATE);
            pstmt.execute();
            pstmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        for (int i = 0; i < 5; i++) {
            try {
                pstmt = c.prepareStatement(SQL_INSERT);
                pstmt.setString(1, "El Titulo Del Aviso " + i);
                pstmt.execute();
                pstmt.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        try {
            pstmt = c.prepareStatement(SQL_SELECT);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("[" + rs.getString(1) + "], ["
                        + rs.getString(2) + "] ");
            }
            pstmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            pstmt = c.prepareStatement(SQL_DROP);
            System.out.println(
                    pstmt.execute());
            pstmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            pstmt = c.prepareStatement(SQL_SHUTDOWN);
            pstmt.execute();
            pstmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("[ OK ] TestDB");
    }
}
