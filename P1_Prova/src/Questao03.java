// Kayllane Justino de Melo e Vitor Alberto - ADS

import java.util.Scanner;
public class Questao03 {

	public static void main(String[] args) {
		
		double preco_produto;
		int cod_origem, procedencia;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o pre�o do produto: ");
		preco_produto = sc.nextDouble();
		
		System.out.println("Insira [1]- Sul [2]- Norte [3]- Leste [4]- Oeste [5]- Nordeste [6]- Suldeste [7]- Centro-Oeste ");
		cod_origem = sc.nextInt();
		
		sc.close();
		
		switch (cod_origem){
		
		case 1:
			System.out.println("O seu pre�o � " + preco_produto + " reais " + "e sua proced�ncia � SUL" );
		break;
		
		case 2:
			System.out.println("O seu pre�o � " + preco_produto + " reais " + "e sua proced�ncia � NORTE");
		break;
		
		case 3:
			System.out.println("O seu pre�o � " + preco_produto + " reais " + "e sua proced�ncia � LESTE");
		break;
		
		case 4:
			System.out.println("O seu pre�o � " + preco_produto + " reais " + "e sua proced�ncia � OESTE");
		break;
		
		case 5:
			System.out.println("O seu pre�o � " + preco_produto + " reais " + "e sua proced�ncia � NORDESTE");
		break;
		
		case 6:
			System.out.println("O seu pre�o � " + preco_produto + " reais " + "e sua proced�ncia � SULDESTE");
		break;
		
		case 7:
			System.out.println("O seu pre�o � " + preco_produto + " reais " + "e sua proced�ncia � CENTRO-OESTE");
		break;
		
		default:
			System.out.println("Produto importado!!");
		
		
		}
		

	}

}
