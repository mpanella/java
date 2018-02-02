
package ventanas;
import javax.swing.*;

public class ventana4 extends javax.swing.JFrame {

    
    public ventana4() {
        initComponents();
        setLocationRelativeTo(null);
        //this.setResizable(false);
        this.setTitle("TIPO DE USUARIO: NO REGISTRADO");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotExit = new javax.swing.JButton();
        userLabel = new javax.swing.JLabel();
        DOMdata = new javax.swing.JTextField();
        infoVentana = new javax.swing.JLabel();
        BotAcept = new javax.swing.JButton();
        BotBack = new javax.swing.JButton();
        Fondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotExit.setBackground(new java.awt.Color(255, 0, 0));
        BotExit.setForeground(new java.awt.Color(255, 255, 255));
        BotExit.setText("Salir");
        BotExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotExitActionPerformed(evt);
            }
        });
        getContentPane().add(BotExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        userLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("Dominio: ");
        getContentPane().add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 225, 250, 40));

        DOMdata.setBackground(new java.awt.Color(0, 51, 153));
        DOMdata.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        DOMdata.setForeground(new java.awt.Color(255, 255, 255));
        DOMdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOMdataActionPerformed(evt);
            }
        });
        getContentPane().add(DOMdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 400, 40));

        infoVentana.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        infoVentana.setForeground(new java.awt.Color(255, 255, 255));
        infoVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoVentana.setText("INGRESE EL DOMINIO");
        getContentPane().add(infoVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 720, -1));

        BotAcept.setText("Aceptar");
        BotAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotAceptActionPerformed(evt);
            }
        });
        getContentPane().add(BotAcept, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

        BotBack.setBackground(new java.awt.Color(0, 51, 153));
        BotBack.setForeground(new java.awt.Color(255, 255, 255));
        BotBack.setText("Volver");
        BotBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotBackActionPerformed(evt);
            }
        });
        getContentPane().add(BotBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Fondo.setBackground(new java.awt.Color(0, 102, 255));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 1280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotExitActionPerformed

        int accion = JOptionPane.showConfirmDialog(null,"Seguro que desea salir del programa?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == accion){
        System.exit(0);
        }else{
        this.setVisible(true);
        }
    }//GEN-LAST:event_BotExitActionPerformed

    private void BotAceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotAceptActionPerformed

        String verifyDom = DOMdata.getText();
        
        if(verifyDom.equals("")){
            JOptionPane.showMessageDialog(null, "No ingreso ningun dominio", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
        ventanaResultadoAnom resultAnom = new ventanaResultadoAnom();
        resultAnom.setVisible(true);
        this.setVisible(false);
        }
        
    }//GEN-LAST:event_BotAceptActionPerformed

    private void BotBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotBackActionPerformed
        interfaz ventPrincipal = new interfaz();
        ventPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotBackActionPerformed

    private void DOMdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOMdataActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_DOMdataActionPerformed

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
            java.util.logging.Logger.getLogger(ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ventana4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotAcept;
    private javax.swing.JButton BotBack;
    private javax.swing.JButton BotExit;
    private javax.swing.JTextField DOMdata;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel infoVentana;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
