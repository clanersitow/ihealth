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
    PRINCIPAL pricipal;
    public OPrincipal(JButton a,JButton b,JButton c,JButton d,JButton e,PRINCIPAL gui) {
        this.login=a;
        this.registrarse=b;
        this.eventos=c;
        this.medicos=d;
        this.instalaciones=e;
        this.pricipal=gui;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object opc= e.getSource();
       
        if(opc==login){
            AUTENTICACION login = new AUTENTICACION(pricipal);
            login.setVisible(true);
          //  gui.setVisible(false);  or gui.dispose(); // sirve para serrar la ventana principal
        }
        
        if(opc==registrarse){
            REGISTRO registro = new REGISTRO();
            registro.setVisible(true);
        }
        
        if(opc==instalaciones){
            
            DIRECTORIO hospitales = new DIRECTORIO(pricipal);
            hospitales.setVisible(true);
            pricipal.setVisible(false);
            
            
        }
        
        if(opc==medicos){
            MEDICOS medicos = new MEDICOS(pricipal);
            medicos.setVisible(true);
            pricipal.setVisible(false);
            
        }
        
        if(opc==eventos){
            CARTELERA evento = new CARTELERA(pricipal);//pueste que se cerrara la gui principal se envia la referencia 
            evento.setVisible(true);                   //para no perderla y abrirla despues
            pricipal.setVisible(false);
        }
        
    }

}
