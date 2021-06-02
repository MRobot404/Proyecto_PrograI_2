    
package com.mycompany.proyecto_progra_v2;
 //@author MRobot404
import java.util.ArrayList;
public class Main {
public static ArrayList<Empleados>usuarios;
public static ArrayList<Producto>lista;
public static ArrayList<Pedidos>pedido;
    public static void main(String[] args) {
        usuarios=new ArrayList<>();
        lista=new ArrayList<>();
        pedido=new ArrayList<>();
        Login log=new Login();
        log.setVisible(true);
    
    }
    
}
