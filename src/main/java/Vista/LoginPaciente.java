/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Controlador.MedicoControlador;
import Controlador.PacienteControlador;
import static Vista.PantallaPrincipal.escritorio;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class LoginPaciente extends javax.swing.JInternalFrame {

    /**
     * Creates new form LoginPaciente
     */
    public LoginPaciente() {
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

        escritorioLP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAcceder = new javax.swing.JButton();
        txtCedulaPaciente = new javax.swing.JTextField();
        NumeroCedula = new javax.swing.JLabel();
        IniciarSesion = new javax.swing.JLabel();
        IniciarSesion1 = new javax.swing.JLabel();
        CheckCedula = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setAutoscrolls(true);

        escritorioLP.setBackground(new java.awt.Color(204, 255, 252));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\MediMeetup\\src\\main\\java\\Resource\\logoPaciente.png")); // NOI18N

        btnAcceder.setBackground(new java.awt.Color(0, 182, 0));
        btnAcceder.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnAcceder.setText("Acceder");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        txtCedulaPaciente.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtCedulaPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaPacienteKeyPressed(evt);
            }
        });

        NumeroCedula.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        NumeroCedula.setText("Numero de Cedula");

        IniciarSesion.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        IniciarSesion.setForeground(new java.awt.Color(48, 44, 44));
        IniciarSesion.setText("BIENVENIDO A");

        IniciarSesion1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        IniciarSesion1.setForeground(new java.awt.Color(24, 161, 24));
        IniciarSesion1.setText("MEDIMEETUP");

        javax.swing.GroupLayout escritorioLPLayout = new javax.swing.GroupLayout(escritorioLP);
        escritorioLP.setLayout(escritorioLPLayout);
        escritorioLPLayout.setHorizontalGroup(
            escritorioLPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLPLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(escritorioLPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLPLayout.createSequentialGroup()
                        .addComponent(IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLPLayout.createSequentialGroup()
                        .addGroup(escritorioLPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, escritorioLPLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(NumeroCedula)))
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLPLayout.createSequentialGroup()
                        .addComponent(IniciarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLPLayout.createSequentialGroup()
                        .addComponent(txtCedulaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CheckCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLPLayout.createSequentialGroup()
                        .addComponent(btnAcceder)
                        .addGap(187, 187, 187))))
        );
        escritorioLPLayout.setVerticalGroup(
            escritorioLPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLPLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IniciarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NumeroCedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(escritorioLPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCedulaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64)
                .addComponent(btnAcceder)
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(escritorioLP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorioLP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        PacienteControlador pa=new PacienteControlador();
       int estado=pa.verificarPaciente(txtCedulaPaciente.getText());
       if(estado!=0){
           MenuPaciente ventanaMP = new MenuPaciente();
           escritorio.add(ventanaMP);
           ventanaMP.show(); 
       }else{
           JOptionPane.showMessageDialog(null, "Ingrese credenciales válidas");
       }
         
        
    }//GEN-LAST:event_btnAccederActionPerformed

    private void txtCedulaPacienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaPacienteKeyPressed
        String cedula = txtCedulaPaciente.getText();
    
    String validarCedula = "^[0-9]{10}$";
    
        if (cedula.matches(validarCedula)) {
            CheckCedula.setForeground(Color.GREEN);
            CheckCedula.setText("✔");
        } else {
            CheckCedula.setForeground(Color.RED);
            CheckCedula.setText("✘");
        }        
        
    }//GEN-LAST:event_txtCedulaPacienteKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CheckCedula;
    private javax.swing.JLabel IniciarSesion;
    private javax.swing.JLabel IniciarSesion1;
    private javax.swing.JLabel NumeroCedula;
    private javax.swing.JButton btnAcceder;
    private javax.swing.JPanel escritorioLP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtCedulaPaciente;
    // End of variables declaration//GEN-END:variables
}
