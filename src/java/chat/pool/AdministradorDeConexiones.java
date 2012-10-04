package chat.pool;
import java.sql.Connection;
import java.sql.DriverManager;
public abstract class AdministradorDeConexiones {
    public AdministradorDeConexiones() {
    }
    public static Connection getConnection() throws Exception{
        // Establece el nombre del driver a utilizar
        String dbDriver = "com.mysql.jdbc.Driver";
        
        // Establece la conexion a utilizar contra la base de datos
        String dbConnString = "jdbc:mysql://localhost/j2se";
        
        // Establece el usuario de la base de datos
        String dbUser = "root";
        
        // Establece la contrase�a de la base de datos
        String dbPassword = "";
        
        // Establece el driver de conexion
        Class.forName(dbDriver).newInstance();
        
        // Retorna la conexion
        return DriverManager.getConnection(dbConnString, dbUser, dbPassword);
    }    
}
