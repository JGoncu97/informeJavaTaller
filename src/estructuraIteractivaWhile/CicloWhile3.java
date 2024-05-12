package estructuraIteractivaWhile;

import javax.swing.JOptionPane;
/*Genere un contador de vocales utilizando el ciclo while*/
public class CicloWhile3 {
	public static void main(String[]args) {
	
	        String texto = JOptionPane.showInputDialog("Ingrese una cadena de texto: ");
	        
	        int contador = 0;
	        int i = 0;
	        
	        while (i < texto.length()) {
	            char caracter = texto.charAt(i);
	            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
	                contador++;
	            }
	            i++;
	        }
	        
	        System.out.println("El número de vocales en el texto es: " + contador);
	}

}
