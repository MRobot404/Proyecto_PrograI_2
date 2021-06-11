package com.mycompany.proyecto_progra_v2;
// @author MRobot404

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class MostrarCarrito extends javax.swing.JInternalFrame {

    public MostrarCarrito() {
        initComponents();
        CargaAutomatica();
        IDField.setText(BienvenidoUsuario.id2);

    }

    public Float Precio;
    public static String Nombre;
    public static String Descripcion;
    public static int Cantidad;
    public static int CantidadResta;
    DefaultTableModel t;

    public void CargaAutomatica() {
        t = new DefaultTableModel(new String[]{"Precio", "Nombre", "Descripción", "Cantidad"}, Main.lista.size());
        jTable1.setModel(t);

        TableModel modelo = jTable1.getModel();

        for (int i = 0; i < Main.lista.size(); i++) {
            Producto e = Main.lista.get(i);
            modelo.setValueAt(e.getPrecioUnitario(), i, 0);
            modelo.setValueAt(e.getNombreProducto(), i, 1);
            modelo.setValueAt(e.getDescripcionProducto(), i, 2);
            modelo.setValueAt(e.getCantidadVenta(), i, 3);

        }
    }

    public void Agregarproductos() {
         Cantidad = Integer.parseInt(CantidadmenorField.getText());
          Precio = Float.valueOf(PrecioField.getText());
        EstadoProductos v=new EstadoProductos();
            v.setNombreProducto(NombreField1.getText());
            v.setDescripcionProducto(DescripcionField.getText());
            v.setCantidadVenta(Cantidad);
            v.setPrecioUnitario(Float.parseFloat(PrecioField.getText()));
            v.setTotal(Cantidad * Precio);
            v.setID(BienvenidoUsuario.id2);
            System.out.println("Enviado");
           
           
            Main.pedidos.add(v);
            for (int i = 0; i <Main.pedidos.size(); i++) {
                System.out.println(Main.pedidos.get(i).getID()+" " +Main.pedidos.get(i).getNombreProducto()+Main.pedidos.get(i).getDescripcionProducto()+Main.pedidos.get(i).getCantidadVenta()+Main.pedidos.get(i).getPrecioUnitario()+Main.pedidos.get(i).getTotal());
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        PrecioField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        DescripcionField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NombreField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CantidadField = new javax.swing.JTextField();
        AgregarField = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        CantidadmenorField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        IDField = new javax.swing.JTextField();
        ActualizarButton = new javax.swing.JButton();

        setClosable(true);
        setTitle("Carrito");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Precio:");

        PrecioField.setEditable(false);
        PrecioField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("Nombre:");

        DescripcionField.setEditable(false);
        DescripcionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Descripción:");

        NombreField1.setEditable(false);
        NombreField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("Cantidad disponible:");

        CantidadField.setEditable(false);
        CantidadField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CantidadField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadFieldActionPerformed(evt);
            }
        });

        AgregarField.setText("Agregar al carrito");
        AgregarField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Cantidad a comprar:");

        CantidadmenorField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setText("ID:");

        IDField.setEditable(false);
        IDField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ActualizarButton.setText("Actualizar");
        ActualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PrecioField, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(DescripcionField)
                    .addComponent(NombreField1)
                    .addComponent(CantidadField))
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CantidadmenorField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AgregarField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ActualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(PrecioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(CantidadmenorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NombreField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(DescripcionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CantidadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgregarField)
                    .addComponent(ActualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int seleccionar = jTable1.rowAtPoint(evt.getPoint());
        PrecioField.setText(String.valueOf(jTable1.getValueAt(seleccionar, 0)));
        NombreField1.setText(String.valueOf(jTable1.getValueAt(seleccionar, 1)));
        DescripcionField.setText(String.valueOf(jTable1.getValueAt(seleccionar, 2)));
        CantidadField.setText(String.valueOf(jTable1.getValueAt(seleccionar, 3)));
    }//GEN-LAST:event_jTable1MouseClicked

    private void AgregarFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarFieldActionPerformed
        // TODO add your handling code here:
        Agregarproductos();
    }//GEN-LAST:event_AgregarFieldActionPerformed

    private void CantidadFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadFieldActionPerformed

    private void ActualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarButtonActionPerformed
        // TODO add your handling code here:
        int c;
        Producto aux;
        Precio = Float.valueOf(PrecioField.getText());
        Nombre = NombreField1.getText();
        Descripcion = DescripcionField.getText();
        Cantidad = Integer.parseInt(CantidadField.getText());
        CantidadResta = Integer.parseInt(CantidadmenorField.getText());
        try {
            c = jTable1.getSelectedRow();
            aux = Main.lista.get(c);
            aux.setNombreProducto(Nombre);
            aux.setPrecioUnitario(Precio);
            aux.setDescripcionProducto(Descripcion);
            aux.setCantidadVenta(Cantidad - CantidadResta);
           
          
           
           
            NombreField1.setText("");
            PrecioField.setText("");
            DescripcionField.setText("");
            CantidadField.setText("");
            CantidadmenorField.setText("");
            CargaAutomatica();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escoger una fila");
        }
    }//GEN-LAST:event_ActualizarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarButton;
    private javax.swing.JButton AgregarField;
    private javax.swing.JTextField CantidadField;
    javax.swing.JTextField CantidadmenorField;
    private javax.swing.JTextField DescripcionField;
    private javax.swing.JTextField IDField;
    private javax.swing.JTextField NombreField1;
    private javax.swing.JTextField PrecioField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
