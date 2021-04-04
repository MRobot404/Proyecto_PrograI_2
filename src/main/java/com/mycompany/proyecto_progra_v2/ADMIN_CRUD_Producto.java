package com.mycompany.proyecto_progra_v2;
// @author MRobot404
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
 
public class ADMIN_CRUD_Producto extends javax.swing.JInternalFrame {

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
    
     private void ExportarArchivo(File archivo) {
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            fichero = new FileWriter(archivo);
            pw = new PrintWriter(fichero);
            for (Producto u : Main.lista) {
                String linea = u.getPrecioUnitario() + "|" + u.getNombreProducto() + "|" + u.getDescripcionProducto() + "|" + u.getCantidadVenta();
               pw.println(linea);
            }
        } catch (Exception ex) {
        ex.printStackTrace();
        }
        finally{
            try {
                if (fichero!=null) {
                    fichero.close();
                }
            } catch (Exception ex) {
            ex.printStackTrace();
            }
            
    }
        

    }
     
      private void CargarArchivo(File archivo) {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

          
            String linea;

            while ((linea = br.readLine()) != null) {
                  
                String arreglo[] = linea.split("|");
                if (arreglo.length == 4) {
                    Producto u = new Producto();
                    u.setPrecioUnitario(Float.valueOf(arreglo[0]));
                    u.setNombreProducto(arreglo[1]);
                    u.setDescripcionProducto(arreglo[2]);
                    u.setCantidadVenta(Integer.valueOf(arreglo[3]));   
                    Main.lista.add(u);
                }

            }
            CargaAutomatica();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();

            }
        }

    }
    public ADMIN_CRUD_Producto() {
        initComponents();
         CargaAutomatica();
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        PrecioField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DescricionFIeld = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CantidadField = new javax.swing.JTextField();
        ExportarButton = new javax.swing.JButton();
        ModificarButton = new javax.swing.JButton();
        ImportarButton = new javax.swing.JButton();
        IngresarButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        NombreField = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Crear,Consultar y Modificar Productos");

        jLabel3.setText("Precio unitario:");

        jLabel4.setText("Descripción del Producto:");

        jLabel5.setText("Cantidad  disponible:");
        jLabel5.setToolTipText("");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        ExportarButton.setText("Exportar");
        ExportarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarButtonActionPerformed(evt);
            }
        });

        ModificarButton.setText("Modificar");
        ModificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarButtonActionPerformed(evt);
            }
        });

        ImportarButton.setText("Importar ");
        ImportarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportarButtonActionPerformed(evt);
            }
        });

        IngresarButton.setText("Ingresar");
        IngresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre del producto :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(IngresarButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ModificarButton)
                            .addGap(225, 225, 225)
                            .addComponent(ExportarButton)
                            .addGap(18, 18, 18)
                            .addComponent(ImportarButton)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(286, 286, 286)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(265, 265, 265)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(207, 207, 207)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PrecioField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DescricionFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CantidadField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(NombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(PrecioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(DescricionFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(CantidadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ModificarButton)
                                .addComponent(IngresarButton)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ExportarButton)
                                .addComponent(ImportarButton))
                            .addGap(12, 12, 12)))
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int seleccionar = jTable1.rowAtPoint(evt.getPoint());
        PrecioField.setText(String.valueOf(jTable1.getValueAt(seleccionar, 0)));
        NombreField.setText(String.valueOf(jTable1.getValueAt(seleccionar, 1)));
        DescricionFIeld.setText(String.valueOf(jTable1.getValueAt(seleccionar, 2)));
        CantidadField.setText(String.valueOf(jTable1.getValueAt(seleccionar, 3)));
    }//GEN-LAST:event_jTable1MouseClicked

    private void ExportarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarButtonActionPerformed
        JFileChooser seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("csv", "csv");
        seleccionarArchivo.setFileFilter(filtro);
        int seleccionar = seleccionarArchivo.showOpenDialog(this);
        if (seleccionar == JFileChooser.APPROVE_OPTION) {
            File archivo = seleccionarArchivo.getSelectedFile();
            ExportarArchivo(archivo);
            JOptionPane.showMessageDialog(this, "Exportado exitosamente");
        }

    }//GEN-LAST:event_ExportarButtonActionPerformed

    private void ModificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarButtonActionPerformed
        // Boton de modificar
        int c;
        Producto aux;
        Float Precio = Float.valueOf(PrecioField.getText());
        String Nombre = NombreField.getText();
        String Descripcion = DescricionFIeld.getText();
        int Cantidad = Integer.parseInt(CantidadField.getText());
        try {
            c = jTable1.getSelectedRow();
            aux = Main.lista.get(c);
            aux.setNombreProducto(Nombre);
            aux.setPrecioUnitario(Precio);
            aux.setDescripcionProducto(Descripcion);
            aux.setCantidadVenta(Cantidad);
            NombreField.setText("");
            PrecioField.setText("");
            DescricionFIeld.setText("");
            CantidadField.setText("");
            CargaAutomatica();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escoger una fila");
        }
    }//GEN-LAST:event_ModificarButtonActionPerformed

    private void ImportarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportarButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("csv", "csv");
        seleccionarArchivo.setFileFilter(filtro);
        int seleccionar = seleccionarArchivo.showOpenDialog(this);
        if (seleccionar == JFileChooser.APPROVE_OPTION) {
            File archivo = seleccionarArchivo.getSelectedFile();
            CargarArchivo(archivo);
        }
    }//GEN-LAST:event_ImportarButtonActionPerformed

    private void IngresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarButtonActionPerformed
        // Ingresar productos
        Float Precio = Float.valueOf(PrecioField.getText());
        String Nombre = NombreField.getText();
        String Descripcion = DescricionFIeld.getText();
        int Cantidad = Integer.parseInt(CantidadField.getText());
        boolean ingresado = false;
        for (Producto u : Main.lista) {
            if (u.getNombreProducto().equals(Nombre)) {
                ingresado = true;
                break;
            }
        }
        if (ingresado == true) {
            JOptionPane.showMessageDialog(this, "Producto registrado anteriormente");
        } else {
            Producto productos = new Producto();
            productos.setNombreProducto(Nombre);
            productos.setPrecioUnitario(Precio);
            productos.setDescripcionProducto(Descripcion);
            productos.setCantidadVenta(Cantidad);
            Main.lista.add(productos);
            NombreField.setText("");
            PrecioField.setText("");
            DescricionFIeld.setText("");
            CantidadField.setText("");
            JOptionPane.showMessageDialog(this, "Producto registrado exitosamente");
            CargaAutomatica();
        }
    }//GEN-LAST:event_IngresarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CantidadField;
    private javax.swing.JTextField DescricionFIeld;
    private javax.swing.JButton ExportarButton;
    private javax.swing.JButton ImportarButton;
    private javax.swing.JButton IngresarButton;
    private javax.swing.JButton ModificarButton;
    private javax.swing.JTextField NombreField;
    private javax.swing.JTextField PrecioField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
