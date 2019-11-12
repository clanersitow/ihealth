package CONTROLLER;

import VIEW.DIRECTORIO;
import VIEW.*;
import VIEW.PRINCIPAL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ODirectorio implements ActionListener{

    JButton atras;
    JTextField nombre ;
    JTextField ubicacion ;
    
    PRINCIPAL principal;
    DIRECTORIO hospitales;
   
    public ODirectorio(JButton a,JTextField nombre,JTextField ubicacion,PRINCIPAL principal,DIRECTORIO gui) {
        this.atras=a;
        this.nombre=nombre;
        this.ubicacion=ubicacion;
        this.principal=principal;
        this.hospitales=gui;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

        principal.setVisible(true);  //boton atras implementado
        hospitales.setVisible(false);
    }

    
}
