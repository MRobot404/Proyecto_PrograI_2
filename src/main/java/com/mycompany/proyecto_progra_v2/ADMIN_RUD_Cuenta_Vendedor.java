package com.mycompany.proyecto_progra_v2;
//@author MRobot404

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

 
public class ADMIN_RUD_Cuenta_Vendedor extends javax.swing.JInternalFrame {
DefaultTableModel t;

    public void CargaAutomatica() {
        t = new DefaultTableModel(new String[]{"Correo", "Nombre", "Apellido", "Fecha de Nacimiento", "ID", "Telefono", "Dirección", "Contraseña"}, Main.usuarios.size());
        jTable1.setModel(t);

        TableModel modelo = jTable1.getModel();

        for (int i = 0; i < Main.usuarios.size(); i++) {
            Empleados e = Main.usuarios.get(i);
            modelo.setValueAt(e.getCorreo(), i, 0);
            modelo.setValueAt(e.getNombre(), i, 1);
            modelo.setValueAt(e.getApellido(), i, 2);
            modelo.setValueAt(e.getFecha_de_nacimiento(), i, 3);
            modelo.setValueAt(e.getID(), i, 4);
            modelo.setValueAt(e.getTelefono(), i, 5);
            modelo.setValueAt(e.getDireccion(), i, 6);
            modelo.setValueAt(e.getContraseña(), i, 7);
        }
    }
    public ADMIN_RUD_Cuenta_Vendedor() {
        initComponents();
        CargaAutomatica();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ModificarButton = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        EliminarButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();

        setClosable(true);
        setResizable(true);
        setTitle("Consultar, modificar y eliminar cuenta vendedora");

        jTable1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel7.setText("Fecha de nacimiento:");

        jLabel13.setText("Dirección:");

        ModificarButton.setText("Modificar");
        ModificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarButtonActionPerformed(evt);
            }
        });

        EliminarButton1.setText("Eliminar");
        EliminarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarButton1ActionPerformed(evt);
            }
        });

        jLabel15.setText("Telefono:");

        jLabel3.setText("Contraseña: ");

        jLabel11.setText("Apellido: ");

        jLabel12.setText("Correo:");

        jLabel2.setText("ID:");

        jLabel9.setText("Nombre: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(732, 732, 732))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(ModificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(EliminarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(731, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(271, 271, 271)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(8, 8, 8)
                                                        .addComponent(jLabel15)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 113, Short.MAX_VALUE)
                                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(99, 99, 99)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(244, 244, 244)))
                            .addGap(328, 328, 328))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1)
                            .addContainerGap()))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(441, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGap(52, 52, 52)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ModificarButton)
                        .addComponent(EliminarButton1))
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // Seleccion de fila cuando sea seleccionada se enviaran los datos a los TextField
        int seleccionar = jTable1.rowAtPoint(evt.getPoint());
        txtCorreo.setText(String.valueOf(jTable1.getValueAt(seleccionar, 0)));
        txtNombre.setText(String.valueOf(jTable1.getValueAt(seleccionar, 1)));
        txtApellido.setText(String.valueOf(jTable1.getValueAt(seleccionar, 2)));
        txtFecha.setText(String.valueOf(jTable1.getValueAt(seleccionar, 3)));
        txtID.setText(String.valueOf(jTable1.getValueAt(seleccionar, 4)));
        txtTelefono.setText(String.valueOf(jTable1.getValueAt(seleccionar, 5)));
        txtDireccion.setText(String.valueOf(jTable1.getValueAt(seleccionar, 6)));
        txtContraseña.setText(String.valueOf(jTable1.getValueAt(seleccionar, 7)));
    }//GEN-LAST:event_jTable1MouseClicked

    private void ModificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarButtonActionPerformed
        //Boton Modificar
        int c;
        Empleados aux;
        String correo= txtCorreo.getText();
        String nombre = txtNombre.getText();
        String apellido= txtApellido.getText();
        String fecha = txtFecha.getText();
        String ID= txtID.getText();
        String telefono= txtTelefono.getText();
        String Direccion= txtDireccion.getText();
        String contraseña= txtContraseña.getText();

        try {
            c=jTable1.getSelectedRow();
            aux=Main.usuarios.get(c);
            aux.setNombre(nombre);
            aux.setApellido(apellido);
            aux.setCorreo(correo);
            aux.setFecha_de_nacimiento(fecha);
            aux.setID(ID);
            aux.setTelefono(telefono);
            aux.setDireccion(Direccion);
            aux.setContraseña(contraseña);
            CargaAutomatica();
            txtCorreo.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtFecha.setText("");
            txtID.setText("");
            txtTelefono.setText("");
            txtDireccion.setText("");
            txtContraseña.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escoger una fila");
        }

    }//GEN-LAST:event_ModificarButtonActionPerformed

    private void EliminarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarButton1ActionPerformed
        // Boton Eliminar
        int c;
        try {
            //Si funciona el eliminar
            c=jTable1.getSelectedRow();
            Main.usuarios.remove(c);
            JOptionPane.showMessageDialog(this,"Usuario Eliminado Exitosamente");
            CargaAutomatica();
            txtCorreo.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtFecha.setText("");
            txtID.setText("");
            txtTelefono.setText("");
            txtDireccion.setText("");
            txtContraseña.setText("");
        } catch (Exception e) {
            //Si no funciona
            JOptionPane.showMessageDialog(this,"Seleccione una fila");
        }
    }//GEN-LAST:event_EliminarButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarButton1;
    private javax.swing.JButton ModificarButton;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
