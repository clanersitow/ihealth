
package MODEL.proxysTablas;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Conexion {
    private static Connection con;
    private static String usuario = "root";
    private static String password= "AULAS6";
    private static String url     = "jdbc:mysql://localhost:3306/ihealth";
    
    public static Connection crearConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, usuario, password);
        }catch(ClassNotFoundException ex){
            System.out.println("Error en conexion: " + ex);
            //ex.printStackTrace();
        }catch(SQLException ex){
            System.out.println("Error en conexion: "+ ex);
            ex.printStackTrace();
        }catch(Exception ex){
            System.out.println("Error en conexion: newInstance");
        }
        
        System.out.println("Se ha conectado a la base de");
        return con;
    }
    
    public static void close(){
        try{
            if(con != null){
                con.close();
            }
        }catch(SQLException ex){
            System.out.println("Error en conexion: error al cerrar la conexion SQLException");
            ex.printStackTrace();
        }
    }
}
