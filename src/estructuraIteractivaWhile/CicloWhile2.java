package estructuraIteractivaWhile;

import javax.swing.JOptionPane;

/*Contador ascendente*/

public class CicloWhile2 {
	public static void main(String[]args) {
		
		     
		        
		    
		        int limite =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero positivo: "));
		        
		        int contador = 1;
		        
		        while (contador <= limite) {
		            System.out.println(contador);
		            contador++;
		        }
		

	}
}
