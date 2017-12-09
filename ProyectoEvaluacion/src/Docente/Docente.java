/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Docente;

import Conexion.conectar;
import Usuario.Usuario;
import java.sql.Connection;

/**
 *
 * @author Piz
 */
public class Docente extends javax.swing.JFrame {

    conectar cc = new conectar();
    Connection cn = cc.conexion();
    Usuario u;

    public Docente(Usuario u) {
        initComponents();
        this.u = u;
        setLocationRelativeTo(null);
        this.setTitle("Usuario " + u.getUsuario());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlCusros = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCursos = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        pnlControlCursos = new javax.swing.JPanel();
        lblMateria = new javax.swing.JLabel();
        cbxMateria = new javax.swing.JComboBox();
        lblGupo = new javax.swing.JLabel();
        cbxGrupo = new javax.swing.JComboBox();
        lblRubros = new javax.swing.JLabel();
        cbxR1 = new javax.swing.JComboBox();
        cbxR2 = new javax.swing.JComboBox();
        cbxR3 = new javax.swing.JComboBox();
        cbxR4 = new javax.swing.JComboBox();
        cbxR5 = new javax.swing.JComboBox();
        cbxR6 = new javax.swing.JComboBox();
        cbxR7 = new javax.swing.JComboBox();
        cbxR8 = new javax.swing.JComboBox();
        lblPonderacion = new javax.swing.JLabel();
        txtR1 = new javax.swing.JTextField();
        txtR2 = new javax.swing.JTextField();
        txtR3 = new javax.swing.JTextField();
        txtR4 = new javax.swing.JTextField();
        txtR5 = new javax.swing.JTextField();
        txtR6 = new javax.swing.JTextField();
        txtR7 = new javax.swing.JTextField();
        txtR8 = new javax.swing.JTextField();
        pnlBotonesControl = new javax.swing.JPanel();
        btnAccion = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Cerrar Secion");

        pnlCusros.setBackground(new java.awt.Color(102, 102, 102));

        listCursos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listCursos);

        jButton2.setText("Evaluar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");

        jButton4.setText("Actualizar");

        javax.swing.GroupLayout pnlCusrosLayout = new javax.swing.GroupLayout(pnlCusros);
        pnlCusros.setLayout(pnlCusrosLayout);
        pnlCusrosLayout.setHorizontalGroup(
            pnlCusrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCusrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCusrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlCusrosLayout.setVerticalGroup(
            pnlCusrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCusrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCusrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCusrosLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cursos", pnlCusros);

        pnlControlCursos.setBackground(new java.awt.Color(102, 102, 102));
        pnlControlCursos.setForeground(new java.awt.Color(255, 255, 255));

        lblMateria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMateria.setForeground(new java.awt.Color(255, 255, 255));
        lblMateria.setText("Materia:");

        cbxMateria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxMateria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblGupo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblGupo.setForeground(new java.awt.Color(255, 255, 255));
        lblGupo.setText("Grupo:");

        cbxGrupo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxGrupo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblRubros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRubros.setForeground(new java.awt.Color(255, 255, 255));
        lblRubros.setText("Rubros:");

        cbxR1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxR1ActionPerformed(evt);
            }
        });

        cbxR2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cbxR3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cbxR4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cbxR5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cbxR6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cbxR7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cbxR8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblPonderacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPonderacion.setForeground(new java.awt.Color(255, 255, 255));
        lblPonderacion.setText("Ponderación");

        txtR1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtR1ActionPerformed(evt);
            }
        });

        txtR2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtR2ActionPerformed(evt);
            }
        });

        txtR3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        txtR4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        txtR5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        txtR6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        txtR7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        txtR8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        pnlBotonesControl.setBackground(new java.awt.Color(255, 255, 255));

        btnAccion.setBackground(new java.awt.Color(102, 102, 102));
        btnAccion.setText("Crear");

        btnBuscar.setBackground(new java.awt.Color(102, 102, 102));
        btnBuscar.setText("Buscar");

        btnEditar.setBackground(new java.awt.Color(102, 102, 102));
        btnEditar.setText("Editar");

        javax.swing.GroupLayout pnlBotonesControlLayout = new javax.swing.GroupLayout(pnlBotonesControl);
        pnlBotonesControl.setLayout(pnlBotonesControlLayout);
        pnlBotonesControlLayout.setHorizontalGroup(
            pnlBotonesControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotonesControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBotonesControlLayout.createSequentialGroup()
                        .addComponent(btnAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlBotonesControlLayout.setVerticalGroup(
            pnlBotonesControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotonesControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnAccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlControlCursosLayout = new javax.swing.GroupLayout(pnlControlCursos);
        pnlControlCursos.setLayout(pnlControlCursosLayout);
        pnlControlCursosLayout.setHorizontalGroup(
            pnlControlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlControlCursosLayout.createSequentialGroup()
                .addGroup(pnlControlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlControlCursosLayout.createSequentialGroup()
                        .addGroup(pnlControlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlControlCursosLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(pnlControlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblMateria)
                                    .addComponent(lblGupo))
                                .addGap(18, 18, 18)
                                .addGroup(pnlControlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxGrupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxMateria, 0, 163, Short.MAX_VALUE)))
                            .addGroup(pnlControlCursosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cbxR1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtR1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlControlCursosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlControlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbxR7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxR6, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxR5, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxR4, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxR3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxR2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxR8, 0, 162, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlControlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtR3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtR2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtR4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtR5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtR6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtR7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtR8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlControlCursosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlControlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlBotonesControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlControlCursosLayout.createSequentialGroup()
                                .addComponent(lblRubros)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPonderacion)))))
                .addContainerGap())
        );
        pnlControlCursosLayout.setVerticalGroup(
            pnlControlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlControlCursosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlControlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMateria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlControlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGupo))
                .addGap(18, 18, 18)
                .addGroup(pnlControlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubros)
                    .addComponent(lblPonderacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlControlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlControlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlControlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxR3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtR3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlControlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtR4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxR4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlControlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtR5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxR5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlControlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtR6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxR6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlControlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxR7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtR7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlControlCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxR8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtR8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlBotonesControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Control de cursos", pnlControlCursos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxR1ActionPerformed

    private void txtR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtR1ActionPerformed

    private void txtR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtR2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtR2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Evaluacion(this.u,listCursos.getSelectedValue()).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccion;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JComboBox cbxGrupo;
    private javax.swing.JComboBox cbxMateria;
    private javax.swing.JComboBox cbxR1;
    private javax.swing.JComboBox cbxR2;
    private javax.swing.JComboBox cbxR3;
    private javax.swing.JComboBox cbxR4;
    private javax.swing.JComboBox cbxR5;
    private javax.swing.JComboBox cbxR6;
    private javax.swing.JComboBox cbxR7;
    private javax.swing.JComboBox cbxR8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblGupo;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblPonderacion;
    private javax.swing.JLabel lblRubros;
    private javax.swing.JList<String> listCursos;
    private javax.swing.JPanel pnlBotonesControl;
    private javax.swing.JPanel pnlControlCursos;
    private javax.swing.JPanel pnlCusros;
    private javax.swing.JTextField txtR1;
    private javax.swing.JTextField txtR2;
    private javax.swing.JTextField txtR3;
    private javax.swing.JTextField txtR4;
    private javax.swing.JTextField txtR5;
    private javax.swing.JTextField txtR6;
    private javax.swing.JTextField txtR7;
    private javax.swing.JTextField txtR8;
    // End of variables declaration//GEN-END:variables
}
