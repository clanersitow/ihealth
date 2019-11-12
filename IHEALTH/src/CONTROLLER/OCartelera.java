/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import VIEW.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Alumno
 */
public class OCartelera implements ActionListener {
    JButton atras;
    JTextField descripcion ;
    JTextField fecha ;
    JTextField hora;
    JTextField titulo;
    JTextField ubicacion ;
    
    PRINCIPAL principal;
    CARTELERA cartelera;

    
    
    public OCartelera(JButton a,JTextField descripcion,JTextField fecha,JTextField hora,JTextField titulo,JTextField ubicacion,PRINCIPAL principal, CARTELERA cartelera) {
        this.atras=a;
        this.descripcion=descripcion;
        this.fecha=fecha;
        this.hora=hora;
        this.titulo=titulo;
        this.ubicacion=ubicacion;
        this.principal=principal;
        this.cartelera=cartelera;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        principal.setVisible(true);  //boton atras implementado
        cartelera.setVisible(false);
                
//            public void actionPerformed (ActionEvent e){
//    String seleccion = (String) list.getSelectedItem();
//    txt.setText("Selección: "+seleccion);
//  }    codigo para la recuperacion de la seleccion
                
                
                
                
    }
}
