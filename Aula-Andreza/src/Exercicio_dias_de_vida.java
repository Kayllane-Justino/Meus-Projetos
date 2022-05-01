import java.util.Scanner;

public class Exercicio_dias_de_vida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        //1. Ler o nome
				//2. Ler a idade
				//3.Cálculo dos dias de vida
				//4. Exibir o resultado: MARIA, VOCÊ JÁ VIVEU 6935 DIAS.
				
				// Entrada de dados
				Scanner entrada = new Scanner(System.in);
				
				//1.Ler o nome
				System.out.println("Informe seu nome");
				String nome = entrada.next();
				
				//2. Ler a idade
				System.out.println("Informe sua idade");
				int idade = entrada.nextInt();
				
				//3.Cálculo dos dias de vida
				int diasVida = idade * 365;
				
				//4. Exibir o resultado: MARIA, VOCÊ JÁ VIVEU 6935 DIAS.
				System.out.println(nome + ", você já viveu" + idade * 365 + " dias.");
				
				
				
				

			}
	}


