// Kayllane Justino de Melo e Vitor Alberto - ADS

import java.util.Scanner;
public class Questao04 {

	public static void main(String[] args) {
		
		int ano_nasci, inicio_empresa, idade, tempo_trabalho;
		int ano_atual = 2022;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o seu ano de nascimento: ");
		ano_nasci = sc.nextInt();
		
		System.out.println("Em qual ano você começou a trabalhar na empresa:? ");
		inicio_empresa = sc.nextInt();
		
		tempo_trabalho = ano_atual - inicio_empresa;
		
		idade = ano_atual - ano_nasci;
		
		System.out.println("Sua idade é: " + idade +  " anos ");
		
		System.out.println("Seu tempo de trabalho é: " + tempo_trabalho + " anos");
		
		sc.close();
		
		if (idade >= 65) {
			System.out.println("Requerer aponsetadoria!!");
			
		}else if (tempo_trabalho >= 30) {
			System.out.println("Requerer aponsetadoria!!");
			
		}else if ((idade >= 65) && (tempo_trabalho >= 25)) {
			System.out.println("Requerer aponsetadoria!!");
			
		}else {
			System.out.println("Não requerer!! ");
		}
		
		
		
		

	}

}
