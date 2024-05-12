package estructuraMultiple;

import javax.swing.JOptionPane;
/*Calcular el precio de un producto según su categoría y descuento*/
public class EjercicioSwitchCaseMultiple3 {
	public static void main(String[]args) {
		
		int categoria =Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el numero de la categoria: \n\n"
				+"1.Cliente con Descuento \n"
				+ "2.Cliente Regular \n\n"));
		final double descuento = 0.10;
		double precioBase = 0;
		double precioFinal;

		switch (categoria) {
		    case 1:
		    	precioBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cual es precio base del producto"));
		        precioFinal = precioBase - (precioBase * descuento);
		        System.out.println("El precio final del producto de categoría 1 es: $" + precioFinal);
		        break;
		    case 2:
		    	precioBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cual es precio base del producto"));
		        precioFinal = precioBase;
		        System.out.println("El precio final del producto de categoría 2 es: $" + precioFinal);
		        break;
		    default:
		        System.out.println("Categoría no válida");
		}

		
	}
}
