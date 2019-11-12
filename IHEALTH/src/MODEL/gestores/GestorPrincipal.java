
package MODEL.gestores;
import MODEL.*;
import MODEL.proxysTablas.conexiones.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GestorPrincipal {
    
    public static void main(String[] args) {
        
        Connection conexion = null;
        Statement  consulta = null;
        String tabla="";
        
        try{
            Conexion conn=new Conexion();
            conexion = conn.open();
            consulta = conexion.createStatement();
            PreparedStatement ps = null;
         ResultSet rs = null;
         String sql = "SHOW TABLES;";
         ps = conexion.prepareStatement(sql);
         rs = ps.executeQuery();
         while( rs.next() ) {
                tabla += "id:\t"+rs.getString(1)+"\n";
         }
         conn.close();
        }catch(Exception e){}
        
       System.out.println("success\n "+tabla);
        
    }
}
