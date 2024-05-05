package constanteJava;


/*Escribe un programa que calcule y muestre el área de un círculo. Define una constante llamada PI con el valor de π 
 * (aproximadamente 3.14159) y asigna un valor fijo al radio del círculo. Luego, calcula y muestra el área del círculo utilizando 
 * la fórmula: área = π * radio^2.
*/

public class Ejercicio1 {

	public static void main(String[]args) {
		final double PI= 3.14159;
		
		int radio=20;
		double area= (PI*radio)*radio;
		System.out.println("El area de un circulo es: "+area);
		
	}
		
}
