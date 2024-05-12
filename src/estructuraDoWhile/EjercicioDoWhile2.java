package estructuraDoWhile;

import javax.swing.JOptionPane;
/*Cálculo del factorial de un número*/
public class EjercicioDoWhile2 {
	public static void main(String[]args) {
	        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para calcular su factorial:"));
	        int factorial = 1,contador = 1;
	       

	        do {
	            factorial *= contador;
	            contador++;
	        } while (contador <= numero);

	        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
	        
	}
}
