package Principal;

import Conexion.conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * @author Piz
 */
public class Acceso extends javax.swing.JFrame {

    Encriptador cripi = new Encriptador();
    conectar cc = new conectar();
    Connection cn = cc.conexion();

    public Acceso() {
        initComponents();

        setLocationRelativeTo(null);

        chkEditar.setVisible(false);
    }

    //hola mundo
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlAcceso = new javax.swing.JPanel();
        lblContraAcceso = new javax.swing.JLabel();
        txtContraAcceso = new javax.swing.JPasswordField();
        btnAcceder = new javax.swing.JButton();
        lblRecPass = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pnlAgregarUsuario = new javax.swing.JPanel();
        lblNombreAdd = new javax.swing.JLabel();
        txtNombreAdd = new javax.swing.JTextField();
        lblUsuarioAdd = new javax.swing.JLabel();
        txtUsuarioAdd = new javax.swing.JTextField();
        lblContrasenaAdd = new javax.swing.JLabel();
        txtContrasenaAdd = new javax.swing.JPasswordField();
        lblConfContAdd = new javax.swing.JLabel();
        txtConfContraAdd = new javax.swing.JPasswordField();
        lblCorreoAdd = new javax.swing.JLabel();
        txtCorreoAdd = new javax.swing.JTextField();
        lblPreguntaAdd = new javax.swing.JLabel();
        txtPreguntaAdd = new javax.swing.JTextField();
        lblRespuestaAdd = new javax.swing.JLabel();
        txtRespuestaAdd = new javax.swing.JTextField();
        chkAdminAdd = new javax.swing.JCheckBox();
        btnAccion = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        chkEditar = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblContraAcceso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContraAcceso.setText("Contraseña");

        txtContraAcceso.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnAcceder.setText("Acceder");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        lblRecPass.setText("!!Olvide mi contraseña!!");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuario");

        javax.swing.GroupLayout pnlAccesoLayout = new javax.swing.GroupLayout(pnlAcceso);
        pnlAcceso.setLayout(pnlAccesoLayout);
        pnlAccesoLayout.setHorizontalGroup(
            pnlAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccesoLayout.createSequentialGroup()
                .addGroup(pnlAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAccesoLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnAcceder)
                        .addGap(0, 105, Short.MAX_VALUE))
                    .addGroup(pnlAccesoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContraAcceso)
                            .addComponent(lblContraAcceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlAccesoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(pnlAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlAccesoLayout.createSequentialGroup()
                    .addContainerGap(82, Short.MAX_VALUE)
                    .addComponent(lblRecPass)
                    .addGap(88, 88, 88)))
        );
        pnlAccesoLayout.setVerticalGroup(
            pnlAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccesoLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        lblNombreAdd.setText("Nombre");

        lblUsuarioAdd.setText("Usuario");

        lblContrasenaAdd.setText("Contraseña");

        lblConfContAdd.setText("Confirmar contraseña");

        lblCorreoAdd.setText("Correo");

        lblPreguntaAdd.setText("Pregunta");

        lblRespuestaAdd.setText("Respuesta");

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

        chkEditar.setText("Editar");
        chkEditar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkEditarItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlAgregarUsuarioLayout = new javax.swing.GroupLayout(pnlAgregarUsuario);
        pnlAgregarUsuario.setLayout(pnlAgregarUsuarioLayout);
        pnlAgregarUsuarioLayout.setHorizontalGroup(
            pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgregarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorreoAdd)
                    .addGroup(pnlAgregarUsuarioLayout.createSequentialGroup()
                        .addComponent(lblNombreAdd)
                        .addGap(106, 106, 106)
                        .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuarioAdd)
                            .addComponent(txtUsuarioAdd)))
                    .addGroup(pnlAgregarUsuarioLayout.createSequentialGroup()
                        .addComponent(lblPreguntaAdd)
                        .addGap(99, 99, 99)
                        .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRespuestaAdd)
                            .addComponent(txtRespuestaAdd)))
                    .addGroup(pnlAgregarUsuarioLayout.createSequentialGroup()
                        .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCorreoAdd)
                            .addGroup(pnlAgregarUsuarioLayout.createSequentialGroup()
                                .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkAdminAdd)
                                    .addComponent(chkEditar))
                                .addGap(40, 40, 40)
                                .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlAgregarUsuarioLayout.createSequentialGroup()
                                .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtPreguntaAdd)
                                    .addComponent(txtNombreAdd, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAgregarUsuarioLayout.createSequentialGroup()
                                        .addComponent(lblContrasenaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblConfContAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAgregarUsuarioLayout.createSequentialGroup()
                                .addComponent(txtContrasenaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtConfContraAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlAgregarUsuarioLayout.setVerticalGroup(
            pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgregarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlAgregarUsuarioLayout.createSequentialGroup()
                        .addComponent(lblNombreAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAgregarUsuarioLayout.createSequentialGroup()
                        .addComponent(lblUsuarioAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuarioAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContrasenaAdd)
                    .addComponent(lblConfContAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContrasenaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfContraAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblCorreoAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlAgregarUsuarioLayout.createSequentialGroup()
                        .addComponent(lblPreguntaAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPreguntaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAgregarUsuarioLayout.createSequentialGroup()
                        .addComponent(lblRespuestaAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRespuestaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccion)
                    .addComponent(chkAdminAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(chkEditar))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Usuario", pnlAgregarUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
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
        //cripi.encriptar(ltfPreguntaAdd);
        //cripi.encriptar(ltfRespuestaAdd);        

        if (txtContrasenaAdd.getText().equals(txtConfContraAdd.getText())) {
        }
        /*    
            if(SELECT COUNT usuario FROM DOCENTE WHERE usuario=ltfUsuario.getTextFieldText()==0){
                Usuario.Usuario u= new Usuario.Usuario(ltfNombreAdd.getTextFieldText(),ltfUsuarioAdd.getTextFieldText(),txtContrasenaAdd.getText(),ltfCorreoAdd.getTextFieldText(),ltfPreguntaAdd.getTextFieldText(),ltfRespuestaAdd.getTextFieldText(),chkAdminAdd.isSelected());
                INSERT INTO DOCENTE(NOMBRE,USUARIO,CONTASEÑA,CORREO,PREGUNTA,RESPUESTA,ADMINISTADOR)VALUES
                (
                    u.getNombre(),
                    u.getUsuario(),
                    u.getContrasena(),
                    u.getCorreo(),
                    u.getPregunta(),
                    u.getRespuesta(),
                    u.isAdministrador(),
                )
                lipiar Csmpos
                
            }
            else{
                JOptionPane.showMessageDialog(this,"El usuario ya existe");
            }
              
        }
        else{
            JOptionPane.showMessageDialog(this,"La Contraseña no coincide");
        }
         */
//            System.out.println(u.getNombre()+"\n"
//                    + u.getUsuario()+"\n"
//                    + u.getContrasena()+"\n"
//                    + u.getCorreo()+"\n"
//                    + u.getPregunta()+"\n"
//                    + u.getRespuesta()+"\n"
//                    + u.isAdministrador());
    }//GEN-LAST:event_btnAccionActionPerformed

    public void mostrarDatosUsuario(String valor) {
        //IMPRMIR LOS TITULOS DE LA TABLA
        
        if (valor.equals("")) {
            JOptionPane.showMessageDialog(null, "Usuario no Ingresado");
        } else {
            String sql = "SELECT * FROM mysql.docente WHERE nombre = '" + valor + "'";
            JOptionPane.showMessageDialog(null,"asigno el sql");

            //VARIABLE PARA MOSTRAR LOS DATOS EN EL while
            String[] datos = new String[7];
            JOptionPane.showMessageDialog(null,"creo 'datos'");
            try {
                //CREAR UN OBJ TIPO Statement
                Statement st = cn.createStatement();
                JOptionPane.showMessageDialog(null,"creo st");
                //CREAR UN ResultSet ALMACENA LOS DATOS DE LA CONSULTA QUE SE REALIZARA
                ResultSet rs = st.executeQuery(sql);
                JOptionPane.showMessageDialog(null,"creo rs");
                JOptionPane.showMessageDialog(null,sql+"    "+rs.getString(2));
                //MOSTRAR LOS DATOS CON UN while
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null,"entro al while");
                    datos[0] = rs.getString(2);//Nombre
                    datos[1] = rs.getString(3);//Usuario
                    datos[2] = rs.getString(4);//Contraseña
                    datos[3] = rs.getString(5);//Correo
                    datos[4] = rs.getString(6);//Pregunta
                    datos[5] = rs.getString(7);//Respuesta
                    datos[6] = rs.getString(8);//Admin

                    txtNombreAdd.setText(datos[0]);
                    txtUsuarioAdd.setText(datos[1]);
                    txtContrasenaAdd.setText(datos[2]);
                    txtCorreoAdd.setText(datos[3]);
                    txtPreguntaAdd.setText(datos[4]);
                    txtRespuestaAdd.setText(datos[5]);
                    if (datos[6].equals("1")) {
                        chkAdminAdd.setSelected(true);
                    } else {
                        chkAdminAdd.setSelected(false);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de coneccion: " + ex.getMessage());
            }
        }
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //cripi.desencriptar(ltfPreguntaAdd);
        //cripi.desencriptar(ltfRespuestaAdd);
        mostrarDatosUsuario(JOptionPane.showInputDialog("Escribe el Usuario a buscar"));
        chkEditar.setVisible(true);
        /*
        if(SELECT COUNT USUARIO FROM DOCENTE WHERE USUARIO=aBusscar == 0){
            JOptionPane.showMessageDialog(this,"El usuario no existe");
        }
        else{
            SELECT * FROM DOCENTE WHERE USUARIO=aBusscar
            agregar los datos del select a los campos de la ventana y deshabilitar los campos
            
            cripi.encriptar(ltfPreguntaAdd);
            cripi.encriptar(ltfRespuestaAdd);
            
            chkEditar.setVisible(true);
        }
        
         */
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        //new Administrador.Admin().setVisible(true);
        new Administrador.Admin().setVisible(true);
    }//GEN-LAST:event_btnAccederActionPerformed
    public void setEnabledText(boolean bool) {
        txtNombreAdd.setEnabled(bool);
        txtUsuarioAdd.setEnabled(bool);
        txtContrasenaAdd.setEnabled(bool);
        txtConfContraAdd.setEnabled(bool);
        txtCorreoAdd.setEnabled(bool);
        txtPreguntaAdd.setEnabled(bool);
        txtRespuestaAdd.setEnabled(bool);
        chkAdminAdd.setEnabled(bool);
    }

    private void chkEditarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkEditarItemStateChanged
        if (chkEditar.isSelected()) {
            if (txtContrasenaAdd.getText().equals(JOptionPane.showInputDialog("Contraseña del Usuario"))) {
                setEnabledText(true);
            } else {
                JOptionPane.showMessageDialog(this, "Contraseña Incorrecta");
            }
        } else {
            setEnabledText(false);
        }
    }//GEN-LAST:event_chkEditarItemStateChanged

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
    private javax.swing.JCheckBox chkEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblConfContAdd;
    private javax.swing.JLabel lblContraAcceso;
    private javax.swing.JLabel lblContrasenaAdd;
    private javax.swing.JLabel lblCorreoAdd;
    private javax.swing.JLabel lblNombreAdd;
    private javax.swing.JLabel lblPreguntaAdd;
    private javax.swing.JLabel lblRecPass;
    private javax.swing.JLabel lblRespuestaAdd;
    private javax.swing.JLabel lblUsuarioAdd;
    private javax.swing.JPanel pnlAcceso;
    private javax.swing.JPanel pnlAgregarUsuario;
    private javax.swing.JPasswordField txtConfContraAdd;
    private javax.swing.JPasswordField txtContraAcceso;
    private javax.swing.JPasswordField txtContrasenaAdd;
    private javax.swing.JTextField txtCorreoAdd;
    private javax.swing.JTextField txtNombreAdd;
    private javax.swing.JTextField txtPreguntaAdd;
    private javax.swing.JTextField txtRespuestaAdd;
    private javax.swing.JTextField txtUsuarioAdd;
    // End of variables declaration//GEN-END:variables
}
