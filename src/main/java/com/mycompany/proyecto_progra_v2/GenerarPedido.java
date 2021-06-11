package com.mycompany.proyecto_progra_v2;
// @author MRobot404

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class GenerarPedido extends javax.swing.JInternalFrame {
 DefaultTableModel t;
    public void CargaAutomatica() {
        t = new DefaultTableModel(new String[]{"ID", "Precio Unitario", "Nombre de productos", "Descripcion del producto","Cantidad venta"," Total"}, Main.pedidos.size());
        jTable1.setModel(t);

        TableModel modelo = jTable1.getModel();
        for (int i = 0; i < Main.pedidos.size(); i++) {
            EstadoProductos e = Main.pedidos.get(i);
            modelo.setValueAt(e.getID(),i, 0);
            modelo.setValueAt(e.getPrecioUnitario(), i, 1);
            modelo.setValueAt(e.getNombreProducto(), i, 2);
            modelo.setValueAt(e.getDescripcionProducto(), i, 3);
            modelo.setValueAt(e.getCantidadVenta(), i, 4);
            modelo.setValueAt(e.getTotal(), i, 5);

        }
    }
    public GenerarPedido() {
        initComponents();
        CargaAutomatica();
        IDField.setText(BienvenidoUsuario.id2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        IDField = new javax.swing.JTextField();

        setClosable(true);
        setResizable(true);
        setTitle("Confirmar pedido");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setText("ID:");

        IDField.setEditable(false);
        IDField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1032, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDField;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
