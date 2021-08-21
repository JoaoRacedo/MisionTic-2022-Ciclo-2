import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_DB {

    private Connection conn;

    public static Connection getConnection(){
        Connection conn = null;
        
        try{
            String url = "";
            conn = DriverManager.getConnection("jdbc:sqlite:" + url);
            if (conn != null)
                System.out.println("Conectado");
        }catch(SQLException e){
            System.err.println("No se ha podido conectar \n"+ e.getMessage());
        }
        return conn;
    }

    public void close(){
        try{
            conn.close();
        }catch(SQLException e){
            System.err.println("No se ha podido cerrar \n"+ e.getMessage());
        }
    }
}
