/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import static Vista.PantallaPrincipal.escritorio;

/**
 *
 * @author USUARIO
 */
public class MenuAdministrador extends javax.swing.JInternalFrame {

    /**
     * Creates new form MenuAdministrador
     */
    public MenuAdministrador() {
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
        jLabel1 = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        Administrador = new javax.swing.JLabel();
        btnAgregarMedico = new javax.swing.JButton();
        btnBuscarMedico = new javax.swing.JButton();
        btnModificarMedico = new javax.swing.JButton();
        btnEliminarMedico = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        lblNombreCedula = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setAutoscrolls(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\MediMeetup\\src\\main\\resource\\Imagenes\\400.Amin.jpg")); // NOI18N

        menu.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        menu.setForeground(new java.awt.Color(48, 44, 44));
        menu.setText("MENU");

        Administrador.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        Administrador.setForeground(new java.awt.Color(143, 78, 242));
        Administrador.setText("ADMINISTRADOR");

        btnAgregarMedico.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnAgregarMedico.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\MediMeetup\\src\\main\\resource\\Imagenes\\210.AgregarUser.jpg")); // NOI18N
        btnAgregarMedico.setText("Agregar Personal");
        btnAgregarMedico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregarMedico.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnAgregarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMedicoActionPerformed(evt);
            }
        });

        btnBuscarMedico.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnBuscarMedico.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\MediMeetup\\src\\main\\resource\\Imagenes\\210.BuscarUser.jpg")); // NOI18N
        btnBuscarMedico.setText("Consultar Personal");
        btnBuscarMedico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarMedico.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnBuscarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMedicoActionPerformed(evt);
            }
        });

        btnModificarMedico.setFont(new java.awt.Font("Trebuchet MS", 1, 17)); // NOI18N
        btnModificarMedico.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\MediMeetup\\src\\main\\resource\\Imagenes\\210.ModificarUser.jpg")); // NOI18N
        btnModificarMedico.setText("Modificar Información");
        btnModificarMedico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificarMedico.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnModificarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarMedicoActionPerformed(evt);
            }
        });

        btnEliminarMedico.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnEliminarMedico.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\MediMeetup\\src\\main\\resource\\Imagenes\\210.EliminarUser.jpg")); // NOI18N
        btnEliminarMedico.setText("Eliminar Personal");
        btnEliminarMedico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarMedico.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnEliminarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMedicoActionPerformed(evt);
            }
        });

        btnSalida.setBackground(new java.awt.Color(255, 0, 0));
        btnSalida.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\MediMeetup\\src\\main\\resource\\Imagenes\\48.Salir.png")); // NOI18N
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });

        lblNombreCedula.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\MediMeetup\\src\\main\\resource\\Imagenes\\70,Membrete.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModificarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombreCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(btnSalida))
                    .addComponent(jLabel1))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 659, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Administrador)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBuscarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(btnAgregarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnModificarMedico))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(lblNombreCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(529, 529, 529)
                        .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMedicoActionPerformed
        AgregarMedico ventanaAC = new AgregarMedico();
        escritorio.add(ventanaAC);
        ventanaAC.show();
    }//GEN-LAST:event_btnAgregarMedicoActionPerformed

    private void btnBuscarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMedicoActionPerformed
        // TODO add your handling code here:
        BuscarMedico ventanaBC = new BuscarMedico();
        escritorio.add(ventanaBC);
        ventanaBC.show();
    }//GEN-LAST:event_btnBuscarMedicoActionPerformed

    private void btnModificarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarMedicoActionPerformed
        ModificarMedico ventanaRC = new ModificarMedico();
        escritorio.add(ventanaRC);
        ventanaRC.show();
    }//GEN-LAST:event_btnModificarMedicoActionPerformed

    private void btnEliminarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMedicoActionPerformed
        EliminarMedico ventanaCC = new EliminarMedico();
        escritorio.add(ventanaCC);
        ventanaCC.show();
    }//GEN-LAST:event_btnEliminarMedicoActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        // TODO add your handling code here:
       this.dispose();
    }//GEN-LAST:event_btnSalidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Administrador;
    private javax.swing.JButton btnAgregarMedico;
    private javax.swing.JButton btnBuscarMedico;
    private javax.swing.JButton btnEliminarMedico;
    private javax.swing.JButton btnModificarMedico;
    private javax.swing.JButton btnSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNombreCedula;
    private javax.swing.JLabel menu;
    // End of variables declaration//GEN-END:variables
}
