package operacionesHashMap;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Operaciones3HashMap {
	HashMap<String,String> directorio;
	
	public void inicializacion() {
		directorio= new HashMap<>();
	}
	
	public void registrarContacto() {
		String nombre="",telefono="";
		int contador=0;
		
		contador=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos contactos desea agregar a su agenda?"));
		
		for(int i=0; i< contador; i++) {
			nombre=JOptionPane.showInputDialog("Ingrese el nombre de su contacto");
			telefono=JOptionPane.showInputDialog("Ingrese el numero celular de su contacto");
			
			directorio.put(nombre, telefono);
		}
		
		
	}
	
	public void busquedadContact() {
		String nombre="";
		
		nombre=JOptionPane.showInputDialog("Ingrese el nombre del contacto a consultar");
		
		if(directorio.containsKey(nombre)) {
			System.out.println("Contacto encontrado con exito!");
			System.out.println("Contacto: "+nombre+" Telefono: "+directorio.get(nombre));
		}else {
			System.err.println("El contacto no existe en el directorio");
		}
		
		
	}
	
	public void eliminarContact() {
		String nombre="";
		nombre=JOptionPane.showInputDialog("¿Que contacto deseas eliminar?");
		
		if(directorio.containsKey(nombre)) {
			System.out.println("Contacto encontrado");
			directorio.remove(nombre);
			System.out.println("Contacto eliminado");
		}else {
			System.err.println("El contacto indicado no se encuentra en el directorio");
		}
	}
	
	public void consultarDirect() {
		
		for(String contact: directorio.keySet()) {
			
			System.out.println("Contacto: "+contact+" Telefono: "+directorio.get(contact));
			
		}
		
	}
	
	
	
}
