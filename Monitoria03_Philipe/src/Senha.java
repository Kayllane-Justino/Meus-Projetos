import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		
		int senha;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a senha: ");
		senha = sc.nextInt();
		
		sc.close();
		
		if(senha ==1234){
			System.out.println("ACESSO PERMITIDO");
		
		} else {
			System.out.println("ACESSO NEGADO");
			
		}
		

	}

}
