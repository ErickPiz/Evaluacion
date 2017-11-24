package Principal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Piz
 */
public class Acceso extends javax.swing.JFrame {
    Encriptador cripi = new Encriptador();
   
    public Acceso() {
        initComponents();
        
        setLocationRelativeTo(null);
         
        ltfUsuarioAccesso.setAlignt(1);
        ltfUsuarioAccesso.setLabelText("Usuario");
        ltfUsuarioAccesso.setTextFieldText("");
        
        ltfNombreAdd.setLabelText("Nombre");
        ltfNombreAdd.setTextFieldText("");
        
        ltfUsuarioAdd.setLabelText("Usuario");
        ltfUsuarioAdd.setTextFieldText("");
        
        ltfCorreoAdd.setLabelText("Correo");
        ltfCorreoAdd.setTextFieldText("");
        
        ltfPreguntaAdd.setLabelText("Pregunta");
        ltfPreguntaAdd.setTextFieldText("");
        
        ltfRespuestaAdd.setLabelText("Respuesta");
        ltfRespuestaAdd.setTextFieldText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlAcceso = new javax.swing.JPanel();
        ltfUsuarioAccesso = new CustomComponents.LabelTextField();
        lblContraAcceso = new javax.swing.JLabel();
        txtContraAcceso = new javax.swing.JPasswordField();
        btnAcceder = new javax.swing.JButton();
        lblRecPass = new javax.swing.JLabel();
        pnlAgregarUsuario = new javax.swing.JPanel();
        ltfNombreAdd = new CustomComponents.LabelTextField();
        ltfUsuarioAdd = new CustomComponents.LabelTextField();
        lblContraseñaAdd = new javax.swing.JLabel();
        txtContrasenaAdd = new javax.swing.JPasswordField();
        lblConfContraAdd = new javax.swing.JLabel();
        txtConfContraAdd = new javax.swing.JPasswordField();
        ltfCorreoAdd = new CustomComponents.LabelTextField();
        ltfPreguntaAdd = new CustomComponents.LabelTextField();
        ltfRespuestaAdd = new CustomComponents.LabelTextField();
        chkAdminAdd = new javax.swing.JCheckBox();
        btnAccion = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblContraAcceso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContraAcceso.setText("Contraseña");

        txtContraAcceso.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnAcceder.setText("Acceder");

        lblRecPass.setText("!!Olvide mi contraseña!!");

        javax.swing.GroupLayout pnlAccesoLayout = new javax.swing.GroupLayout(pnlAcceso);
        pnlAcceso.setLayout(pnlAccesoLayout);
        pnlAccesoLayout.setHorizontalGroup(
            pnlAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccesoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ltfUsuarioAccesso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtContraAcceso)
                    .addComponent(lblContraAcceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnlAccesoLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btnAcceder)
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(pnlAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlAccesoLayout.createSequentialGroup()
                    .addContainerGap(89, Short.MAX_VALUE)
                    .addComponent(lblRecPass)
                    .addGap(88, 88, 88)))
        );
        pnlAccesoLayout.setVerticalGroup(
            pnlAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccesoLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(ltfUsuarioAccesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblContraAcceso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContraAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAcceder)
                .addGap(86, 86, 86))
            .addGroup(pnlAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlAccesoLayout.createSequentialGroup()
                    .addContainerGap(314, Short.MAX_VALUE)
                    .addComponent(lblRecPass)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Acceso", pnlAcceso);

        lblContraseñaAdd.setText("Contraseña");

        lblConfContraAdd.setText("Confirmar contraseña");

        chkAdminAdd.setText("Administrador");

        btnAccion.setText("Agregar");
        btnAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccionActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAgregarUsuarioLayout = new javax.swing.GroupLayout(pnlAgregarUsuario);
        pnlAgregarUsuario.setLayout(pnlAgregarUsuarioLayout);
        pnlAgregarUsuarioLayout.setHorizontalGroup(
            pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgregarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAgregarUsuarioLayout.createSequentialGroup()
                        .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ltfCorreoAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlAgregarUsuarioLayout.createSequentialGroup()
                                .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ltfNombreAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblContraseñaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContrasenaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblConfContraAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ltfUsuarioAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtConfContraAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(pnlAgregarUsuarioLayout.createSequentialGroup()
                        .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ltfPreguntaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkAdminAdd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ltfRespuestaAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(btnAccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlAgregarUsuarioLayout.setVerticalGroup(
            pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgregarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ltfNombreAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ltfUsuarioAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfContraAdd)
                    .addComponent(lblContraseñaAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfContraAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContrasenaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ltfCorreoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ltfPreguntaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ltfRespuestaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAdminAdd)
                    .addComponent(btnAccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Agregar Usuario", pnlAgregarUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccionActionPerformed
        cripi.encriptar(ltfPreguntaAdd);
        cripi.encriptar(ltfRespuestaAdd);     
    }//GEN-LAST:event_btnAccionActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        cripi.desencriptar(ltfPreguntaAdd);
        cripi.desencriptar(ltfRespuestaAdd);
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnAccion;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JCheckBox chkAdminAdd;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblConfContraAdd;
    private javax.swing.JLabel lblContraAcceso;
    private javax.swing.JLabel lblContraseñaAdd;
    private javax.swing.JLabel lblRecPass;
    private CustomComponents.LabelTextField ltfCorreoAdd;
    private CustomComponents.LabelTextField ltfNombreAdd;
    private CustomComponents.LabelTextField ltfPreguntaAdd;
    private CustomComponents.LabelTextField ltfRespuestaAdd;
    private CustomComponents.LabelTextField ltfUsuarioAccesso;
    private CustomComponents.LabelTextField ltfUsuarioAdd;
    private javax.swing.JPanel pnlAcceso;
    private javax.swing.JPanel pnlAgregarUsuario;
    private javax.swing.JPasswordField txtConfContraAdd;
    private javax.swing.JPasswordField txtContraAcceso;
    private javax.swing.JPasswordField txtContrasenaAdd;
    // End of variables declaration//GEN-END:variables
}
