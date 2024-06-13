package evidenciaHashTable;
import javax.swing.JOptionPane;

import operacionesHashTable.Operaciones3Ejercicio;
/*
 * Crear un algoritmo para el inventario de un superMercado:
 * -Agregar productos
 * -Buscar productos por codigo
 * -Mostrar todos los productos 
 * -Limpiar Registros
 */
public class Ejercicio3Hashtable {
	public static void main(String[]args) {
		Operaciones3Ejercicio iniciar=new Operaciones3Ejercicio();
		iniciar.inicializar();
		 int codMenuPpal=0;
		 
		do {
			
			String menu="Menu del Sistema\n\n";
				menu+= "1. Agregar productos\n";
				menu+= "2. Buscar productos por codigo\n";
				menu+= "3. Mostrar todos los productos \n";
				menu+= "4. Limpiar Registros\n";
				menu+= "5. Salir\n\n";
				menu+="Por favor Seleccione una opcion \n\n";
			
				codMenuPpal=Integer.parseInt(JOptionPane.showInputDialog(menu));
				
				switch(codMenuPpal) {
				case 1:
					System.out.println("<<< Agregar productos >>>");
					iniciar.registroProd();
					break;
				case 2:
					System.out.println("<<< Buscar productos por codigo >>>");
					iniciar.consultaProdCd();
					break;
				case 3:
					System.out.println("<<< Mostrar todos los productos >>>");
					iniciar.consultaInv();
					break;
				case 4:
					System.out.println("<<< Limpiar Registros >>>");
					iniciar.eliminarReg();
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
