package com.mycompany.proyecto_progra_v2;
// @author MRobot404
import javax.swing.JOptionPane;
public class ADMIN_Crear_cuenta_Vendedora extends javax.swing.JInternalFrame {
  public static int generador_id;
    public ADMIN_Crear_cuenta_Vendedora() {
        initComponents();
        btnIngresar.setEnabled(false);
        Empleados empleados = new Empleados();
        generador_id = (int) (Math.random() * 10000000);
        System.out.println(generador_id);
        TEXTID.setText(String.valueOf(generador_id));
    }
    
    public void Validar() {
        if (NombreField.getText().isEmpty()) {
            jLabel9.setText("Campo Requerido");
        } else {
            jLabel9.setText("");
        }

        if (ApellidoField1.getText().isEmpty()) {
            jLabel10.setText("Campo Requerido");
        } else {
            jLabel10.setText("");
        }

        if (FechaField.getText().isEmpty()) {
            jLabel11.setText("Campo Requerido");
        } else {
            jLabel11.setText("");
        }

        if (TelefonoField.getText().isEmpty()) {
            jLabel12.setText("Campo Requerido");
        } else {
            jLabel12.setText("");
        }

        if (DireccionField.getText().isEmpty()) {
            jLabel13.setText("Campo Requerido");
        } else {
            jLabel13.setText("");
        }
        if (ApellidoField1.getText().isEmpty()) {
            jLabel10.setText("Campo Requerido");
        } else {
            jLabel10.setText("");
        }
//Verificar la contraseña 

        String ingreso = ContraseñaField.getText();
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

        if (ContraseñaField.getText().isEmpty()) {
            jLabel8.setText("Campo Requerido");
        } else if (contador < 8) {
            jLabel8.setText("Contraseña invalidad");
        } else if (contador >= 8 && mayus >= 1 && min >= 1 && numero >= 1) {
            jLabel8.setText("");
        }

        if (CorreoField1.getText().isEmpty()) {
            jLabel15.setText("Campo Requerido");
        } else if (!CorreoField1.getText().contains("@") || !CorreoField1.getText().contains(".")) {
            jLabel15.setText("Correo Invalido");
        } else {
            jLabel15.setText("");
        }
        String contra1 = ContraseñaField.getText();
        String contra2 = ContraseñaField1.getText();
        if (ContraseñaField1.getText().isEmpty()) {
            jLabel17.setText("Campo Requerido");
        } else if (!contra2.equals(contra1)) {
            jLabel17.setText("Contraseña invalida");
        } else if (contra2.equals(contra1)) {
            jLabel17.setText("");
        }

        if (NombreField.getText().isEmpty() || ApellidoField1.getText().isEmpty() || FechaField.getText().isEmpty() || TelefonoField.getText().isEmpty() || DireccionField.getText().isEmpty() || ApellidoField1.getText().isEmpty() || ContraseñaField.getText().isEmpty() || CorreoField1.getText().isEmpty() || jLabel15.getText().equals("Correo Invalido") || jLabel8.getText().equals("Contraseña invalidad") || ContraseñaField1.getText().isEmpty() || jLabel17.getText().equals("Contraseña invalida")) {
            btnIngresar.setEnabled(false);
        } else {
            btnIngresar.setEnabled(true);
        }

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CorreoField1 = new javax.swing.JTextField();
        NombreField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FechaField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ContraseñaField1 = new javax.swing.JTextField();
        ApellidoField1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TEXTID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TelefonoField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DireccionField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ContraseñaField = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Crear cuenta vendedora");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));

        jLabel14.setText("Correo:");

        jLabel2.setText("Nombre: ");

        CorreoField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CorreoField1KeyReleased(evt);
            }
        });

        NombreField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NombreFieldKeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));

        jLabel3.setText("Apellido;");

        FechaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FechaFieldKeyReleased(evt);
            }
        });

        jLabel16.setText("Contraseña: ");

        jLabel4.setText("Fecha de nacimineto: ");

        ContraseñaField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ContraseñaField1KeyReleased(evt);
            }
        });

        ApellidoField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ApellidoField1KeyReleased(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));

        jLabel5.setText("Telefono: ");

        TelefonoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TelefonoFieldKeyReleased(evt);
            }
        });

        jLabel6.setText("Dirección:");

        DireccionField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DireccionFieldKeyReleased(evt);
            }
        });

        jLabel7.setText("Contraseña: ");

        ContraseñaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ContraseñaFieldKeyReleased(evt);
            }
        });

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(btnIngresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TelefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FechaField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ApellidoField1)
                                    .addComponent(NombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DireccionField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CorreoField1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ContraseñaField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ContraseñaField1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TEXTID, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(NombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ApellidoField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FechaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(TelefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(DireccionField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(CorreoField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(ContraseñaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(ContraseñaField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnIngresar)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CorreoField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorreoField1KeyReleased
        // TODO add your handling code here:
        Validar();
    }//GEN-LAST:event_CorreoField1KeyReleased

    private void NombreFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreFieldKeyReleased
        // TODO add your handling code here:
        Validar();
    }//GEN-LAST:event_NombreFieldKeyReleased

    private void FechaFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FechaFieldKeyReleased
        // TODO add your handling code here:
        Validar();
    }//GEN-LAST:event_FechaFieldKeyReleased

    private void ContraseñaField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseñaField1KeyReleased
        // TODO add your handling code here:
        Validar();
    }//GEN-LAST:event_ContraseñaField1KeyReleased

    private void ApellidoField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidoField1KeyReleased
        // TODO add your handling code here:
        Validar();
    }//GEN-LAST:event_ApellidoField1KeyReleased

    private void TelefonoFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoFieldKeyReleased
        // TODO add your handling code here:
        Validar();
    }//GEN-LAST:event_TelefonoFieldKeyReleased

    private void DireccionFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DireccionFieldKeyReleased
        // TODO add your handling code here:
        Validar();
    }//GEN-LAST:event_DireccionFieldKeyReleased

    private void ContraseñaFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseñaFieldKeyReleased
        // TODO add your handling code here:
        Validar();
    }//GEN-LAST:event_ContraseñaFieldKeyReleased

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        String correo = CorreoField1.getText();
        String nombre = NombreField.getText();
        String apellido = ApellidoField1.getText();
        String fechanacimiento = FechaField.getText();
        String ID = TEXTID.getText();
        String telefono = TelefonoField.getText();
        String direccion = DireccionField.getText();
        String contraseña = ContraseñaField.getText();
        boolean ingresado = false;

        for (Empleados u : Main.usuarios) {
            if (u.getID().equals(ID)) {
                ingresado = true;
                break;
            }

        }
        if (ingresado == true) {
            JOptionPane.showMessageDialog(this, "Usuario registrado anteriormente");
        } else {

            Empleados emple = new Empleados();
            emple.setID(ID);
            emple.setNombre(nombre);
            emple.setApellido(apellido);
            emple.setCorreo(correo);
            emple.setFecha_de_nacimiento(fechanacimiento);
            emple.setDireccion(direccion);
            emple.setTelefono(telefono);
            emple.setContraseña(contraseña);
            Main.usuarios.add(emple);
            generador_id = (int) (Math.random() * 10000000);
            CorreoField1.setText("");
            TEXTID.setText(String.valueOf(generador_id));
            NombreField.setText("");
            ApellidoField1.setText("");
            FechaField.setText("");
            TelefonoField.setText("");
            DireccionField.setText("");
            ContraseñaField.setText("");
            ContraseñaField1.setText("");
            JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoField1;
    private javax.swing.JTextField ContraseñaField;
    private javax.swing.JTextField ContraseñaField1;
    private javax.swing.JTextField CorreoField1;
    private javax.swing.JTextField DireccionField;
    private javax.swing.JTextField FechaField;
    private javax.swing.JTextField NombreField;
    private javax.swing.JTextField TEXTID;
    private javax.swing.JTextField TelefonoField;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
