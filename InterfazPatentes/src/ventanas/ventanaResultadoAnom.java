/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author 
 */
public class ventanaResultadoAnom extends javax.swing.JFrame{

    /**
     * Creates new form ventanaResultadoAnom
     */
    public ventanaResultadoAnom() {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.setResizable(false);
        this.setTitle("Resultado");
        
        ventana1 vent4 = new ventana1();
        
        dominioIngresado.setText("DOMINIO INGRESADO: " + vent4.envioDomData);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        infoVentana = new javax.swing.JLabel();
        infoVentana1 = new javax.swing.JLabel();
        BotExit = new javax.swing.JButton();
        BotBack = new javax.swing.JButton();
        labelCaptura = new javax.swing.JLabel();
        labelDetencion = new javax.swing.JLabel();
        labelRegistro = new javax.swing.JLabel();
        labelMultas = new javax.swing.JLabel();
        dominioIngresado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoVentana.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        infoVentana.setForeground(new java.awt.Color(255, 255, 255));
        infoVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoVentana.setText("RESULTADO DE ANALISIS");
        getContentPane().add(infoVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 720, -1));

        infoVentana1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        infoVentana1.setForeground(new java.awt.Color(255, 255, 255));
        infoVentana1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoVentana1.setText("USUARIO NO REGISTRADO");
        getContentPane().add(infoVentana1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 720, -1));

        BotExit.setBackground(new java.awt.Color(255, 0, 0));
        BotExit.setForeground(new java.awt.Color(255, 255, 255));
        BotExit.setText("Salir");
        BotExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotExitActionPerformed(evt);
            }
        });
        getContentPane().add(BotExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        BotBack.setBackground(new java.awt.Color(0, 51, 153));
        BotBack.setForeground(new java.awt.Color(255, 255, 255));
        BotBack.setText("Volver");
        BotBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotBackActionPerformed(evt);
            }
        });
        getContentPane().add(BotBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        labelCaptura.setBackground(new java.awt.Color(0, 0, 0));
        labelCaptura.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelCaptura.setForeground(new java.awt.Color(255, 255, 255));
        labelCaptura.setText("PEDIDO DE CAPTURA");
        getContentPane().add(labelCaptura, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        labelDetencion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelDetencion.setForeground(new java.awt.Color(255, 255, 255));
        labelDetencion.setText("PEDIDO DE DETENCION");
        getContentPane().add(labelDetencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        labelRegistro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelRegistro.setForeground(new java.awt.Color(255, 255, 255));
        labelRegistro.setText("REGISTRO PROFESIONAL");
        getContentPane().add(labelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        labelMultas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelMultas.setForeground(new java.awt.Color(255, 255, 255));
        labelMultas.setText("ESTADO DE MULTAS");
        getContentPane().add(labelMultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, -1, -1));

        dominioIngresado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(dominioIngresado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 330, 30));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 300, 30));

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

    private void BotBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotBackActionPerformed
        principal ventPrincipal = new principal();
        ventPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotBackActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaResultadoAnom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaResultadoAnom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaResultadoAnom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaResultadoAnom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaResultadoAnom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotBack;
    private javax.swing.JButton BotExit;
    public static javax.swing.JLabel dominioIngresado;
    private javax.swing.JLabel infoVentana;
    private javax.swing.JLabel infoVentana1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelCaptura;
    private javax.swing.JLabel labelDetencion;
    private javax.swing.JLabel labelMultas;
    private javax.swing.JLabel labelRegistro;
    // End of variables declaration//GEN-END:variables
}
