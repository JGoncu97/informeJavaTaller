package operacionesHashTable;

import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Operaciones3Ejercicio {
	Hashtable<String, String> productos;
	
	public void inicializar() {
		productos= new Hashtable<>();
	}
	
	public void registroProd() {
		System.out.println("<<< Registrar Productos >>>");
		String codigo=JOptionPane.showInputDialog("Ingrese el codigo del producto");
		String nombre=JOptionPane.showInputDialog("Ingrese el nombre del producto");
		
		productos.put(codigo, nombre);
		
		System.out.println("<<< Registro de producto Exitoso!!");
		
	}
	
	public void consultaProdCd() {
		System.out.println("<<< Buscar producto por codigo >>>");
		String codigo=JOptionPane.showInputDialog("Ingrese el codigo del producto: ");
		if(productos.containsKey(codigo)) {
			System.out.println("Producto encontrado");
			System.out.println("El producto que usted consulta es: "+productos.get(codigo));
		}else {
			System.out.println("Producto no encontrado en el sistema");
		}
	}
	
	public void consultaInv() {
		System.out.println("<<< Mostrar inventario >>>");
		for(String prod: productos.keySet()) {
			System.out.println("Codigo: "+prod+" Producto: "+productos.get(prod));
		}
		
		
	}
	
	public void eliminarReg() {
		System.out.println("<<< Eliminar Registros >>>");
		productos.clear();
		System.out.println(productos);
	}
}
