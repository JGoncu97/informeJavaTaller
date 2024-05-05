package tipoDeDatoVariables;

/*Cree un algoritmo donde en diferentes variables almacene el nombre, apellido y la edad de x persona y muestrelo en consola*/

public class Ejercicio2 {
	public static void main(String[]args) {
		// Se crean dos variables de tipo String(Cadena de texto), para recibir el nombre y el apellido
		String nombre="Jose";
		String apellido = "Gonzalez";
		// Se crea una variable de tipo entero para almacenar la edad de una persona 
		int edad= 27;
		
		//Ya teniendo todas las variables requeridad, pasamos a mostrarla en consola
		System.out.println("El nombre de la persona es: "+nombre);
		System.out.println("El apellido de la persona es: "+apellido);
		System.out.println("la edad de la persona es: "+edad);
		//Siempre coincidiendo la variable con el tipo de dato que estamos utilizando
	}

}
