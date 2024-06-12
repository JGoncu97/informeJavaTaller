package estructurasDeDatosArrayList;

import java.util.ArrayList;
//Crearmos una lista para ciudades , luego agregamos ciudades a esa lista, consultamos el tamaño 
//de la lista y utilizando la funcion set cambiamos algunas ciudades de la lista.
public class Ejercicio3ArrayList {
	
	    public static void main(String[] args) {
	        
	        ArrayList<String> listaCiudades = new ArrayList<>();

	        
	        listaCiudades.add("Nueva York");
	        listaCiudades.add("Londres");
	        listaCiudades.add("Paris");
	        listaCiudades.add("Tokio");

	        
	        System.out.println("Lista original de ciudades:");
	        for (String ciudad : listaCiudades) {
	            System.out.println(ciudad);
	        }

	        
	        listaCiudades.set(1, "Berlín"); 
	        listaCiudades.set(2, "Madrid"); 

	        
	        int tamano = listaCiudades.size();
	        System.out.println("\nTamaño del ArrayList: " + tamano);

	       
	        System.out.println("Lista actualizada de ciudades:");
	        for (String ciudad : listaCiudades) {
	            System.out.println(ciudad);
	        }
	    }
}
