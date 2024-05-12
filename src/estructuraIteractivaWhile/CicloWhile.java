package estructuraIteractivaWhile;

import javax.swing.JOptionPane;

/*Suma de números pares*/
 
public class CicloWhile {
	public static void main(String[]args) {
		int suma=0;
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que desea sumar"));
		int iniciarCiclo=Integer.parseInt(JOptionPane.showInputDialog("Cuantas veces desea sumar el numero?"));
		int repetidor=0;
		while(repetidor<=iniciarCiclo) {
				
			suma=numero+repetidor;
			
			System.out.println("Suma: "+ numero+ " + "+repetidor+" = "+suma);
			repetidor++;
		}
	
	}

}
