package estructuraMultiple;

import javax.swing.JOptionPane;

/*Determinar el rango de edad de una persona*/

public class EjercicioIfMultiple3 {
	public static void main(String[]args) {
		
		int edad =Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
		String rangoEdad = "";

		if (edad >= 0 && edad <= 12) {
		    rangoEdad = "Niño";
		} else if (edad >= 13 && edad <= 19) {
		    rangoEdad = "Adolescente";
		} else if (edad >= 20 && edad <= 35) {
		    rangoEdad = "Joven adulto";
		} else if (edad >= 36 && edad <= 65) {
		    rangoEdad = "Adulto";
		} else if (edad > 65) {
		    rangoEdad = "Adulto mayor";
		} else {
		    rangoEdad = "Edad no válida";
		}

		System.out.println("La persona de " + edad + " años pertenece al rango de edad: " + rangoEdad);

		
	}
}
