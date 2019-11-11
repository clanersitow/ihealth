
package MODEL.proxysTablas;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Conexion {
    private static Connection con;
    private static String usuario = "root";
    private static String password= "AULAS6";
    private static String url     = "jdbc:myslq://localhost/ihealth";
    
    public static Connection getConexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, password);
        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return con;
    }
    
    public static void close(){
        try{
            if(con != null){
                con.close();
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
