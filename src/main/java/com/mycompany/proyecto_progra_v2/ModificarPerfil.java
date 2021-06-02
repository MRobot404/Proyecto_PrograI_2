package com.mycompany.proyecto_progra_v2;
// @author MRobot404

import javax.swing.JOptionPane;

public class ModificarPerfil extends javax.swing.JInternalFrame {

    private Empleados modificar;

    public ModificarPerfil() {
        initComponents();
        Modificarbutton.setEnabled(false);
    }

    public void Validar() {
        String ingreso = Contraseñafield.getText();
        int contador = 0, numero = 0, letras = 0, min = 0, mayus = 0;
        for (int i = 0; i < ingreso.length(); i++) {
            if (ingreso.charAt(i) >= 65 && ingreso.charAt(i) <= 90) {
                mayus++;
            } else if (ingreso.charAt(i) >= 97 && ingreso.charAt(i) <= 122) {
                min++;
            } else if (Character.isDigit(ingreso.charAt(i))) {
                numero++;
            }
            contador = 0;
            contador = contador + ingreso.length();
        }
        if (Contraseñafield.getText().isEmpty()) {
            jLabel8.setText("Campo Requerido");
        } else if (contador < 8) {
            jLabel8.setText("Contraseña invalidad");
        } else if (contador >= 8 && mayus >= 1 && min >= 1 && numero >= 1) {
            jLabel8.setText("");
        }
        String contra1 = Contraseñafield.getText();
        String contra2 = ConfirmacióndecontraseñaField.getText();
        if (Contraseñafield.getText().isEmpty()) {
            jLabel9.setText("Campo Requerido");
        } else if (!contra2.equals(contra1)) {
            jLabel9.setText("Contraseña invalida");
        } else if (contra2.equals(contra1)) {
            jLabel9.setText("");
        }
        if (CorreoLabel.getText().isEmpty() || FechaField.getText().isEmpty() || TelefonoField.getText().isEmpty() || Contraseñafield.getText().isEmpty() || ConfirmacióndecontraseñaField.getText().isEmpty() || jLabel9.getText().equals("Campo Requerido") || jLabel9.getText().equals("Contraseña invalida")) {
            Modificarbutton.setEnabled(false);
        } else {
            Modificarbutton.setEnabled(true);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        IDField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CorreoLabel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FechaField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TelefonoField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Contraseñafield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ConfirmacióndecontraseñaField = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        DireccionField = new javax.swing.JTextField();
        Modificarbutton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Mi Perfil");

        jLabel1.setText("Ingrese su ID:");

        IDField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Correo Electronico:");

        CorreoLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Fecha de nacimiento:");

        FechaField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("Telefono:");

        TelefonoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setText("Contraseña:");

        Contraseñafield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Contraseñafield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ContraseñafieldKeyReleased(evt);
            }
        });

        jLabel6.setText("Confirmación de contraseña:");

        ConfirmacióndecontraseñaField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ConfirmacióndecontraseñaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ConfirmacióndecontraseñaFieldKeyReleased(evt);
            }
        });

        jLabel7.setText("Dirección:");

        DireccionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Modificarbutton.setText("Modificar");
        Modificarbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarbuttonActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(DireccionField, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FechaField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(CorreoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ConfirmacióndecontraseñaField, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(Contraseñafield))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(140, 140, 140)
                                    .addComponent(jButton1))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(TelefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Modificarbutton)
                .addGap(318, 318, 318))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CorreoLabel)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaField))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(Contraseñafield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ConfirmacióndecontraseñaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(DireccionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(Modificarbutton)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModificarbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarbuttonActionPerformed
        //Boton para modificar los cambios
        if (modificar != null) {
            modificar.setCorreo(DireccionField.getText());
            modificar.setFecha_de_nacimiento(FechaField.getText());
            modificar.setTelefono(TelefonoField.getText());
            modificar.setContraseña(Contraseñafield.getText());
            modificar.setDireccion(DireccionField.getText());
            JOptionPane.showMessageDialog(rootPane, "Vendedor modificado exitosamente");
            DireccionField.setText("");
            ConfirmacióndecontraseñaField.setText("");
            Contraseñafield.setText("");
            FechaField.setText("");
            IDField.setText("");
            TelefonoField.setText("");
            ConfirmacióndecontraseñaField.setText("");
            CorreoLabel.setText("");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe buscar un vendedor por numero de ID");
        }

    }//GEN-LAST:event_ModificarbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        modificar = null;
        for (Empleados v : Main.usuarios) {
            if (v.getID().equals(IDField.getText())) {
                modificar = v;
                break;
            }
        }
        if (modificar != null) {
            CorreoLabel.setText(modificar.getCorreo());
            FechaField.setText(modificar.getFecha_de_nacimiento());
            TelefonoField.setText(modificar.getTelefono());
            Contraseñafield.setText(modificar.getContraseña());
            DireccionField.setText(modificar.getDireccion());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Vendedor no encontrado");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ContraseñafieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseñafieldKeyReleased
        // TODO add your handling code here:
        Validar();
    }//GEN-LAST:event_ContraseñafieldKeyReleased

    private void ConfirmacióndecontraseñaFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConfirmacióndecontraseñaFieldKeyReleased
        // TODO add your handling code here:
        Validar();
    }//GEN-LAST:event_ConfirmacióndecontraseñaFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmacióndecontraseñaField;
    private javax.swing.JTextField Contraseñafield;
    private javax.swing.JTextField CorreoLabel;
    private javax.swing.JTextField DireccionField;
    private javax.swing.JTextField FechaField;
    private javax.swing.JTextField IDField;
    private javax.swing.JButton Modificarbutton;
    private javax.swing.JTextField TelefonoField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
