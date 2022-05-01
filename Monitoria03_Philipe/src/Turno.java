import java.util.Scanner;

public class Turno {

	public static void main(String[] args) {
		
		String turno;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que turno você estuda? [M-manhã] [V-vespertino] [N-nortuno] ");
		turno = sc.next();
		
		if(turno == "M"){
			System.out.println("Bom dia! ");
		}else if(turno == "V"){
			System.out.println("Boa tarde! ");
		}else if(turno == "N"){
			System.out.println("Boa noite!");
		}else { 
			System.out.println("Turno invalido");
			
		}
	
		
		sc.close();

	}

}
