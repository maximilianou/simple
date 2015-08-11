package abc.clases08;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

/**
 * @author maximilianou
 */
public class AvisoDao {

    private AvisoDao() throws ClassNotFoundException,
            IOException, SQLException {
        crear();
    }
    private static AvisoDao INSTANCE = null;

    public static AvisoDao getInstance() throws ClassNotFoundException,
            IOException, SQLException {
        if (INSTANCE == null) {
            INSTANCE = new AvisoDao();
        }
        return INSTANCE;
    }
    private final static String SQL_AVISOS_CREATE = "CREATE TABLE IF NOT EXISTS "
            + "avisos ( av_id IDENTITY, av_titulo VARCHAR(255), "
            + "av_precio FLOAT, av_descripcion VARCHAR(255)  );";

    public void crear() throws ClassNotFoundException, IOException, SQLException {
        Connection c = null;
        PreparedStatement ptsmt = null;
        try {
            c = DB.getInstance().getConnection();
            ptsmt = c.prepareStatement(SQL_AVISOS_CREATE);
            ptsmt.execute();
        } finally {
            try {
                ptsmt.close();
            } finally {
                c.close();
            }
        }
    }
    private final static String SQL_AVISOS_SELECT = "SELECT * FROM avisos;";

    public ArrayList<Aviso> obtener() throws ClassNotFoundException,
            IOException, SQLException {
        ArrayList<Aviso> lista = new ArrayList();
        Connection c = null;
        PreparedStatement ptsmt = null;
        ResultSet rs = null;
        try {
            c = DB.getInstance().getConnection();
            ptsmt = c.prepareStatement(SQL_AVISOS_SELECT);
            rs = ptsmt.executeQuery();
            Aviso a = null;
            while (rs.next()) {
                try {
                    a = new Aviso(rs.getString("av_titulo"),
                            rs.getFloat("av_precio"),
                            rs.getString("av_descripcion"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                a.setId(rs.getString("av_id"));
                lista.add(a);
            }
        } finally {
            try {
                rs.close();
            } finally {
                try {
                    ptsmt.close();
                } finally {
                    c.close();
                }
            }
        }
        return lista;
    }
    private final static String SQL_AVISOS_INSERT = "INSERT INTO avisos (av_titulo,"
            + "av_precio, av_descripcion)values(?,?,?);";

    public static void insertar(Aviso a)
            throws ClassNotFoundException,
            IOException, SQLException {
        Connection c = null;
        PreparedStatement ptsmt = null;
        try {
            c = DB.getInstance().getConnection();
            ptsmt = c.prepareStatement(SQL_AVISOS_INSERT);
            ptsmt.setString(1, a.getTitulo());
            ptsmt.setFloat(2, a.getPrecio());
            ptsmt.setString(3, a.getDescripcion());
            ptsmt.execute();
        } finally {
            try {
                ptsmt.close();
            } finally {
                c.close();
            }
        }
    }
    private final static String SQL_AVISOS_UPDATE = "UPDATE avisos "
            + "set av_titulo = ?, av_precio = ?, av_descripcion = ? "
            + " WHERE av_id = ?;";

    public static void actualizar(Aviso a) throws ClassNotFoundException,
            IOException, SQLException {
        Connection c = null;
        PreparedStatement ptsmt = null;
        try {
            c = DB.getInstance().getConnection();
            ptsmt = c.prepareStatement(SQL_AVISOS_UPDATE);
            ptsmt.setString(1, a.getTitulo());
            ptsmt.setFloat(2, a.getPrecio());
            ptsmt.setString(3, a.getDescripcion());
            ptsmt.setInt(4, Integer.parseInt(a.getId()));
            ptsmt.execute();
        } finally {
            try {
                ptsmt.close();
            } finally {
                c.close();
            }
        }
    }
    private final static String SQL_AVISOS_DELETE = "DELETE avisos "
            + " WHERE av_id = ?;";

    public static void borrar(Aviso a) throws ClassNotFoundException,
            IOException, SQLException {
        Connection c = null;
        PreparedStatement ptsmt = null;
        try {
            c = DB.getInstance().getConnection();
            ptsmt = c.prepareStatement(SQL_AVISOS_DELETE);
            ptsmt.setInt(1, Integer.parseInt(a.getId()));
            ptsmt.execute();
        } finally {
            try {
                ptsmt.close();
            } finally {
                c.close();
            }
        }
    }
}
