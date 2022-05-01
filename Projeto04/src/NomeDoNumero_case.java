import java.util.Scanner;

public class NomeDoNumero_case {

	public static void main(String[] args) {
		
		String numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número entre 1 e 10:");
		numero = sc.next();
		
		switch (numero) {
	
		case "1":
			System.out.println("UM");
		break;
		
		case "2":
			System.out.println("DOIS");
		break;
		
		case "3":
			System.out.println("TRÊS");
		break;
		
		case "4":
			System.out.println("TRÊS");
		break;
		
		case "5":
			System.out.println("TRÊS");
		break;
		
		case "6":
			System.out.println("TRÊS");
		break;
		
		case "7":
			System.out.println("TRÊS");
		break;
		
		case "8":
			System.out.println("TRÊS");
		break;
		
		case "9":
			System.out.println("TRÊS");
		break;
		
		case "10":
			System.out.println("TRÊS");
		break;
		
		default:
			System.out.println("Número inválido!!");
			
			sc.close();
				
		
		
		}

	}

}
