package evidenciasHashMap;

import javax.swing.JOptionPane;
import operacionesHashMap.Operaciones1HashMap;
/*
 *Crear un algoritmo que permita el registro de informacion de inventarios de un supermercado donde tenga un menu que permita
 *-Agregar producto
 *-Buscar Producto
 *-Actualizar producto
 *-Eliminar producto
 *-Mostrar inventario 
 */

public class Ejercicio1HashMap {
    public static void main(String[] args) {
        Operaciones1HashMap iniciar = new Operaciones1HashMap();
        iniciar.proceso();
        
        int codMenuPpal = 0;
        
        do {
            String menu = "Menu del sistema\n\n";
            menu += "1. Agregar Producto \n";
            menu += "2. Buscar Producto\n";
            menu += "3. Actualizar cantidad de Producto\n";
            menu += "4. Eliminar Producto\n";
            menu += "5. Mostrar Inventario\n";
            menu += "6. Salir\n\n";
            menu += "Por favor Seleccione una opcion \n";
            
            codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch (codMenuPpal) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Registrar Producto");
                    iniciar.RegistrarProductos();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Buscar Producto");
                    iniciar.consultarProducto();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Actualizar cantidad Producto");
                    iniciar.ActualizarUnidades();
                    iniciar.consultarProductoYUnidades();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Eliminar Producto");
                    iniciar.BorrarUnidades();
                    iniciar.consultarProductoYUnidades();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Mostrar Inventario");
                    iniciar.consultarProductoYUnidades();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Salir");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (codMenuPpal != 6);
    }
}
