package operacionesHashTable;

import java.util.Hashtable;

import javax.swing.JOptionPane;

public class OperacionesEjercicio1 {
	 Hashtable<String, Integer> conteo;
	 
	
	 public void registrarPalabras() {
		 conteo = new Hashtable<>();
		 //Solicitar palabras al usuario
		 String palabra=JOptionPane.showInputDialog(null,"Ingrese una frase: ");
		 
		 //Verificar que el input no este vacio
		 if(palabra !=null  && !palabra.isEmpty()) {
			 //Separar las palabras por frases
			 String[] palabras = palabra.split("\\s+");
			 
			 //Contador de palabras usando for each
			 for(String separador: palabras) {
				 
				 //Verfificar si la palabra existe en el HashTable
				 if(conteo.containsKey(palabra)) {
					 
					 //Si la palabra ya esta en el hashtable, incrementar el contador
					 conteo.put(palabra, conteo.get(palabra)+ 1);
				 }else {
					 conteo.put(palabra, 1);
				 }
			 }
			
			 conteoFrase();
			 
			 
		 }else {
			 //Mostrar alerta si no se muestra ninguna palabra
			 JOptionPane.showMessageDialog(null,"No se ha introducido ninguna frase.");
		 }
		
	 }
	 
	 public void conteoFrase() {
		 //Crear el mensaje para mostrar la frecuencia de cada palabra
		 System.out.println("<<< Frecuencia de palabras >>>");
			String mensaje="";
			for(String frecuencia: conteo.keySet()) {
				mensaje+=frecuencia+": "+ conteo.get(frecuencia);
				
			}
			
		 JOptionPane.showMessageDialog(null, mensaje +"\n");
	 }
	 
		

}
