package operacionesHashTable;

import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Operaciones2Ejercicio {
	Hashtable<String, Double> estudiantes;
	
	public void inicializacion() {
		estudiantes= new Hashtable<>();
	}
	
	
	public void registroEstudiante() {
		System.out.println("<<< Registrar Estudiante >>>");
		int contador=0;
		contador=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos estudiantes desea registrar?"));
		for(int i=0; i<contador; i++) {
		
		String nombre=JOptionPane.showInputDialog("Ingrese el nombre del estudiante "+(i+1));
		
			if(nombre !=null && !nombre.isEmpty()) {
				double notas;
			
				notas=Double.parseDouble(JOptionPane.showInputDialog("Ingrese las notas del estudiante "+nombre+": "));
			
				estudiantes.put(nombre,notas);
				System.out.println("<<< Registro Exitoso del estudiante!!");
			
			}else {
				System.err.println("Nombre de estudiante no valido");
			}
		}
	}
	
	
	public void consultaEstudianteN() {
		System.out.println("<<< Consultar estudiante por nombre >>>");
		String nombre="";
		nombre=JOptionPane.showInputDialog("Ingrese el nombre del estudiante a consultar");
		
		if(estudiantes.containsKey(nombre)) {
			System.out.println("<<< Estudiante Encontrado >>>");
			System.out.println("La nota de "+nombre+" es: "+estudiantes.get(nombre));
		}else {
			System.err.println("El estudiante no se encuentra en los registros");
		}
		
		
	}
	
	public void eliminarNota() {
		System.out.println("<<< Eliminar nota de estudiante >>>");
		String nombre="";
		
		nombre=JOptionPane.showInputDialog("Cual es el nombre del estudiante");
		
		if(estudiantes.containsKey(nombre)) {
			System.out.println("Estudiante encontrado");
			estudiantes.remove(nombre);
			System.out.println("<<< Nota eliminada de manera exitosa >>>");
		}else {
			System.err.println("El estudiante mencionado no se encuentra en los registros");
		}
		
		
	}
	
	public void notasEstudiantes() {
		System.out.println("<<< Consulta de Notas de Estudiantes");
		for(String notas: estudiantes.keySet()) {
			System.out.println(notas+": "+estudiantes.get(notas));
		}
		
		
	}
	
	
	
}
