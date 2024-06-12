package estructurasDeDatosArrayList;

import java.util.ArrayList;
//Crear una lista de frutas y agregarles frutas a la lista
public class Ejercicio1ArrayList {
	 public static void main(String[] args) {
	        
	        ArrayList<String> listaFrutas = new ArrayList<>();

	      
	        listaFrutas.add("Manzana");
	        listaFrutas.add("Banana");
	        listaFrutas.add("Cereza");
	        listaFrutas.add("Durazno");

	        
	        System.out.println("Lista de frutas:");
	        for (String fruta : listaFrutas) {
	            System.out.println(fruta);
	        }
	    }
}
