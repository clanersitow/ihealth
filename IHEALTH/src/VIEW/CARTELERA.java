
package VIEW;
import CONTROLLER.*;
import javax.swing.JButton;
import javax.swing.JTextField;

public class CARTELERA extends javax.swing.JFrame {

    OCartelera oyente;
    
    public CARTELERA() {
        initComponents();
        
    }
    
    public CARTELERA(PRINCIPAL p) {
        initComponents();
        
        setLocation(250,40);
        oyente = new OCartelera(atras,descripcion,fecha, hora, titulo, ubicacion, p,this);
        atras.addActionListener(oyente);
        
        
        titulo.setEditable(false);
        descripcion.setEditable(false);
        ubicacion.setEditable(false);
        fecha.setEditable(false);
        hora.setEditable(false);
        eventos.addItem("HopitalPrueba");//creacion de prueba, borrar fase final 
        eventos.addItem("HopitalPrueba2");//creacion de prueba, borrar fase final         
        
        
        
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextField();
        fecha = new javax.swing.JTextField();
        ubicacion = new javax.swing.JTextField();
        hora = new javax.swing.JTextField();
        eventos = new javax.swing.JComboBox();
        atras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MEDICOS");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Titulo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jLabel3.setText("Descripcion:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        jLabel4.setText("Fecha:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, 20));

        jLabel5.setText("Ubicacion:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        jLabel6.setText("Hora:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, -1, -1));
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 430, 30));

        descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionActionPerformed(evt);
            }
        });
        jPanel1.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 430, 70));
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 170, 30));
        jPanel1.add(ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 430, 60));
        jPanel1.add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 160, 30));

        eventos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        jPanel1.add(eventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 150, 40));

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/IMG/ATRAS.png"))); // NOI18N
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 40, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/IMG/HOSPITALES.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 530));

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

    private void descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atrasActionPerformed

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
            java.util.logging.Logger.getLogger(CARTELERA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CARTELERA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CARTELERA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CARTELERA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CARTELERA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JTextField descripcion;
    private javax.swing.JComboBox<String> eventos;
    private javax.swing.JTextField fecha;
    private javax.swing.JTextField hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField titulo;
    private javax.swing.JTextField ubicacion;
    // End of variables declaration//GEN-END:variables
}
