package constanteJava;

/*Desarrolla un programa que calcule el precio final de un producto después de aplicar un descuento. Define una constante 
 * llamada DESCUENTO con el valor del porcentaje de descuento (por ejemplo, 0.1 para un 10% de descuento) y asigna un valor 
 * fijo al precio original del producto. Luego, calcula y muestra el precio final después de aplicar el descuento.*/

public class Ejercicio2 {
	
	public static void main(String[]args) {
		
		final double DESCUENTO= 0.30;
		
		int precioOriginal=5000;
		
		double precioFinal=precioOriginal-(precioOriginal*DESCUENTO);
		System.out.println("El precio final de su producto luego de un descuento de 30% es: "+precioFinal);
		
	}

}
