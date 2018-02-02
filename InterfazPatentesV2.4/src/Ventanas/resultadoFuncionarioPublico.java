/*
 * VENTANA DE RESULTADO DE BUSQUEDA DE FUNCIONARIO PUBLICO
 */
package Ventanas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Usuarios.tipoUsuario;
import static Usuarios.tipoUsuario.dominioActual;
import static Usuarios.tipoUsuario.valorUsuario;
import static Ventanas.resultadoFuncionarioPublico.notas;

/**
 *
 * @author 
 */
public class resultadoFuncionarioPublico extends javax.swing.JFrame {
    public static String propie;
    public static String regis;
    public static String vtv;
    public static String seg;
    public static String multas;
    public static String CA;
    public static String NM;
    public static String NC;
    public static int pedido;
    public static int privilegios1;
    public static String notas;
    
    
    
    public resultadoFuncionarioPublico() {
        
        
         
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("RESULTADO - FUNCIONARIO PUBLICO");
        
        if (pedido == 1 ){
        this.getContentPane().setBackground(Color.BLUE);
        }
        if (pedido == 2 ){
        this.getContentPane().setBackground(Color.YELLOW);
        }
        if (pedido == 3 ){
        this.getContentPane().setBackground(Color.RED);
        }
        
        if(seg.equalsIgnoreCase("si")){
            lblSeguroData.setForeground(Color.GREEN);
        }else{
            lblSeguroData.setForeground(Color.RED);
        }
        
        lblDominioActual.setText(String.valueOf(""+dominioActual));
        lblValorUsuario.setText(String.valueOf(""+valorUsuario));
        
        
            lblPropietarioData.setText(String.valueOf(""+propie));
            lblRegistroData.setText(String.valueOf(""+regis));
        
       
            lblPropietarioData.setText(String.valueOf(""+propie));
            lblRegistroData.setText(String.valueOf(""+regis));
            lblVTVData.setText(String.valueOf(""+vtv));
            lblSeguroData.setText(String.valueOf(""+seg));
            lblMultasData.setText(String.valueOf(""+multas));
            lblCedulaAzulData.setText(String.valueOf(""+CA));
            lblMotorData.setText(String.valueOf(""+NM));
            lblChasisData.setText(String.valueOf(""+NC));
            lblCapturaData.setText(String.valueOf(""+pedido));
            lblDetencionData.setText(String.valueOf(""+pedido));
            lblNotasData.setText(String.valueOf(""+notas));
        
            txtNotasData.setVisible(false);
            btnEnviarNotas.setVisible(false);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblPropietarioData1 = new javax.swing.JLabel();
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
        lblPropietario = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblVTV = new javax.swing.JLabel();
        CedulaAzul = new javax.swing.JLabel();
        lblSeguro = new javax.swing.JLabel();
        lblNotas = new javax.swing.JLabel();
        lblDetencionData = new javax.swing.JLabel();
        lblPropietarioData = new javax.swing.JLabel();
        lblDominioActual = new javax.swing.JLabel();
        lblRegistroData = new javax.swing.JLabel();
        lblVTVData = new javax.swing.JLabel();
        lblSeguroData = new javax.swing.JLabel();
        lblMultasData = new javax.swing.JLabel();
        lblCedulaAzulData = new javax.swing.JLabel();
        lblMotorData = new javax.swing.JLabel();
        lblChasisData = new javax.swing.JLabel();
        lblCapturaData = new javax.swing.JLabel();
        lblDniData = new javax.swing.JLabel();
        lblValorUsuario = new javax.swing.JLabel();
        lblNotasData = new javax.swing.JLabel();
        btnIngresarNota = new javax.swing.JButton();
        txtNotasData = new javax.swing.JTextField();
        btnEnviarNotas = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        lblPropietarioData1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPropietarioData1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPropietarioData1.setText("//-----");

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
        lblTipoUsuario.setText("USUARIO: FUNCIONARIO PUBLICO");
        getContentPane().add(lblTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 290, -1));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("RESULTADO DE ANALISIS");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 350, -1));

        lblCaptura.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblCaptura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCaptura.setText("PEDIDO DE CAPTURA:");
        getContentPane().add(lblCaptura, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 190, -1));

        lblDetencion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDetencion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDetencion.setText("PEDIDO DE DETENCION:");
        getContentPane().add(lblDetencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        lblChasis.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblChasis.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblChasis.setText("NUMERO DE CHASIS:");
        getContentPane().add(lblChasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        lblMotor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblMotor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMotor.setText("NUMERO DE MOTOR:");
        getContentPane().add(lblMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        lblRegistro.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblRegistro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRegistro.setText("REGISTRO PROFESIONAL:");
        getContentPane().add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        lblMultas.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblMultas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMultas.setText("ESTADO DE MULTAS:");
        getContentPane().add(lblMultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        lblPropietario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPropietario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPropietario.setText("PROPIETARIO:");
        getContentPane().add(lblPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        lblDni.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDni.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDni.setText("DNI:");
        getContentPane().add(lblDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        lblVTV.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblVTV.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblVTV.setText("V.T.V.:");
        getContentPane().add(lblVTV, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        CedulaAzul.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CedulaAzul.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CedulaAzul.setText("CEDULAS AZULES:");
        getContentPane().add(CedulaAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        lblSeguro.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblSeguro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSeguro.setText("SEGURO AL DIA:");
        getContentPane().add(lblSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        lblNotas.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblNotas.setText("NOTAS:");
        getContentPane().add(lblNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        lblDetencionData.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDetencionData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDetencionData.setText("//-----");
        getContentPane().add(lblDetencionData, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 320, 30));

        lblPropietarioData.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPropietarioData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPropietarioData.setText("//-----");
        getContentPane().add(lblPropietarioData, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 320, 30));

        lblDominioActual.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lblDominioActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblDominioActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 330, 30));

        lblRegistroData.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblRegistroData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistroData.setText("//-----");
        getContentPane().add(lblRegistroData, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 320, 30));

        lblVTVData.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblVTVData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVTVData.setText("//-----");
        getContentPane().add(lblVTVData, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 320, 30));

        lblSeguroData.setBackground(new java.awt.Color(255, 255, 255));
        lblSeguroData.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblSeguroData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSeguroData.setText("//-----");
        getContentPane().add(lblSeguroData, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 320, 30));

        lblMultasData.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblMultasData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMultasData.setText("//-----");
        getContentPane().add(lblMultasData, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 320, 30));

        lblCedulaAzulData.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblCedulaAzulData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCedulaAzulData.setText("//-----");
        getContentPane().add(lblCedulaAzulData, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 320, 30));

        lblMotorData.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblMotorData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMotorData.setText("//-----");
        getContentPane().add(lblMotorData, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 320, 30));

        lblChasisData.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblChasisData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChasisData.setText("//-----");
        getContentPane().add(lblChasisData, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 320, 30));

        lblCapturaData.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblCapturaData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCapturaData.setText("//-----");
        getContentPane().add(lblCapturaData, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 320, 30));

        lblDniData.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDniData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDniData.setText("//-----");
        getContentPane().add(lblDniData, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 320, 30));

        lblValorUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorUsuario.setText("---");
        getContentPane().add(lblValorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 50, 30));

        lblNotasData.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblNotasData, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 750, 210));

        btnIngresarNota.setBackground(new java.awt.Color(0, 0, 255));
        btnIngresarNota.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarNota.setText("Agregar notas");
        btnIngresarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarNotaActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, -1, -1));
        getContentPane().add(txtNotasData, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 750, 90));

        btnEnviarNotas.setBackground(new java.awt.Color(0, 0, 255));
        btnEnviarNotas.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviarNotas.setText("Enviar");
        btnEnviarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarNotasActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviarNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        busquedaFuncionario busFP = new busquedaFuncionario();
        busFP.setVisible(true);
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

    private void btnIngresarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarNotaActionPerformed
        lblNotasData.setVisible(false);
        btnIngresarNota.setVisible(false);
        
        txtNotasData.setVisible(true);
        btnEnviarNotas.setVisible(true);
    }//GEN-LAST:event_btnIngresarNotaActionPerformed

    private void btnEnviarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarNotasActionPerformed

       lblNotasData.setVisible(true);
        btnIngresarNota.setVisible(true);
        
        txtNotasData.setVisible(false);
        btnEnviarNotas.setVisible(false);
        
         try{
      Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/proyectopatentes1","root", "");

    Statement comando = con.createStatement();
    comando.executeUpdate("UPDATE dominios SET notas='"+txtNotasData.getText()+"' WHERE dominio='"+lblDominioActual.getText()+"'" );  
    
     ResultSet registro = comando.executeQuery("select * from dominios where dominio = '"+ lblDominioActual.getText()+"'" ); 
     notas=(registro.getString("notas"));
    
     lblNotasData.setText(String.valueOf(""+notas));
    
     
      }catch(Exception e ){
        System.out.println(e.getMessage());
        
        }
                                                  
         
    }//GEN-LAST:event_btnEnviarNotasActionPerformed
 
    
    
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
            java.util.logging.Logger.getLogger(resultadoFuncionarioPublico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultadoFuncionarioPublico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultadoFuncionarioPublico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultadoFuncionarioPublico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
    
                
                new resultadoFuncionarioPublico().setVisible(true);
                
                
        
                
            }

            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CedulaAzul;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEnviarNotas;
    private javax.swing.JButton btnIngresarNota;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCaptura;
    private javax.swing.JLabel lblCapturaData;
    private javax.swing.JLabel lblCedulaAzulData;
    private javax.swing.JLabel lblChasis;
    private javax.swing.JLabel lblChasisData;
    private javax.swing.JLabel lblDetencion;
    private javax.swing.JLabel lblDetencionData;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblDniData;
    private javax.swing.JLabel lblDominioActual;
    private javax.swing.JLabel lblMotor;
    private javax.swing.JLabel lblMotorData;
    private javax.swing.JLabel lblMultas;
    private javax.swing.JLabel lblMultasData;
    private javax.swing.JLabel lblNotas;
    private javax.swing.JLabel lblNotasData;
    private javax.swing.JLabel lblPropietario;
    private javax.swing.JLabel lblPropietarioData;
    private javax.swing.JLabel lblPropietarioData1;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblRegistroData;
    private javax.swing.JLabel lblSeguro;
    private javax.swing.JLabel lblSeguroData;
    private javax.swing.JLabel lblTipoUsuario;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVTV;
    private javax.swing.JLabel lblVTVData;
    private javax.swing.JLabel lblValorUsuario;
    private javax.swing.JTextField txtNotasData;
    // End of variables declaration//GEN-END:variables

 
}

