import java.util.Scanner;

public class PruebaEquipos {
	public static void main (String args[])
	 {
		 
		 Scanner entra = new Scanner(System.in);
		 int num1 = 0;
		 
		 System.out.println("ingresa el numero de equipos a capturar \n");
		 num1 = Integer.parseInt(entra.nextLine());
		 
		 Equipo equipos[] = new Equipo [num1];
		 
			for(int i = 0; i < num1; i++) { // ciclo para insertar datos
			
			System.out.println("ingrese el equipo \n");
			String equipo = entra.nextLine();
			System.out.println("ingrese los puntos obtenidos \n");
			int puntos = Integer.parseInt(entra.nextLine());
			equipos[i] = new Equipo(equipo,puntos);
			 
			
			
		}
			for(int i = 0; i < equipos.length   ; i++) {
			
				for(int j = i + 1; j < equipos.length  ; j++) { // ciclo para realizar el ordenamiento 
				
				  
					if (equipos[i].getPuntos() < equipos[j].getPuntos()) {
					     Equipo aux = equipos[i];
					     equipos[i] = equipos[j];
					     equipos[j] = aux;
				  }
				
			    }
			}
			
			System.out.println("equipo: " + " " + "\t puntos obtenidos: \n");
			//System.out.println(equipos.length);
			
			for(int i = 0; i < equipos.length     ; i++) { //cliclo que me ayuda a mostrar los datos
		        
				System.out.println(equipos[i].toString());
			}
	    
	 }
}
