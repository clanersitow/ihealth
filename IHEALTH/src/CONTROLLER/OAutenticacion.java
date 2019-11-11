package CONTROLLER;
import VIEW.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.*;

public class OAutenticacion  implements ActionListener{
    JTextField usuario;
    JPasswordField contraseña;
    ButtonGroup b;

    
    public OAutenticacion(JTextField u, JPasswordField c, ButtonGroup b){
        this.usuario=u;
        this.contraseña=c;
        this.b=b;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
//        AUTENTICACION login = new AUTENTICACION();
//        login.setVisible(true);
//public class GroupButtonUtils { 
//    public String getSelectedButtonText(ButtonGroup buttonGroup) { 
//        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) { 
//            AbstractButton button = buttons.nextElement(); 
//            if (button.isSelected()) { 
//                return button.getText(); } 
//        } return null; } }



       

        String valor = new String(contraseña.getPassword());
        System.out.println("usuario: "+this.usuario.getText()+"\ncontraseña: "+valor);
        
    }
}
