package estructurasDeControl;

/*Cree un programa que con un número entero. El programa debe determinar si el número es par e imprimir un mensaje indicando 
 * si lo es o no.*/

public class EjercicioIfDoble3 {
	public static void main(String[]args) {
		int numero=5;
		
		if (numero % 2 == 0) {
            System.out.println("El número ingresado es par.");
        } else {
            System.out.println("El número ingresado es impar.");
        }
		
	}

}
