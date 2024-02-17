/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.ImageIcon;


/**
 *
 * @author USUARIO
 */
public class PantallaPrincipal extends javax.swing.JFrame {
    
    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
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

        escritorio = new javax.swing.JDesktopPane();
        btnMedico = new javax.swing.JButton();
        btnPaciente = new javax.swing.JButton();
        logoSistema = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(255, 255, 255));

        btnMedico.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        btnMedico.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\MediMeetup\\src\\main\\java\\Resource\\96.Medico.png")); // NOI18N
        btnMedico.setText("MEDICO");
        btnMedico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMedico.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\MediMeetup\\src\\main\\java\\Resource\\128.Medico.png")); // NOI18N
        btnMedico.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\MediMeetup\\src\\main\\java\\Resource\\128.Medico.png")); // NOI18N
        btnMedico.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicoActionPerformed(evt);
            }
        });

        btnPaciente.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        btnPaciente.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\MediMeetup\\src\\main\\java\\Resource\\Paciente.96.png")); // NOI18N
        btnPaciente.setText("PACIENTE");
        btnPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPaciente.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\MediMeetup\\src\\main\\java\\Resource\\Paciente.128.png")); // NOI18N
        btnPaciente.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\MediMeetup\\src\\main\\java\\Resource\\Paciente.128.png")); // NOI18N
        btnPaciente.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });

        logoSistema.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\MediMeetup\\src\\main\\java\\Resource\\nombreSistem.png")); // NOI18N

        escritorio.setLayer(btnMedico, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btnPaciente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(logoSistema, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(btnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(btnMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(logoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(logoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(btnMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed

    LoginPaciente ventanaLP = new LoginPaciente();
        escritorio.add(ventanaLP);
        ventanaLP.show();
        
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicoActionPerformed

    LoginMedico ventanaLM = new LoginMedico();
        escritorio.add(ventanaLM);
        ventanaLM.show();        
        
    }//GEN-LAST:event_btnMedicoActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMedico;
    private javax.swing.JButton btnPaciente;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel logoSistema;
    // End of variables declaration//GEN-END:variables
}

