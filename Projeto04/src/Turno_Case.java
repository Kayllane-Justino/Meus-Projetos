import java.util.Scanner;

public class Turno_Case {

	public static void main(String[] args) {
		
		String turno;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que turno você estuda? [M-manhã] [V-vespertino] [N-nortuno] ");
		turno = sc.next();
		
		switch (turno) {
		
		case "m":
		System.out.println(turno = "Bom dia!! "); 
		
		break;
		
		case "v":
			System.out.println(turno = "Boa tarde!! ");
			
		break;
			
		case "n":
			System.out.println(turno = "Boa noite!!"); 
		break;
		
		default:
			System.out.println("Turno invalido");
			
		}
		
		sc.close();
		
	
	
		

	}

}
