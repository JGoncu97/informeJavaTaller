package evidenciasHashMap;

import javax.swing.JOptionPane;

import operacionesHashMap.Operaciones3HashMap;
/*
 * Crear un algoritmo usando HashMap que permita crear un directorio donde registre el nombre y numero de telefono
 * -Agregar contacto
 * -Eliminar contacto
 * -Consultar por nombre de contacto
 * -Consultar lista de contacto
 */

public class Ejercicio3HashMap {
	public static void main(String[]args) {
		Operaciones3HashMap iniciar= new Operaciones3HashMap();
		
			iniciar.inicializacion();		
		 int codMenuPpal=0;
		 
			do {
				
				String menu="Menu del Sistema\n\n";
					menu+= "1. Agregar contacto\n";
					menu+= "2. Buscar contacto\n";
					menu+= "3. Eliminar contacto\n";
					menu+= "4. Consultar lista de contactos\n";
					menu+= "5. Salir\n\n";
					menu+="Por favor Seleccione una opcion \n\n";
				
					codMenuPpal=Integer.parseInt(JOptionPane.showInputDialog(menu));
					
					switch(codMenuPpal) {
					case 1:
						System.out.println("<<< Agregar contacto >>>");
						iniciar.registrarContacto();
						break;
					case 2:
						System.out.println("<<< Buscar contacto >>>");
						iniciar.busquedadContact();
						break;
					case 3:
						System.out.println("<<< Eliminar contacto >>>");
						iniciar.eliminarContact();
						break;
					case 4:
						System.out.println("<<< Consultar lista de contactos >>>");
						iniciar.consultarDirect();
						break;
					case 5:
						System.out.println("<<< Salidad del sistema. >>>");
						break;
					default:
						JOptionPane.showMessageDialog(null,"No corresponde a un "
								+ "codigo valido","ADVERTENCIA",JOptionPane.WARNING_MESSAGE );
						break;
					}
				
				
			}while(codMenuPpal !=5);
		
	}
}
