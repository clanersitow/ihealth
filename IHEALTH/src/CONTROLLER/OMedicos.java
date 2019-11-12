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
public class OMedicos implements ActionListener{
    JButton atras;
    JTextField nombre ;
    JTextField apellido ;
    JTextField licenciatura;
    JTextField especialidad;
    JTextField departamento ;
    JTextField almaMater;
    
    PRINCIPAL principal;
    MEDICOS medicos;
   
    public OMedicos(JButton a,JTextField nombre,JTextField apellido,JTextField licenciatura,JTextField especialidad,JTextField departamento,JTextField almaMater,PRINCIPAL principal,MEDICOS gui) {
        this.atras=a;
        this.nombre=nombre;
        this.apellido=apellido;
        this.licenciatura=licenciatura;
        this.especialidad=especialidad;
        this.departamento=departamento;
        this.almaMater=almaMater;
        this.principal=principal;
        this.medicos=gui;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        principal.setVisible(true);  //boton atras implementado
        medicos.setVisible(false);

    }
    
    
    
    
    
    
}
