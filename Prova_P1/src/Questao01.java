// Kayllane Justino de Melo e Vitor Alberto - ADS

import java.util.Scanner;
public class Questao01 {

	public static void main(String[] args) {
		
		String nome;
		double nota1, nota2, nota3, nota4, media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o seu nome: ");
		nome = sc.next();
		System.out.println("-----------------");
		System.out.println("Qual a sua nota1? ");
		nota1 = sc.nextInt();
		System.out.println("-----------------");
		System.out.println("Qual a sua nota2? ");
		nota2 = sc.nextInt();
		System.out.println("-----------------");
		System.out.println("Qual a sua nota3? ");
		nota3 = sc.nextInt();
		System.out.println("-----------------");
		System.out.println("Qual a sua nota4? ");
		nota4 = sc.nextInt();
		System.out.println("-----------------");
		
		
		sc.close();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		if(media >=7){
			System.out.println("APROVADO!! " + "Sua média é: " + media);
		} else {
			System.out.println("REPROVADO!! " + "Sua média é: " + media);
		}
	}




}


