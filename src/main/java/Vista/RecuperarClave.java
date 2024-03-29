/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import static Vista.PantallaPrincipal.escritorio;
import java.awt.Color;

/**
 *
 * @author USUARIO
 */
public class RecuperarClave extends javax.swing.JInternalFrame {

    /**
     * Creates new form RecuperarClave
     */
    public RecuperarClave() {
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

        jPanel1 = new javax.swing.JPanel();
        ultimosDigitosCedula = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        btnObtenerClave = new javax.swing.JButton();
        PrimerasLetrasNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        NumCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();

        setBackground(new java.awt.Color(241, 241, 241));
        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ultimosDigitosCedula.setBackground(new java.awt.Color(236, 236, 236));

        Titulo.setBackground(new java.awt.Color(255, 153, 51));
        Titulo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 153, 0));
        Titulo.setText("Responder la pregunta de Seguridad");

        btnObtenerClave.setBackground(new java.awt.Color(0, 153, 153));
        btnObtenerClave.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnObtenerClave.setForeground(new java.awt.Color(255, 255, 255));
        btnObtenerClave.setText("Obtener Contraseña!!");
        btnObtenerClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerClaveActionPerformed(evt);
            }
        });

        PrimerasLetrasNombre.setText("Primer Nombre");

        txtNombre.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        NumCedula.setText("Numero de  Cedula");

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout ultimosDigitosCedulaLayout = new javax.swing.GroupLayout(ultimosDigitosCedula);
        ultimosDigitosCedula.setLayout(ultimosDigitosCedulaLayout);
        ultimosDigitosCedulaLayout.setHorizontalGroup(
            ultimosDigitosCedulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ultimosDigitosCedulaLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(btnObtenerClave)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ultimosDigitosCedulaLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(ultimosDigitosCedulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ultimosDigitosCedulaLayout.createSequentialGroup()
                        .addComponent(Titulo)
                        .addGap(36, 36, 36))
                    .addGroup(ultimosDigitosCedulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ultimosDigitosCedulaLayout.createSequentialGroup()
                            .addComponent(NumCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCedula))
                        .addGroup(ultimosDigitosCedulaLayout.createSequentialGroup()
                            .addComponent(PrimerasLetrasNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        ultimosDigitosCedulaLayout.setVerticalGroup(
            ultimosDigitosCedulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ultimosDigitosCedulaLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Titulo)
                .addGap(46, 46, 46)
                .addGroup(ultimosDigitosCedulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrimerasLetrasNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ultimosDigitosCedulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btnObtenerClave)
                .addGap(36, 36, 36))
        );

        btnSiguiente.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\MediMeetup\\src\\main\\resource\\Imagenes\\48.FlechaV.png")); // NOI18N
        btnSiguiente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ultimosDigitosCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(ultimosDigitosCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSiguiente)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnObtenerClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerClaveActionPerformed
        
        //ENVIAR UN MENSAJE CON LA CONTRASEÑA
    }//GEN-LAST:event_btnObtenerClaveActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        String nombre = txtNombre.getText();
    
    String validarNombre = "^[A-Z][a-z]+$";
    
        if (nombre.matches(validarNombre)) {
            PrimerasLetrasNombre.setForeground(Color.GREEN);
        } else {
            PrimerasLetrasNombre.setForeground(Color.RED);
        }
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyPressed
        String cedula = txtCedula.getText();
    
    String validarCedula = "^[0-9]{10}$";
    
        if (cedula.matches(validarCedula)) {
            ultimosDigitosCedula.setForeground(Color.GREEN);
        } else {
            ultimosDigitosCedula.setForeground(Color.RED);
        }
    }//GEN-LAST:event_txtCedulaKeyPressed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        MenuMedico ventanaMM = new MenuMedico();
        escritorio.add(ventanaMM);
        ventanaMM.show();
    }//GEN-LAST:event_btnSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NumCedula;
    private javax.swing.JLabel PrimerasLetrasNombre;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnObtenerClave;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPanel ultimosDigitosCedula;
    // End of variables declaration//GEN-END:variables
}
