package VIEW;

public class PRINCIPAL extends javax.swing.JFrame {

    public PRINCIPAL() {
        initComponents();
        jLabel1.setLayout(null);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrarse = new javax.swing.JButton();
        especialidades = new javax.swing.JButton();
        medico = new javax.swing.JButton();
        directorio = new javax.swing.JButton();
        login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        getContentPane().add(registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 110, 30));

        especialidades.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        especialidades.setText("ESPECIALIDADES");
        especialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(especialidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 160, 30));

        medico.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        medico.setText("MEDICO");
        medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicoActionPerformed(evt);
            }
        });
        getContentPane().add(medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 130, 30));

        directorio.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        directorio.setText("DIRECTORIO");
        directorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directorioActionPerformed(evt);
            }
        });
        getContentPane().add(directorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 140, 30));

        login.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 80, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/IMG/FPrincipal.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 130, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/IMG/FPrincipal.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 90, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/IMG/PRINCIPAL.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void especialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especialidadesActionPerformed

    private void directorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_directorioActionPerformed

    private void medicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicoActionPerformed

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
    private javax.swing.JButton directorio;
    private javax.swing.JButton especialidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton login;
    private javax.swing.JButton medico;
    private javax.swing.JButton registrarse;
    // End of variables declaration//GEN-END:variables

}
