package estructuraMultiple;

import javax.swing.JOptionPane;

/*Determinar el día de la semana y horario de atención*/

public class EjercicioSwitchCaseMultiple2 {
	public static void main(String[]args) {
		
		int diaSemana =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del dia a consultar: \n\n"
				+ "1.Lunes \n"
				+ "2.Martes \n"
				+ "3.Miercoles \n"
				+ "4.Jueves \n"
				+ "5.Viernes \n"
				+ "6.Sabado \n"
				+ "7.Domingo \n\n"));
		int horario =0;

		switch (diaSemana) {
		    case 1:
		    case 2:
		    case 3:
		    case 4:
		    case 5:
		        System.out.println("Es un día laboral");
		        horario =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del horario a consultar: \n\n"
						+ "1.Primer Turno \n"
						+ "2.Segundo Turno \n\n"));
		        switch (horario) {
		            case 1:
		                System.out.println("Horario de atención: 9:00 - 17:00");
		                break;
		            case 2:
		                System.out.println("Horario de atención: 10:00 - 18:00");
		                break;
		            default:
		                System.out.println("Horario no válido");
		        }
		        break;
		    case 6:
		    case 7:
		        System.out.println("Es fin de semana, no hay atencion al cliente.");
		        break;
		    default:
		        System.out.println("Día no válido");
		}

		
	}

}
