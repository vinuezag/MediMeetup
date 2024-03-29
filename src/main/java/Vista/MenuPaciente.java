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
public class MenuPaciente extends javax.swing.JInternalFrame {

    /**
     * Creates new form MenuPaciente
     */
    public MenuPaciente() {
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
        paciente = new javax.swing.JLabel();
        btnAgendarCita = new javax.swing.JButton();
        btnBuscarCita = new javax.swing.JButton();
        btnReagendarCita = new javax.swing.JButton();
        btnCancelarCita = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        lblNombreCedula = new javax.swing.JLabel();
        btnModificarP = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setAutoscrolls(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\MediMeetup\\src\\main\\resource\\Imagenes\\400.Paciente.jpg")); // NOI18N

        menu.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        menu.setForeground(new java.awt.Color(48, 44, 44));
        menu.setText("MENU");

        paciente.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        paciente.setForeground(new java.awt.Color(51, 153, 255));
        paciente.setText("PACIENTE");

        btnAgendarCita.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnAgendarCita.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\MediMeetup\\src\\main\\resource\\Imagenes\\210.AgregarCita.jpg")); // NOI18N
        btnAgendarCita.setText("Agendar Cita Medica");
        btnAgendarCita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgendarCita.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnAgendarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarCitaActionPerformed(evt);
            }
        });

        btnBuscarCita.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnBuscarCita.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\MediMeetup\\src\\main\\resource\\Imagenes\\210.BuscarCita.jpg")); // NOI18N
        btnBuscarCita.setText("Consultar Cita Medica");
        btnBuscarCita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarCita.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnBuscarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCitaActionPerformed(evt);
            }
        });

        btnReagendarCita.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnReagendarCita.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\MediMeetup\\src\\main\\resource\\Imagenes\\210.ModificarCita.jpg")); // NOI18N
        btnReagendarCita.setText("Reagendar Cita Medica");
        btnReagendarCita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReagendarCita.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnReagendarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReagendarCitaActionPerformed(evt);
            }
        });

        btnCancelarCita.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnCancelarCita.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\MediMeetup\\src\\main\\resource\\Imagenes\\210.EliminarCita.jpg")); // NOI18N
        btnCancelarCita.setText("Cancelar Cita Medica");
        btnCancelarCita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarCita.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnCancelarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCitaActionPerformed(evt);
            }
        });

        btnSalida.setBackground(new java.awt.Color(255, 0, 0));
        btnSalida.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\MediMeetup\\src\\main\\resource\\Imagenes\\48.Salir.png")); // NOI18N
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });

        lblNombreCedula.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\MediMeetup\\src\\main\\resource\\Imagenes\\70.MenbreteP.jpg")); // NOI18N

        btnModificarP.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\MediMeetup\\src\\main\\resource\\Imagenes\\128.jpg")); // NOI18N
        btnModificarP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnModificarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReagendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnSalida)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificarP)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paciente))
                    .addComponent(btnModificarP, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnAgendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCancelarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnReagendarCita))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblNombreCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(82, 82, 82))
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
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgendarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarCitaActionPerformed
        AgendarCita ventanaAC = new AgendarCita();
        escritorio.add(ventanaAC);
        ventanaAC.show(); 
    }//GEN-LAST:event_btnAgendarCitaActionPerformed

    private void btnBuscarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCitaActionPerformed
        // TODO add your handling code here:
        BuscarCita ventanaBC = new BuscarCita();
        escritorio.add(ventanaBC);
        ventanaBC.show(); 
    }//GEN-LAST:event_btnBuscarCitaActionPerformed

    private void btnReagendarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReagendarCitaActionPerformed
        ReagendarCita ventanaRC = new ReagendarCita();
        escritorio.add(ventanaRC);
        ventanaRC.show(); 
    }//GEN-LAST:event_btnReagendarCitaActionPerformed

    private void btnCancelarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCitaActionPerformed
        CancelarCita ventanaCC = new CancelarCita();
        escritorio.add(ventanaCC);
        ventanaCC.show();
    }//GEN-LAST:event_btnCancelarCitaActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalidaActionPerformed

    private void btnModificarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPActionPerformed
        ModificarInfoPacientes ventanaMIP = new ModificarInfoPacientes();
        escritorio.add(ventanaMIP);
        ventanaMIP.show();
    }//GEN-LAST:event_btnModificarPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendarCita;
    private javax.swing.JButton btnBuscarCita;
    private javax.swing.JButton btnCancelarCita;
    private javax.swing.JButton btnModificarP;
    private javax.swing.JButton btnReagendarCita;
    private javax.swing.JButton btnSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNombreCedula;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel paciente;
    // End of variables declaration//GEN-END:variables
}
