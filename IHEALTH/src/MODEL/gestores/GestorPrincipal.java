
package MODEL.gestores;
import MODEL.*;
import MODEL.proxysTablas.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class GestorPrincipal {
    
    public static void main(String[] args) {
        
        Connection conexion = null;
        Statement  consulta = null;
        
        
        try{
            conexion = Conexion.getConexion();
            consulta = conexion.createStatement();
            consulta.executeUpdate("INSERT INTO ihealth.pueba VALUES('valor', 'valor')");
        }catch(SQLException e){
            System.out.println("Error al conectar a la base de datos");
            e.printStackTrace();
        }catch(Exception e){
            System.out.println("Error al ejecutar la consulta");
            e.printStackTrace();
        }finally{
            try{
                consulta.close();
                conexion.close();
            }catch(Exception e){}
        }
        
    }
}
