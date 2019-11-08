package VIEW;

import CONTROLLER.OPrincipal;
import java.awt.event.ActionListener;

public class PRINCIPAL extends javax.swing.JFrame {

    OPrincipal OPrincipal;
    public PRINCIPAL() {
        initComponents();
        jLabel1.setLayout(null);
        setTitle("IHEALTH");
        setLocation(250,40);
        
        OPrincipal = new OPrincipal(login,registrarse,eventos,medicos,intalaciones);
        login.addActionListener(OPrincipal);
        registrarse.addActionListener(OPrincipal);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrarse = new javax.swing.JButton();
        eventos = new javax.swing.JButton();
        medicos = new javax.swing.JButton();
        intalaciones = new javax.swing.JButton();
        login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrarse.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        registrarse.setText("REGISTRARSE");
        registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseActionPerformed(evt);
            }
        });
        getContentPane().add(registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 110, 30));

        eventos.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        eventos.setText("EVENTOS");
        eventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventosActionPerformed(evt);
            }
        });
        getContentPane().add(eventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 90, 20));

        medicos.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        medicos.setText("MEDICOS");
        medicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicosActionPerformed(evt);
            }
        });
        getContentPane().add(medicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 90, 20));

        intalaciones.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        intalaciones.setText("INSTALACIONES");
        intalaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intalacionesActionPerformed(evt);
            }
        });
        getContentPane().add(intalaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, 20));

        login.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/IMG/PRINCIPAL.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventosActionPerformed

    private void intalacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intalacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intalacionesActionPerformed

    private void medicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicosActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
//        AUTENTICACION login = new AUTENTICACION();
//        login.setVisible(true);
    }//GEN-LAST:event_loginActionPerformed

    private void registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarseActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRINCIPAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eventos;
    private javax.swing.JButton intalaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login;
    private javax.swing.JButton medicos;
    private javax.swing.JButton registrarse;
    // End of variables declaration//GEN-END:variables

}
