/*
 * Ventana de ingreso de funcionario publico
 */
package Ventanas;

import Usuarios.tipoUsuario;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class FuncionarioPublico extends javax.swing.JFrame {

    public FuncionarioPublico() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("USUARIO: FUNCIONARIO PUBLICO");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtras = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblTipoUsuario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtras.setBackground(new java.awt.Color(0, 0, 255));
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        lblTipoUsuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTipoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoUsuario.setText("FUNCIONARIO PUBLICO");
        getContentPane().add(lblTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 800, -1));

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblUsuario.setText("ID:");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(0, 51, 153));
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 340, 30));

        lblPass.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblPass.setText("Contraseña:");
        getContentPane().add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        txtPass.setBackground(new java.awt.Color(0, 51, 153));
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 340, 30));

        btnAceptar.setBackground(new java.awt.Color(0, 0, 153));
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue-wallpaper-3.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Principal ventPrincipal = new Principal();
        ventPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int accion = JOptionPane.showConfirmDialog(null,"Seguro que desea salir del programa?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == accion){
            System.exit(0);
        }else{
            this.setVisible(true);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

          busquedaFuncionario.usuario = txtUsuario.getText();
          busquedaFuncionario.pas = txtPass.getText();
          
           busquedaFuncionario busqueda = new busquedaFuncionario();
                busqueda.setVisible(true);
                this.setVisible(false);
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(FuncionarioPublico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioPublico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioPublico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioPublico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioPublico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblTipoUsuario;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
