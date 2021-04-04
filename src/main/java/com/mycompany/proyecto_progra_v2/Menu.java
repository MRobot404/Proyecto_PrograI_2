package com.mycompany.proyecto_progra_v2;
// @author MRobot404
public class Menu extends javax.swing.JFrame {
    public Menu() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Crear = new javax.swing.JMenuItem();
        RUDVendedora = new javax.swing.JMenuItem();
        ProductosCRUD = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jMenu1.setText("Empleados ");

        Crear.setText("Crear cuenta");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });
        jMenu1.add(Crear);

        RUDVendedora.setText("Consultar,Modificar y eliminar cuenta");
        RUDVendedora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RUDVendedoraActionPerformed(evt);
            }
        });
        jMenu1.add(RUDVendedora);

        jMenuBar1.add(jMenu1);

        ProductosCRUD.setText("Productos");
        ProductosCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosCRUDActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Crear,Consultar, Modificar productos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        ProductosCRUD.add(jMenuItem1);

        jMenuBar1.add(ProductosCRUD);

        jMenu2.setText("jMenu2");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Cerrar Sesión");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        // TODO add your handling code here:
     ADMIN_Crear_cuenta_Vendedora v=new ADMIN_Crear_cuenta_Vendedora();
     escritorio.add(v);
     v.show();
        
        
    }//GEN-LAST:event_CrearActionPerformed

    private void RUDVendedoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RUDVendedoraActionPerformed
        // TODO add your handling code here:
        ADMIN_RUD_Cuenta_Vendedor v=new ADMIN_RUD_Cuenta_Vendedor();
        escritorio.add(v);
        v.show();
    }//GEN-LAST:event_RUDVendedoraActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login v=new Login();
        v.setVisible(true);
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        this.dispose();
        Login v=new Login();
        v.setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void ProductosCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosCRUDActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_ProductosCRUDActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         ADMIN_CRUD_Producto v=new ADMIN_CRUD_Producto();
        escritorio.add(v);
        v.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Crear;
    private javax.swing.JMenu ProductosCRUD;
    private javax.swing.JMenuItem RUDVendedora;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
