package constanteJava;

/*Crea un programa que convierta una temperatura de Celsius a Fahrenheit. Define una constante llamada
 *  FACTOR con el valor de 9/5 y otra constante llamada AJUSTE con el valor de 32. Asigna un valor fijo a 
 *  la temperatura en grados Celsius. Luego, calcula y muestra la temperatura equivalente en grados Fahrenheit 
 *  utilizando la fórmula: Fahrenheit = Celsius * FACTOR + AJUSTE.*/

public class Ejercicio3 {
	public static void main(String[]args) {
		
		final double FACTOR= 9.0/5;
		final int AJUSTE=32;
		
		double celsius=38.9;
		
		double fahrenheit=celsius*FACTOR+AJUSTE;
		
		System.out.println("El valor en Fahrenheit de la temperatura 38.9 celsius es: "+fahrenheit);
		
		
	}
	
	
}
