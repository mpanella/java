/*
 * VENTANA DE BUSQUEDA DE DOMINIO DE FUNCIONARIO PUBLICO
 */
package Ventanas;

import Usuarios.tipoUsuario;
import java.awt.EventQueue;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 
 */
public class busquedaFuncionario extends javax.swing.JFrame {

    public static String usuario;
    public static String pas;
    
    public busquedaFuncionario() {

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
        lblDom = new javax.swing.JLabel();
        txtDomNR = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        lblDom.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDom.setText("Dominio:");
        getContentPane().add(lblDom, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        txtDomNR.setBackground(new java.awt.Color(0, 51, 153));
        txtDomNR.setForeground(new java.awt.Color(255, 255, 255));
        txtDomNR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDomNRActionPerformed(evt);
            }
        });
        getContentPane().add(txtDomNR, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 330, 30));

        btnAceptar.setBackground(new java.awt.Color(0, 0, 153));
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue-wallpaper-3.jpg"))); // NOI18N
        Fondo.setText("kmlnlknknnlnnnl");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, -1, -1));

        jTextField2.setText("jTextField2");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, -1, -1));

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

    private void txtDomNRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDomNRActionPerformed

    }//GEN-LAST:event_txtDomNRActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        
        tipoUsuario.dominioActual = txtDomNR.getText();

        try{
      Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/proyectopatentes1",usuario,pas);

    Statement comando = con.createStatement();
     ResultSet registro = comando.executeQuery("select * from dominios where dominio = '"+ txtDomNR.getText()+"'" );    
    
     if(registro.next()==true){
       resultadoFuncionarioPublico.propie= (registro.getString("propietario"));
       resultadoFuncionarioPublico.regis= (registro.getString("registro"));
       resultadoFuncionarioPublico.vtv= (registro.getString("vtv"));
       resultadoFuncionarioPublico.seg= (registro.getString("seguro"));
       resultadoFuncionarioPublico.multas= (registro.getString("multas"));
       resultadoFuncionarioPublico.CA= (registro.getString("cedulaAzul"));
       resultadoFuncionarioPublico.NM= (registro.getString("numMotor"));
       resultadoFuncionarioPublico.NC= (registro.getString("numeroChasis"));
       resultadoFuncionarioPublico.pedido= (registro.getInt("pedidoCaptura"));
        
       resultadoFuncionarioPublico resultNR = new resultadoFuncionarioPublico();
                resultNR.setVisible(true);
                this.setVisible(false);
 
    }
     else{
          txtDomNR.setText(registro.getString(""));
                JOptionPane.showMessageDialog(null, "El dominio ingresado es incorrecto o no existe", "ERROR", JOptionPane.ERROR_MESSAGE);
            
     }
        }catch(Exception e ){
        System.out.println(e.getMessage());
        
        }
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new busquedaFuncionario().setVisible(true);               
            }
        
        }
        
        );
   
   
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblDom;
    private javax.swing.JLabel lblTipoUsuario;
    private javax.swing.JTextField txtDomNR;
    // End of variables declaration//GEN-END:variables

}
