package estructuraMultiple;

import javax.swing.JOptionPane;

/*Clasificar un número según su paridad y signo*/

public class EjercicioIfMultiple1 {
	public static void main (String[]args) {
		
		int numero =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

		if (numero >= 0) {
		    if (numero % 2 == 0) {
		        System.out.println("El número es positivo y par.");
		    } else {
		        System.out.println("El número es positivo e impar.");
		    }
		} else {
		    if (numero % 2 == 0) {
		        System.out.println("El número es negativo y par.");
		    } else {
		        System.out.println("El número es negativo e impar.");
		    }
		}

		
	}

}
