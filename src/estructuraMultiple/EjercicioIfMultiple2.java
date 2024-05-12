package estructuraMultiple;

import javax.swing.JOptionPane;

/*Calcular el descuento aplicable según el tipo de cliente y el monto de la compra, si la compra es mayor a 100 y el cliente es VIP
 *  se le aplicara un descuento del 20% y si es menor que 100 el monto le realizara un descuento de 10%
 * si es mayor a 50 pero es cliente regular se aplicara un descuento de 10% y si es menor a 50 se realizara un descuento del 5%*/

public class EjercicioIfMultiple2 {
	public static void main(String[]args) {
		
		int tipoCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del tipo de cliente: \n\n"
				+ "1.VIP \n"
				+ "2.Regular \n"));
		double montoCompra =0;
		double descuento = 0;

		if (tipoCliente== 1) {
			montoCompra =Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de su compra: "));
		    if (montoCompra > 100) {
		        descuento = 20.0;
		    } else {
		        descuento = 10.0;
		    }
		} else if (tipoCliente==2) {
			montoCompra =Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de su compra: "));
		    if (montoCompra > 50) {
		        descuento = 10.0;
		    } else {
		        descuento = 5.0;
		    }
		} else {
		    System.out.println("Tipo de cliente no válido");
		}

		System.out.println("El descuento aplicable es: " + descuento + "% y su compra tendra el valor de "+ (montoCompra-(montoCompra*(descuento/100))));

		
	}

}
