import java.util.Scanner;

public class Exercicio_cnh {

	public static void main(String[] args) {
		
		//> = 18 anos
		
		String nome;
		int idade;
		
			
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o seu nome: "); //quando bota "ln" a resposta vai para póxima linha
		nome = sc.next();
		System.out.println("----------------");
		System.out.println("Qual a sua idade? ");
		idade = sc.nextInt();
		System.out.println("----------------");
	
		
		sc.close();
		
		/*
		if (expressão booleana) {
		// bloco de código 1
		} else {
		// bloco de código 2
		}
		 */
		
		if(idade >= 18){
			System.out.println("Voce PODE tirar sua CNH!! parabens!");
		} else {
			System.out.println("Voce NÃO pode tirar sua CNH!! Infelizmente");
		}
			
		
	}

}
