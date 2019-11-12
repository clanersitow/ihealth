
package MODEL.proxysTablas.conexiones;



import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Conexion {   
    private static Connection con;
    private static String usuario  = "admin";
    private static String pwd      = "password1";
    private static String url      = "jdbc:mysql://ihealth.cut2jzbnvmfx.us-west-2.rds.amazonaws.com/ihealth";
     
    public static Connection open(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 		
            con = DriverManager.getConnection(url,usuario,pwd);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
    return con;
  }
    public static void close(){
        try {
            if(con != null)
               con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
