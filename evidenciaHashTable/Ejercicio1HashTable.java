package evidenciaHashTable;




import javax.swing.JOptionPane;

import operacionesHashTable.OperacionesEjercicio1;

public class Ejercicio1HashTable {
	public static void main(String[]args) {
		OperacionesEjercicio1 iniciar= new OperacionesEjercicio1();
		
		/*
		 * Escribe una función que tome un texto como entrada y devuelva un Hashtable con el conteo de cada palabra en el texto.
		 */
		
		int codMenuPpal=0;
		
		do {
			
			String menu="Menu del sistema\n\n";
			menu+="1. Agregar Frase \n";
			menu+="2. Salir\n\n";
			menu+="Por favor Seleccione una opcion \n";
		
			codMenuPpal=Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (codMenuPpal) {
			case 1:
				System.out.println("<<< Registro de Frase >>>");
				iniciar.registrarPalabras();
				break;
			case 2:
				System.out.println("<<< Salir del Sistema >>>");
				break;
			default:
				
		
			}
			
		}while(codMenuPpal !=2);
		
        
		
	}

}
