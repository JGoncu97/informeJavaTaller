package estructuraDoWhile;

import javax.swing.JOptionPane;
/*Suma de números ingresados por el usuario hasta que se ingrese un número negativo*/
public class EjercicioDoWhile3 {
	    public static void main(String[] args) {
	    	
	        int suma = 0;
	        int numero;
	        do {
	            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número (o un número negativo para terminar):"));
	            if (numero >= 0) {
	                suma += numero;
	            }
	        } while (numero >= 0);
	        JOptionPane.showMessageDialog(null, "La suma de los números ingresados es: " + suma);
	    
	}

}
