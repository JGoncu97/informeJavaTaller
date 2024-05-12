package estructuraDoWhile;

import javax.swing.JOptionPane;
/*Validación de entrada para un número positivo*/
public class EjercicioDoWhile {
	public static void main(String[]args) {
	
		        int numero;
		        do {
		            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número positivo:"));
		            if (numero <= 0) {
		                JOptionPane.showMessageDialog(null, "El número debe ser positivo. Intenta de nuevo.");
		            }
		        } while (numero <= 0);
		        JOptionPane.showMessageDialog(null, "Número positivo ingresado: " + numero);
		
	}

}
