import java.util.Scanner;

public class NomeDoNumero_case {

	public static void main(String[] args) {
		
		String numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero entre 1 e 10:");
		numero = sc.next();
		
		switch (numero) {
	
		case "1":
			System.out.println("UM");
		break;
		
		case "2":
			System.out.println("DOIS");
		break;
		
		case "3":
			System.out.println("TR�S");
		break;
		
		case "4":
			System.out.println("TR�S");
		break;
		
		case "5":
			System.out.println("TR�S");
		break;
		
		case "6":
			System.out.println("TR�S");
		break;
		
		case "7":
			System.out.println("TR�S");
		break;
		
		case "8":
			System.out.println("TR�S");
		break;
		
		case "9":
			System.out.println("TR�S");
		break;
		
		case "10":
			System.out.println("TR�S");
		break;
		
		default:
			System.out.println("N�mero inv�lido!!");
			
			sc.close();
				
		
		
		}

	}

}
