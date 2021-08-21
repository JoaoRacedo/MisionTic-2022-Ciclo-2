import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void INSERT_DB(String username, String name){
        String sql_insert = "INSERT INTO users (username,name) VALUES ('"+username
        +"','"+name+"');";
        Connection conn = Connection_DB.getConnection();
        try{
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql_insert);
            statement.close();
        }catch(SQLException e){
            System.err.println(e.getClass().getName() + ":" + e.getMessage());
        }

        try{
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void getUser_From_DB(){
        String sql_get_all = "SELECT * FROM users;";

        Connection conn = Connection_DB.getConnection();
        try{
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql_get_all);

            while(rs.next()){
                System.out.println(rs.getInt("user_id")+ " - " + 
                                   rs.getString("username")+ " - " + 
                                   rs.getString("name")
                                   );
            }
        }catch(SQLException e){
            System.err.println(e.getClass().getName() + ":" + e.getMessage());
        }

        try{
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static void Edit_in_DB(int id, String username, String name){
        String sql_edit = "UPDATE users SET username ='" + username + "', name='"+name+"' WHERE user_id="+id+";";
        //System.out.println(sql_edit);

        Connection conn = Connection_DB.getConnection();

        try{
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql_edit);
            statement.close();
        }catch(SQLException e){
            System.err.println(e.getClass().getName() + ":" + e.getMessage());
        }

        try{
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static void Delete_in_DB(int id){
        String sql_edit = "DELETE from users WHERE user_id="+id+";";
        //System.out.println(sql_edit);

        Connection conn = Connection_DB.getConnection();

        try{
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql_edit);
            statement.close();
        }catch(SQLException e){
            System.err.println(e.getClass().getName() + ":" + e.getMessage());
        }

        try{
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
       //INSERT_DB("Maria", "Maria Jose");
       getUser_From_DB();
       //Edit_in_DB(4,"Maria","Maria Jose");
       Delete_in_DB(4);
       getUser_From_DB();
    }
}
