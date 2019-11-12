
package VIEW;
import CONTROLLER.*;

public class DIRECTORIO extends javax.swing.JFrame {

    ODirectorio oyente;
    
    public DIRECTORIO() {
        initComponents();
    }
    
    public DIRECTORIO(PRINCIPAL p) {
        initComponents();

        setLocation(250,40);
        
        oyente = new ODirectorio(atras,nombre,ubicacion,p,this);
        atras.addActionListener(oyente);
        
        nombre.setEditable(false);
        ubicacion.setEditable(false);
        hospitales.addItem("HopitalPrueba");//creacion de prueba, borrar fase final 
        hospitales.addItem("HopitalPrueba2");//creacion de prueba, borrar fase final 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        hospitales = new javax.swing.JComboBox();
        nombre = new javax.swing.JTextField();
        ubicacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DIRECTORIO DE HOSPITALES");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("NOMBRE:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/IMG/HP.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 450, 170));

        jLabel6.setText("UBICACION:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/IMG/ATRAS.png"))); // NOI18N
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 40, -1));

        hospitales.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        jPanel1.add(hospitales, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 150, 40));
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 390, 30));

        ubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicacionActionPerformed(evt);
            }
        });
        jPanel1.add(ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 390, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/IMG/HOSPITALES.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atrasActionPerformed

    private void ubicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubicacionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DIRECTORIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DIRECTORIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DIRECTORIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DIRECTORIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DIRECTORIO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JComboBox<String> hospitales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField ubicacion;
    // End of variables declaration//GEN-END:variables
}
