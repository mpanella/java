/*
 * RESULTADO DE BUSQUEDA DE USUARIO REGISTRADO
 */
package Ventanas;

import javax.swing.JOptionPane;

/**
 *
 * @author Facundo Fulco
 */
public class resultadoRegistrado extends javax.swing.JFrame {

    /**
     * Creates new form resultadoRegistrado
     */
    public resultadoRegistrado() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("RESULTADO - USUARIO REGISTRADO");  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtras = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblTipoUsuario = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblCaptura = new javax.swing.JLabel();
        lblDetencion = new javax.swing.JLabel();
        lblChasis = new javax.swing.JLabel();
        lblMotor = new javax.swing.JLabel();
        lblRegistro = new javax.swing.JLabel();
        lblMultas = new javax.swing.JLabel();
        lblNotas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotas = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
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

        lblTipoUsuario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTipoUsuario.setText("USUARIO: REGISTRADO");
        getContentPane().add(lblTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("RESULTADO DE ANALISIS");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 800, -1));

        lblCaptura.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblCaptura.setText("PEDIDO DE CAPTURA:");
        getContentPane().add(lblCaptura, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        lblDetencion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDetencion.setText("PEDIDO DE DETENCION:");
        getContentPane().add(lblDetencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        lblChasis.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblChasis.setText("NUMERO DE CHASIS:");
        getContentPane().add(lblChasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        lblMotor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblMotor.setText("NUMERO DE MOTOR:");
        getContentPane().add(lblMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        lblRegistro.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblRegistro.setText("REGISTRO PROFESIONAL:");
        getContentPane().add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        lblMultas.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblMultas.setText("ESTADO DE MULTAS:");
        getContentPane().add(lblMultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        lblNotas.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblNotas.setText("NOTAS:");
        getContentPane().add(lblNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        txtNotas.setColumns(20);
        txtNotas.setRows(5);
        jScrollPane1.setViewportView(txtNotas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 740, 230));

        jButton1.setBackground(new java.awt.Color(0, 51, 153));
        jButton1.setForeground(new java.awt.Color(250, 250, 250));
        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 750, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        busquedaRegistrado busReg = new busquedaRegistrado();
        busReg.setVisible(true);
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(resultadoRegistrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultadoRegistrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultadoRegistrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultadoRegistrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultadoRegistrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCaptura;
    private javax.swing.JLabel lblChasis;
    private javax.swing.JLabel lblDetencion;
    private javax.swing.JLabel lblMotor;
    private javax.swing.JLabel lblMultas;
    private javax.swing.JLabel lblNotas;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblTipoUsuario;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtNotas;
    // End of variables declaration//GEN-END:variables
}