package ventanas;
import javax.swing.*;
/**
 *
 * @author Facundo Fulco
 */

public class interfaz extends javax.swing.JFrame {
    
    
    Coneccion con = new Coneccion();

    public interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("PROYECTO PATENTES v1.0.0 BETA");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonExit = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelPaso1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JPanel();
        UsuarioPolicia = new javax.swing.JButton();
        UsuarioPublico = new javax.swing.JButton();
        UsuarioPublico1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonExit.setBackground(new java.awt.Color(255, 0, 51));
        jButtonExit.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonExit.setText("Salir");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("BIENVENIDO AL \"PROYECTO PATENTES\"");
        jLabelTitulo.setAlignmentY(0.0F);
        jLabelTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 720, 50));

        jLabelPaso1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabelPaso1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPaso1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPaso1.setText("Por favor, seleccione el tipo de usuario");
        getContentPane().add(jLabelPaso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 720, -1));

        Fondo.setBackground(new java.awt.Color(0, 102, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsuarioPolicia.setText("FUNCIONARIO PUBLICO");
        UsuarioPolicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioPoliciaActionPerformed(evt);
            }
        });
        Fondo.add(UsuarioPolicia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 900, 290, 60));

        UsuarioPublico.setText("USUARIO REGISTRADO");
        UsuarioPublico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioPublicoActionPerformed(evt);
            }
        });
        Fondo.add(UsuarioPublico, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 820, 290, 60));

        UsuarioPublico1.setText("ANONIMO");
        UsuarioPublico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioPublico1ActionPerformed(evt);
            }
        });
        Fondo.add(UsuarioPublico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 740, 290, 60));

        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 1280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        
        int accion = JOptionPane.showConfirmDialog(null,"Seguro que desea salir del programa?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == accion){
        System.exit(0);
        }else{
        this.setVisible(true);
        }
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void UsuarioPublicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioPublicoActionPerformed
        ventana2 publicUser = new ventana2();
        publicUser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_UsuarioPublicoActionPerformed

    private void UsuarioPoliciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioPoliciaActionPerformed
        ventana3 vent3 = new ventana3();
        vent3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_UsuarioPoliciaActionPerformed

    private void UsuarioPublico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioPublico1ActionPerformed
        // TODO add your handling code here:
        ventana4 anomUser = new ventana4();
        anomUser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_UsuarioPublico1ActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton UsuarioPolicia;
    private javax.swing.JButton UsuarioPublico;
    private javax.swing.JButton UsuarioPublico1;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabelPaso1;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
