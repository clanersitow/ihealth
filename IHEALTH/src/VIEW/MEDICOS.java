
package VIEW;
import CONTROLLER.*;
import javax.swing.*;

public class MEDICOS extends javax.swing.JFrame {

    public MEDICOS() {
        initComponents();
        
        setLocation(250,40);

        medicos.addItem("DoctorPrueba"); //creacion de prueba, borrar fase final   
        medicos.addItem("DoctorPrueba2");//creacion de prueba, borrar fase final 
        nombre.setEditable(false);  // envitamos que el usuario pueda modificar iformacion ya que lo que 
        apellido.setEditable(false); // le debe interesar es solo visualizar la informacion
        departamento.setEditable(false);
        especialidad.setEditable(false);
        licenciatura.setEditable(false);
        almaMater.setEditable(false);        
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        licenciatura = new javax.swing.JTextField();
        especialidad = new javax.swing.JTextField();
        departamento = new javax.swing.JTextField();
        almaMater = new javax.swing.JTextField();
        n = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        l = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        Mater = new javax.swing.JLabel();
        medicos = new javax.swing.JComboBox();
        atras = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MEDICOS");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 280, 30));
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 280, 30));
        jPanel1.add(licenciatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 280, 30));
        jPanel1.add(especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 280, 30));
        jPanel1.add(departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 280, 30));
        jPanel1.add(almaMater, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 280, 30));

        n.setText("Nombre:");
        jPanel1.add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        a.setText("Apellido:");
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        l.setText("Licenciatura:");
        jPanel1.add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        e.setText("Especialidad: ");
        jPanel1.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));

        d.setText("Departamento:");
        jPanel1.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

        Mater.setText("AlmaMater:");
        jPanel1.add(Mater, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));

        medicos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        jPanel1.add(medicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 150, 40));

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/IMG/ATRAS.png"))); // NOI18N
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 40, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/IMG/MEDICOS.png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            java.util.logging.Logger.getLogger(MEDICOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MEDICOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MEDICOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MEDICOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MEDICOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mater;
    private javax.swing.JLabel a;
    private javax.swing.JTextField almaMater;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton atras;
    private javax.swing.JLabel d;
    private javax.swing.JTextField departamento;
    private javax.swing.JLabel e;
    private javax.swing.JTextField especialidad;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l;
    private javax.swing.JTextField licenciatura;
    private javax.swing.JComboBox<String> medicos;
    private javax.swing.JLabel n;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables


}
