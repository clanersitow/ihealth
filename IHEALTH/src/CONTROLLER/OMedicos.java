/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

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
   
    public OMedicos(JButton a,JTextField nombre,JTextField apellido,JTextField licenciatura,JTextField especialidad,JTextField departamento,JTextField almaMater) {
        this.atras=a;
        this.nombre=nombre;
        this.apellido=apellido;
        this.licenciatura=licenciatura;
        this.especialidad=especialidad;
        this.departamento=departamento;
        this.almaMater=almaMater;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
