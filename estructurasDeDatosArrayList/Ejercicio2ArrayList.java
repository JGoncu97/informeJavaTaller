package estructurasDeDatosArrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;
//Crear una lista deportiva y alimentarla, verificar que contenga  un elemento en la lista existen
//si es correcto que lo remueva de la lista
public class Ejercicio2ArrayList {
	public static void main(String[] args) {
       
        ArrayList<String> listaDeportes = new ArrayList<>();

       
        listaDeportes.add("Fútbol");
        listaDeportes.add("Baloncesto");
        listaDeportes.add("Tenis");
        listaDeportes.add("Natación");
        
        System.out.println("La lista deportiva es la siguiente: "+listaDeportes);
       
        String deporteABuscar = JOptionPane.showInputDialog("Que elemento de la lista desea eliminar");
        boolean contieneTenis = listaDeportes.contains(deporteABuscar);
        System.out.println("¿La lista contiene '"+deporteABuscar+"'? " + contieneTenis); 

        
        listaDeportes.remove(deporteABuscar);

      
        System.out.println("Lista de deportes después de eliminar '"+deporteABuscar+"':");
        for (String deporte : listaDeportes) {
            System.out.println(deporte);
        }
    }

}
