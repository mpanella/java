/*
 * Ventana principal del programa
 */
package Ventanas;

import Usuarios.tipoUsuario;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Facundo Fulco
 */
public class Principal extends javax.swing.JFrame {
    
    // llama coneccion;
     
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("PROYECTO PATENTES v1.0.0 BETA");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        lblSelectUser = new javax.swing.JLabel();
        btnNoRegistrado = new javax.swing.JButton();
        btnRegistrado = new javax.swing.JButton();
        btnFuncionarioPublico = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("PROYECTO PATENTES");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 800, 30));

        lblSelectUser.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblSelectUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSelectUser.setText("Seleccione el tipo de usuario");
        getContentPane().add(lblSelectUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 800, -1));

        btnNoRegistrado.setBackground(new java.awt.Color(0, 51, 153));
        btnNoRegistrado.setForeground(new java.awt.Color(255, 255, 255));
        btnNoRegistrado.setText("No registrado");
        btnNoRegistrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoRegistradoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNoRegistrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 290, 40));

        btnRegistrado.setBackground(new java.awt.Color(0, 51, 153));
        btnRegistrado.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrado.setText("Registrado");
        btnRegistrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistradoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 290, 40));

        btnFuncionarioPublico.setBackground(new java.awt.Color(0, 51, 153));
        btnFuncionarioPublico.setForeground(new java.awt.Color(255, 255, 255));
        btnFuncionarioPublico.setText("Funcionario Publico");
        btnFuncionarioPublico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarioPublicoActionPerformed(evt);
            }
        });
        getContentPane().add(btnFuncionarioPublico, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 290, 40));

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue-wallpaper-3.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNoRegistradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoRegistradoActionPerformed
        tipoUsuario.valorUsuario = 0;
        NoRegistrado vent2 = new NoRegistrado();
        vent2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNoRegistradoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int accion = JOptionPane.showConfirmDialog(null,"Seguro que desea salir del programa?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == accion){
        System.exit(0);
        }else{
        this.setVisible(true);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistradoActionPerformed
        tipoUsuario.valorUsuario = 1;
        Registrado vent3 = new Registrado();
        vent3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistradoActionPerformed

    private void btnFuncionarioPublicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarioPublicoActionPerformed
        tipoUsuario.valorUsuario = 2;
        FuncionarioPublico vent4 = new FuncionarioPublico();
        vent4.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnFuncionarioPublicoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Title;
    private javax.swing.JButton btnFuncionarioPublico;
    private javax.swing.JButton btnNoRegistrado;
    private javax.swing.JButton btnRegistrado;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblSelectUser;
    // End of variables declaration//GEN-END:variables
}
