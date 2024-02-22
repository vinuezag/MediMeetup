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
public class MenuMedico extends javax.swing.JInternalFrame {

    /**
     * Creates new form MenuMedico
     */
    public MenuMedico() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        btnAgendarCita = new javax.swing.JButton();
        btnBuscarCita = new javax.swing.JButton();
        btnReagendarCita = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        lblNombreCedula = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        paciente = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setAutoscrolls(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);

        btnAgendarCita.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnAgendarCita.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\MediMeetup\\src\\main\\resource\\Imagenes\\210.ConsultorioMedico.jpg")); // NOI18N
        btnAgendarCita.setText("Consultorio Medico");
        btnAgendarCita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgendarCita.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnAgendarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarCitaActionPerformed(evt);
            }
        });

        btnBuscarCita.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnBuscarCita.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\MediMeetup\\src\\main\\resource\\Imagenes\\210.BuscarCitaMedica.jpg")); // NOI18N
        btnBuscarCita.setText("Consultar Cita Medica");
        btnBuscarCita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarCita.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnBuscarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCitaActionPerformed(evt);
            }
        });

        btnReagendarCita.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnReagendarCita.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\MediMeetup\\src\\main\\resource\\Imagenes\\210.BuscarPaciente.jpg")); // NOI18N
        btnReagendarCita.setText("Buscar Paciente");
        btnReagendarCita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReagendarCita.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnReagendarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReagendarCitaActionPerformed(evt);
            }
        });

        btnSalida.setBackground(new java.awt.Color(255, 0, 0));
        btnSalida.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\MediMeetup\\src\\main\\resource\\Imagenes\\48.Salir.png")); // NOI18N
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });

        lblNombreCedula.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\MediMeetup\\src\\main\\resource\\Imagenes\\400.Medico.jpg")); // NOI18N

        menu.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        menu.setForeground(new java.awt.Color(48, 44, 44));
        menu.setText("MENU");

        paciente.setBackground(new java.awt.Color(233, 133, 70));
        paciente.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        paciente.setForeground(new java.awt.Color(233, 133, 70));
        paciente.setText("MEDICO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnReagendarCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(lblNombreCedula))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnSalida)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(menu)
                                    .addComponent(paciente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAgendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReagendarCita)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(lblNombreCedula)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalidaActionPerformed

    private void btnReagendarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReagendarCitaActionPerformed
        ConsultarPaciente ventanaRC = new ConsultarPaciente();
        escritorio.add(ventanaRC);
        ventanaRC.show();
    }//GEN-LAST:event_btnReagendarCitaActionPerformed

    private void btnBuscarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCitaActionPerformed
        // TODO add your handling code here:
        ConsultarCitasMedicas ventanaBC = new ConsultarCitasMedicas();
        escritorio.add(ventanaBC);
        ventanaBC.show();
    }//GEN-LAST:event_btnBuscarCitaActionPerformed

    private void btnAgendarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarCitaActionPerformed
        ConsultorioMedico ventanaAC = new ConsultorioMedico();
        escritorio.add(ventanaAC);
        ventanaAC.show();
    }//GEN-LAST:event_btnAgendarCitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendarCita;
    private javax.swing.JButton btnBuscarCita;
    private javax.swing.JButton btnReagendarCita;
    private javax.swing.JButton btnSalida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombreCedula;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel paciente;
    // End of variables declaration//GEN-END:variables
}
