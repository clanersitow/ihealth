package CONTROLLER;
import VIEW.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class OPrincipal implements ActionListener{
    JButton opc ;
    JButton login ;
    JButton registrarse;
    JButton especialidades;
    JButton medico;
    JButton directorio;
   
    public OPrincipal(JButton a,JButton b,JButton c,JButton d,JButton e) {
        this.login=a;
        this.registrarse=b;
        this.especialidades=c;
        this.medico=d;
        this.directorio=e;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object opc= e.getSource();
       
        if(opc==login){
            AUTENTICACION login = new AUTENTICACION();
            login.setVisible(true);
        }
        
        if(opc==registrarse){
            REGISTRO registro = new REGISTRO();
            registro.setVisible(true);
        }
        
        if(opc==especialidades){
            AUTENTICACION login = new AUTENTICACION();
            login.setVisible(true);
        }
        
        if(opc==medico){
            AUTENTICACION login = new AUTENTICACION();
            login.setVisible(true);
        }
        
        if(opc==directorio){
            AUTENTICACION login = new AUTENTICACION();
            login.setVisible(true);
        }
        
    }

}
