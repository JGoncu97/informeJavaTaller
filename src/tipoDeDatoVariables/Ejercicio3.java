package tipoDeDatoVariables;

/*Cree un algoritmo donde tenga dos variable muestre primeramente 1 variable y luego cambie su contenido con el de la segunda variable*/

public class Ejercicio3 {
	
	public static void main(String[]args) {
		//Creamos dos variables de tipo double, para que los datos coincidan a la hora de cambiarlos
		double valorA= 3.14;
		double valorB= 10.2;
		/*Ya teniendo las variables imprimimos en consola el valor de la primera 
		 variable y luego en la parte de abajo cambiamos su contenido por el de la segunda variable y volvemos a imprimir
		 el valor de la variable mostrando el nuevo valor*/
		System.out.println("El valor de la variable es: "+valorA);
		valorA=valorB;
		System.out.println("El valor cambiado de la variable es: "+valorA);
		
		
		
		
	}

}
