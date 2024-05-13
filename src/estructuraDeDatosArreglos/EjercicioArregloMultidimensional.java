package estructuraDeDatosArreglos;
/*crea un arreglo multidimensional (un cubo tridimensional) de enteros y lo inicializa con algunos valores.
 *  Luego, utiliza tres bucles anidados para recorrer el cubo e imprimir cada elemento junto con sus índices de fila, columna
 *   y profundidad.*/

public class EjercicioArregloMultidimensional {

	    public static void main(String[] args) {
	 
	        int[][][] cubo = {
	            {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
	            {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
	            {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
	        };

	    
	        for (int i = 0; i < cubo.length; i++) {
	            for (int j = 0; j < cubo[i].length; j++) {
	                for (int k = 0; k < cubo[i][j].length; k++) {
	                    System.out.println("Elemento [" + i + "][" + j + "][" + k + "]: " + cubo[i][j][k]);
	                }
	            }
	        }
	    }
	}


