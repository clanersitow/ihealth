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
    PRINCIPAL principal;
    AUTENTICACION autenticacion;
    
    JRadioButton enfermera ;
    JRadioButton laboratorista ;
    JRadioButton medico;
    JRadioButton paciente;
    JRadioButton recepcionista;
    JRadioButton opc ;
    
    public OAutenticacion(JTextField u, JPasswordField c, JRadioButton enfermera,JRadioButton laboratorista,JRadioButton medico,JRadioButton paciente,JRadioButton recepcionista,PRINCIPAL principal,AUTENTICACION autenticacion){
        this.usuario=u;
        this.contraseña=c;
        
        this.enfermera=enfermera;
        this.laboratorista=laboratorista;
        this.medico=medico;
        this.paciente=paciente;
        this.recepcionista=recepcionista;
        
        this.principal=principal;
        this.autenticacion=autenticacion;
    }
//    public OAutenticacion(JTextField u, JPasswordField c, ButtonGroup b){
//        this.usuario=u;
//        this.contraseña=c;
//        this.b=b;
//        
//    }
    @Override
    public void actionPerformed(ActionEvent e) {
//        Object opc= e.getSource();
//        if(opc==enfermera){
//            System.out.println("enfermera");
//        }
//        
//        if(opc==laboratorista){
//            System.out.println("laboratorista");
//        }
//        
//        if(opc==medico){
//            System.out.println("medico");
//            
//            
//        }
//        
//        if(opc==paciente){
//            System.out.println("paciente");
//        }
//        
//        if(opc==recepcionista){
//            System.out.println("recepcionista");
//        } 
//        
//        principal.dispose();
//        autenticacion.dispose();
//        System.out.println("");
//        enfermera.getAction();
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
        System.out.println("\nusuario: "+this.usuario.getText()+"\ncontraseña: "+valor);
        
    }
}
