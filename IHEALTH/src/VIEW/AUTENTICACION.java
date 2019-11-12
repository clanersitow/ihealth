/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CONTROLLER.*;


public class AUTENTICACION extends javax.swing.JFrame {

    OAutenticacion OAutenticacion;
    
    //constructor para la creacion de la gui sin referencias
    public AUTENTICACION() {
        initComponents();
//        setLocation(550,200);
//        OAutenticacion OAutenticacion= new OAutenticacion(usuario,contraseña,tipoUsuario);
//        login.addActionListener(OAutenticacion);
    }
    
    //constructor para la creacion de la gui pasando como refernecia asi misma y principal
    public AUTENTICACION(PRINCIPAL a) {
        initComponents();
        setLocation(550,200);        
        OAutenticacion OAutenticacion= new OAutenticacion(usuario,contraseña,enfermera,laboratorista,medico,paciente,recepcionista,a,this);
        login.addActionListener(OAutenticacion);
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoUsuario = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        usuario1 = new javax.swing.JLabel();
        contraseña1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        paciente = new javax.swing.JRadioButton();
        medico = new javax.swing.JRadioButton();
        recepcionista = new javax.swing.JRadioButton();
        enfermera = new javax.swing.JRadioButton();
        laboratorista = new javax.swing.JRadioButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LOGIN");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        usuario1.setText("Usuario:");
        jPanel2.add(usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        contraseña1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        contraseña1.setText("Contraseña:");
        jPanel2.add(contraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Tipo de Usuario:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));
        jPanel2.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 140, -1));

        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        jPanel2.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 120, -1));

        login.setText("ACEPTAR");
        jPanel2.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        tipoUsuario.add(paciente);
        paciente.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        paciente.setText("Paciente");
        jPanel2.add(paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        tipoUsuario.add(medico);
        medico.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        medico.setText("Medico");
        jPanel2.add(medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        tipoUsuario.add(recepcionista);
        recepcionista.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        recepcionista.setText("Recepcionista");
        jPanel2.add(recepcionista, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        tipoUsuario.add(enfermera);
        enfermera.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        enfermera.setText("Enfermera");
        jPanel2.add(enfermera, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        laboratorista.setText("Laboratorista");
        jPanel2.add(laboratorista, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/IMG/LOGIN_1.png"))); // NOI18N
        jPanel2.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AUTENTICACION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel contraseña1;
    private javax.swing.JRadioButton enfermera;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton laboratorista;
    private javax.swing.JButton login;
    private javax.swing.JRadioButton medico;
    private javax.swing.JRadioButton paciente;
    private javax.swing.JRadioButton recepcionista;
    private javax.swing.ButtonGroup tipoUsuario;
    private javax.swing.JTextField usuario;
    private javax.swing.JLabel usuario1;
    // End of variables declaration//GEN-END:variables
}
