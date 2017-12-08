package Principal;

import Conexion.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * @author Piz
 */
public class Acceso extends javax.swing.JFrame {

    conectar cc = new conectar();
    Connection cn = cc.conexion();
    public Usuario.Usuario u;

    public Acceso() {
        initComponents();

        setLocationRelativeTo(null);
        btnEditar.setVisible(false);
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
        txtUsuarioAcceso = new javax.swing.JTextField();
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
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        txtUsuarioAcceso.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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
                            .addComponent(txtUsuarioAcceso)
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
                .addComponent(txtUsuarioAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
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
                    .addComponent(lblCorreoAdd)
                    .addGroup(pnlAgregarUsuarioLayout.createSequentialGroup()
                        .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkAdminAdd)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAdminAdd)
                    .addComponent(btnAccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnEditar))
                .addContainerGap())
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
    public void setNullText() {
        txtNombreAdd.setEditable(true);
        txtUsuarioAdd.setEditable(true);
        txtNombreAdd.setText("");
        txtUsuarioAdd.setText("");
        txtContrasenaAdd.setText("");
        txtConfContraAdd.setText("");
        txtCorreoAdd.setText("");
        txtPreguntaAdd.setText("");
        txtRespuestaAdd.setText("");
        chkAdminAdd.setSelected(false);
        setEnabledText(true);

    }
    private void btnAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccionActionPerformed
        if (btnAccion.getText().equals("Agregar")) {
            if (txtContrasenaAdd.getText().equals(txtConfContraAdd.getText()) && !txtContrasenaAdd.getText().equals("")) {
                try {
                    String sql = "SELECT * FROM mysql.docente WHERE usuario = '" + txtUsuarioAdd.getText() + "'";
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    if (!rs.next()) {
                        PreparedStatement obj4 = cn.prepareStatement("INSERT INTO mysql.docente (nombre, usuario, password, email, pregunta, respuesta, admin) VALUES (?,?,?,?,?,?,?)");
                        obj4.setString(1, txtNombreAdd.getText());
                        obj4.setString(2, txtUsuarioAdd.getText());
                        obj4.setString(3, txtContrasenaAdd.getText());
                        obj4.setString(4, txtCorreoAdd.getText());
                        obj4.setString(5, txtPreguntaAdd.getText());
                        obj4.setString(6, txtRespuestaAdd.getText());
                        obj4.setBoolean(7, chkAdminAdd.isSelected());

                        obj4.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Registro Creado", "ALTA", 3);

                        setNullText();

                    } else {
                        JOptionPane.showMessageDialog(null, "El usuario " + txtUsuarioAdd.getText() + " ya existe");
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al guardar: " + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Contraseñas No Validas");
            }
        } else {
            setNullText();
            btnAccion.setText("Agregar");
            btnEditar.setVisible(false);

        }
    }//GEN-LAST:event_btnAccionActionPerformed
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String valor = JOptionPane.showInputDialog("Escribe el Usuario a buscar");
        if (valor.equals("")) {
            JOptionPane.showMessageDialog(null, "Usuario no Ingresado");
        } else {

            String sql = "SELECT * FROM mysql.docente WHERE usuario = '" + valor + "'";
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {

                    txtNombreAdd.setText(rs.getString(2));
                    txtUsuarioAdd.setText(rs.getString(3));
                    txtContrasenaAdd.setText(rs.getString(4));
                    txtCorreoAdd.setText(rs.getString(5));
                    txtPreguntaAdd.setText(rs.getString(6));
                    txtRespuestaAdd.setText(rs.getString(7));
                    chkAdminAdd.setSelected(rs.getBoolean(8));

                    btnEditar.setVisible(true);
                    txtNombreAdd.setEditable(false);
                    txtUsuarioAdd.setEditable(false);
                    setEnabledText(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de coneccion: " + ex.getMessage());
            }
        }
        btnAccion.setText("Nuevo");
        txtConfContraAdd.setText("");
        btnEditar.setText("Editar");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        try {
            String sql = "SELECT usuario,password,admin FROM mysql.docente WHERE usuario = '" + txtUsuarioAcceso.getText() + "' and password='" + txtContraAcceso.getText() + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                u= new Usuario.Usuario(rs.getString(1),rs.getString(2),rs.getBoolean(3));
                if(u.isAdministrador()){
                    Administrador.Admin a =new Administrador.Admin();
                    a.setVisible(true);
                    this.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Inserte aqui las ventanas e fer");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectos");
            }
            //new Administrador.Admin().setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnAccederActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        if (btnEditar.getText().equals("Editar")) {
            if (txtContrasenaAdd.getText().equals(JOptionPane.showInputDialog("Contraseña del Usuario"))) {
                setEnabledText(true);
                btnEditar.setText("Guardar");
            } else {
                JOptionPane.showMessageDialog(this, "Contraseña Incorrecta");
            }
        } else if (txtContrasenaAdd.getText().equals(txtConfContraAdd.getText()) && !txtContrasenaAdd.getText().equals("")) {
            try {
                Statement st;
                st = cn.createStatement();
                JOptionPane.showMessageDialog(null, "UPDATE `mysql`.`docente` SET `password`='" + txtContrasenaAdd.getText() + "',`email`='" + txtCorreoAdd.getText() + "',`pregunta`='" + txtPreguntaAdd.getText() + "',`respuesta`='" + txtRespuestaAdd.getText() + "',`admin`=" + chkAdminAdd.isSelected() + " WHERE  `usuario`='" + txtUsuarioAdd.getText() + "';");
                st.executeUpdate("UPDATE `mysql`.`docente` SET `nombre`='" + txtNombreAdd.getText() + "',`usuario`='" + txtUsuarioAdd.getText() + "',`password`='" + txtContrasenaAdd.getText() + "',`email`='" + txtCorreoAdd.getText() + "',`pregunta`='" + txtPreguntaAdd.getText() + "',`respuesta`='" + txtRespuestaAdd.getText() + "',`admin`=" + chkAdminAdd.isSelected() + " WHERE  `usuario`='" + txtUsuarioAdd.getText() + "';");
                JOptionPane.showMessageDialog(this, "Se Actualizo Usuario " + txtUsuarioAdd.getText());
                setEnabledText(false);
                btnEditar.setText("Editar (Inactivo)");
            } catch (SQLException ex) {
                Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden");
        }
    }//GEN-LAST:event_btnEditarActionPerformed
    public void setEnabledText(boolean bool) {
        txtContrasenaAdd.setEditable(bool);
        txtConfContraAdd.setEditable(bool);
        txtCorreoAdd.setEditable(bool);
        txtPreguntaAdd.setVisible(bool);
        txtRespuestaAdd.setVisible(bool);
        chkAdminAdd.setEnabled(bool);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnAccion;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JCheckBox chkAdminAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane jTabbedPane1;
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
    private javax.swing.JTextField txtUsuarioAcceso;
    private javax.swing.JTextField txtUsuarioAdd;
    // End of variables declaration//GEN-END:variables
}
