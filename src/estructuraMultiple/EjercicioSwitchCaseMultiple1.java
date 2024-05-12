package estructuraMultiple;

import javax.swing.JOptionPane;

/*Determinar el precio de envío según el destino y el peso del paquete*/

public class EjercicioSwitchCaseMultiple1 {
	public static void main(String[]args) {
		
		int destino =Integer.parseInt(JOptionPane.showInputDialog("Por favor elija la opcion segun el destino: \n\n"
				+ "1.Nacional \n"
				+ "2.Internacional \n"));
		double peso =Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el peso del paquete"));
		double costoEnvio = 0;

		if (destino==1) {
		    switch ( (int)peso) {
		        case 1:
		            costoEnvio = 5.0;
		            break;
		        case 2:
		            costoEnvio = 7.0;
		            break;
		        default:
		            costoEnvio = 10.0;
		    }
		} else if (destino==2) {
		    switch ((int) peso) {
		        case 1:
		            costoEnvio = 10.0;
		            break;
		        case 2:
		            costoEnvio = 15.0;
		            break;
		        default:
		            costoEnvio = 20.0;
		    }
		} else {
		    System.out.println("Destino no válido");
		}

		System.out.println("El costo de envío es: $" + costoEnvio);

		
	}
}
