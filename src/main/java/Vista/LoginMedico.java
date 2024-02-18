/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import java.awt.Color;

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

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setAutoscrolls(true);

        escritorioLM.setBackground(new java.awt.Color(208, 248, 247));

        IniciarSesion.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        IniciarSesion.setForeground(new java.awt.Color(48, 44, 44));
        IniciarSesion.setText("INICIAR");

        logoMedico.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\MediMeetup\\src\\main\\java\\Resource\\logoMedico.png")); // NOI18N

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

        IniciarSesion1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        IniciarSesion1.setForeground(new java.awt.Color(0, 91, 122));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLMLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(escritorioLMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLMLayout.createSequentialGroup()
                        .addComponent(logoMedico)
                        .addGap(207, 207, 207))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLMLayout.createSequentialGroup()
                        .addGroup(escritorioLMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IniciarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(229, 229, 229))))
            .addGroup(escritorioLMLayout.createSequentialGroup()
                .addGroup(escritorioLMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLMLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(btnAcceder))
                    .addGroup(escritorioLMLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(NombreUsuario))
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
                .addContainerGap(81, Short.MAX_VALUE))
        );
        escritorioLMLayout.setVerticalGroup(
            escritorioLMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLMLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(logoMedico)
                .addGap(18, 18, 18)
                .addComponent(IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IniciarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(327, Short.MAX_VALUE)
                .addComponent(escritorioLM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(escritorioLM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        
        
    }//GEN-LAST:event_btnAccederActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        String user = txtUsuario.getText();
        String validarNombre = "^[A-Za-zÁ-ÿ\\s'-]+$";    
        
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
        String validarPassword = "^(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{5,}$";
    
        if (password.matches(validarPassword)) {
            CheckClave.setForeground(Color.GREEN);
            CheckClave.setText("✔");
        } else {
            CheckClave.setForeground(Color.RED);
            CheckClave.setText("✘");
        }

    }//GEN-LAST:event_txtClaveKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CheckClave;
    private javax.swing.JLabel CheckUser;
    private javax.swing.JLabel Contrasenia;
    private javax.swing.JLabel IniciarSesion;
    private javax.swing.JLabel IniciarSesion1;
    private javax.swing.JLabel NombreUsuario;
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnRecuperarClave;
    private javax.swing.JPanel escritorioLM;
    private javax.swing.JLabel logoMedico;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
