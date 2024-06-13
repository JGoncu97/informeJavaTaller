package evidenciaHashTable;
import javax.swing.JOptionPane;

import operacionesHashTable.Operaciones2Ejercicio;
/*
 * Crea un algoritmo que permita el registro de de estudiantes:
 * -Registro de notas
 * -Consulta de estudiante por nombres
 * -consultar las notas de todos los estudiantes
 * -eliminar las notas de un estudiante
 */
public class Ejercicio2HashTable {
	public static void main(String[]args) {
		Operaciones2Ejercicio iniciar= new Operaciones2Ejercicio();
		
		iniciar.inicializacion();
		
		 int codMenuPpal=0;
	        
		  
			do {
				
				String menu="Menu del sistema\n\n";
				menu+="1. Agregar estudiante \n";
				menu+="2. Buscar estudiante por nombre\n";
				menu+="3. Eliminar notas\n";
				menu+="4. Consultar notas\n";
				menu+="5. Salir\n\n";
				menu+="Por favor Seleccione una opcion \n";
			
				codMenuPpal=Integer.parseInt(JOptionPane.showInputDialog(menu));
				
				switch (codMenuPpal) {
				case 1:
					
					JOptionPane.showMessageDialog(null,"Agregar estudiante " );
					iniciar.registroEstudiante();
					
					break;
				case 2:
					
					JOptionPane.showMessageDialog(null,"Buscar estudiante por nombre" );
					iniciar.consultaEstudianteN();
					
					break;
				case 3:
					
					
					JOptionPane.showMessageDialog(null,"Eliminar notas" );
						
						iniciar.eliminarNota();
						iniciar.notasEstudiantes();
				
				
					
					break;
				case 4:
					
					JOptionPane.showMessageDialog(null,"Consultar notas" );
					
					iniciar.notasEstudiantes();
					break;
				
				case 5:
					
					JOptionPane.showMessageDialog(null,"Salir" );
					
					 
					break;
				
				default:
					
					JOptionPane.showMessageDialog(null,"No corresponde a un "
							+ "codigo valido","ADVERTENCIA",JOptionPane.WARNING_MESSAGE );
					break;
						
				}
				
			}while(codMenuPpal !=5);
			
		
		
	}
}
