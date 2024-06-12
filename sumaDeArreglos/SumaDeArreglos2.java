package sumaDeArreglos;

//Sumar dos arreglos unidimensionales
public class SumaDeArreglos2 {
	public static void main(String[]args) {
		
		int[] arreglo1 = {1, 2, 3, 4, 5};
        int[] arreglo2 = {6, 7, 8, 9, 10};
        int[] sumaArreglos = new int[arreglo1.length];

        for (int i = 0; i < arreglo1.length; i++) {
        	
            sumaArreglos[i] = arreglo1[i] + arreglo2[i];
            
        }

        System.out.print("La suma de los dos arreglos es: ");
        
        for (int i = 0; i < sumaArreglos.length; i++) {
        	
            System.out.print(sumaArreglos[i] + " ");
            
        }
		
	}
}
