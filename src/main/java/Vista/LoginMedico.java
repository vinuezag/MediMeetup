/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Controlador.MedicoControlador;
import static Vista.PantallaPrincipal.escritorio;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class LoginMedico extends javax.swing.JInternalFrame {

    /**
     * Creates new form LoginMedico
     */
    public LoginMedico() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorioLM = new javax.swing.JPanel();
        IniciarSesion = new javax.swing.JLabel();
        logoMedico = new javax.swing.JLabel();
        NombreUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        Contrasenia = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        btnAcceder = new javax.swing.JButton();
        btnRecuperarClave = new javax.swing.JButton();
        IniciarSesion1 = new javax.swing.JLabel();
        CheckUser = new javax.swing.JLabel();
        CheckClave = new javax.swing.JLabel();
        LogoMedico = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setAutoscrolls(true);

        escritorioLM.setBackground(new java.awt.Color(132, 187, 200));

        IniciarSesion.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        IniciarSesion.setForeground(new java.awt.Color(48, 44, 44));
        IniciarSesion.setText("INICIAR");

        NombreUsuario.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        NombreUsuario.setText("Nombre de Usuario: ");

        txtUsuario.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });

        Contrasenia.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Contrasenia.setText("Constraseña: ");

        txtClave.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClaveKeyPressed(evt);
            }
        });

        btnAcceder.setBackground(new java.awt.Color(0, 182, 0));
        btnAcceder.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnAcceder.setText("Acceder");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        btnRecuperarClave.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnRecuperarClave.setForeground(new java.awt.Color(0, 51, 153));
        btnRecuperarClave.setText("¿Olvidaste la Contraseña?");
        btnRecuperarClave.setBorder(null);
        btnRecuperarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarClaveActionPerformed(evt);
            }
        });

        IniciarSesion1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        IniciarSesion1.setForeground(new java.awt.Color(255, 255, 255));
        IniciarSesion1.setText("SESION");

        javax.swing.GroupLayout escritorioLMLayout = new javax.swing.GroupLayout(escritorioLM);
        escritorioLM.setLayout(escritorioLMLayout);
        escritorioLMLayout.setHorizontalGroup(
            escritorioLMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLMLayout.createSequentialGroup()
                .addGroup(escritorioLMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLMLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(btnRecuperarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(escritorioLMLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(Contrasenia)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(escritorioLMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(escritorioLMLayout.createSequentialGroup()
                    .addGap(225, 225, 225)
                    .addComponent(NombreUsuario))
                .addGroup(escritorioLMLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(escritorioLMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(escritorioLMLayout.createSequentialGroup()
                            .addComponent(logoMedico)
                            .addGap(395, 395, 395))
                        .addGroup(escritorioLMLayout.createSequentialGroup()
                            .addComponent(LogoMedico)
                            .addGap(188, 188, 188)))))
            .addGroup(escritorioLMLayout.createSequentialGroup()
                .addGroup(escritorioLMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLMLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(btnAcceder))
                    .addGroup(escritorioLMLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(escritorioLMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(escritorioLMLayout.createSequentialGroup()
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CheckUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(escritorioLMLayout.createSequentialGroup()
                                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CheckClave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLMLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(escritorioLMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IniciarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(226, 226, 226))
        );
        escritorioLMLayout.setVerticalGroup(
            escritorioLMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLMLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(logoMedico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoMedico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IniciarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NombreUsuario)
                .addGap(29, 29, 29)
                .addGroup(escritorioLMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckUser, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Contrasenia)
                .addGap(18, 18, 18)
                .addGroup(escritorioLMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CheckClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtClave))
                .addGap(40, 40, 40)
                .addComponent(btnAcceder)
                .addGap(18, 18, 18)
                .addComponent(btnRecuperarClave)
                .addGap(23, 23, 23))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\MediMeetup\\src\\main\\resource\\Imagenes\\90.Medico.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(312, 312, 312))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(escritorioLM, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(escritorioLM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        MedicoControlador mc=new MedicoControlador();
        int estado=mc.verificarCredencialesMedico(txtUsuario.getText(), txtClave.getText());
        if(estado!=0){
           MenuMedico ventanaMM = new MenuMedico();
           escritorio.add(ventanaMM);
           ventanaMM.show(); 
       }else{
           JOptionPane.showMessageDialog(null, "Ingrese credenciales válidas");
       }  
    }//GEN-LAST:event_btnAccederActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        String user = txtUsuario.getText();
        String validarNombre = "^[0-9]{10}$";    
        
        if (user.matches(validarNombre)) {
            CheckUser.setForeground(Color.GREEN);
            CheckUser.setText("✔");
        } else {
            CheckUser.setForeground(Color.RED);
            CheckUser.setText("✘");
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyPressed
        String password = txtClave.getText();
        String validarPassword = "^[A-Z]\\d{3}$";
    
        if (password.matches(validarPassword)) {
            CheckClave.setForeground(Color.GREEN);
            CheckClave.setText("✔");
        } else {
            CheckClave.setForeground(Color.RED);
            CheckClave.setText("✘");
        }

    }//GEN-LAST:event_txtClaveKeyPressed

    private void btnRecuperarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarClaveActionPerformed
        RecuperarClave ventanaRC = new RecuperarClave();
        escritorio.add(ventanaRC);
        ventanaRC.show(); 
    }//GEN-LAST:event_btnRecuperarClaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CheckClave;
    private javax.swing.JLabel CheckUser;
    private javax.swing.JLabel Contrasenia;
    private javax.swing.JLabel IniciarSesion;
    private javax.swing.JLabel IniciarSesion1;
    private javax.swing.JLabel LogoMedico;
    private javax.swing.JLabel NombreUsuario;
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnRecuperarClave;
    private javax.swing.JPanel escritorioLM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logoMedico;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
