package estructuraDeDatosArreglos;
/*crea una matriz bidimensional de enteros y la inicializa con algunos valores. Luego, utiliza un bucle anidado para recorrer
 *  la matriz e imprimir cada elemento junto con sus índices de fila y columna.*/
public class EjercicioArregloBidimensional {
	public static void main(String[]args) {
	        int[][] matriz = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	     
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                System.out.println("Elemento [" + i + "][" + j + "]: " + matriz[i][j]);
	            }
	        }
	    
	}

}
