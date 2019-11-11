package CONTROLLER;
import VIEW.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class OPrincipal implements ActionListener{
    JButton opc ;
    JButton login ;
    JButton registrarse;
    JButton eventos;
    JButton medicos;
    JButton instalaciones;
   
    public OPrincipal(JButton a,JButton b,JButton c,JButton d,JButton e) {
        this.login=a;
        this.registrarse=b;
        this.eventos=c;
        this.medicos=d;
        this.instalaciones=e;
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
        
        if(opc==instalaciones){
            DIRECTORIO hospitales = new DIRECTORIO();
            hospitales.setVisible(true);
            
        }
        
        if(opc==medicos){
            MEDICOS medicos = new MEDICOS();
            medicos.setVisible(true);
        }
        
        if(opc==eventos){
            AUTENTICACION login = new AUTENTICACION();
            login.setVisible(true);
        }
        
    }

}
