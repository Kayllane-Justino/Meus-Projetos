import java.util.Scanner;

public class Tempo_vida {

	public static void main(String[] args) {
		
				int anos = 365;
				int idade;
				String nome;
				int tempo_vida;
			
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("|-------OLÁ-------|");
				System.out.println("|Informe seu nome |");
				System.out.println("|Informe sua idade|");
				System.out.println("|-----------------|");
				System.out.println("");
				System.out.println("Informe seu nome");
				nome = sc.next();
				System.out.println("Informe sua idade");
				idade = sc.nextInt();
				
				sc.close();
				
				tempo_vida = (idade * anos);
				
				System.out.println(nome + " Voce viveu:" + tempo_vida);
				
				
	}

}
