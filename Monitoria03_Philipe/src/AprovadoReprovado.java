import java.util.Scanner;

public class AprovadoReprovado {

	public static void main(String[] args) {
		
		String nome;
		double nota;
				
			Scanner sc = new Scanner(System.in);
				
		System.out.println("Qual o seu nome: ");
		nome = sc.next();
		
		System.out.println("Qual a sua nota? ");
		nota = sc.nextInt();
				
		
		sc.close();
				
				if(nota >=7){
					System.out.println("Passou direto!!");
				} else if (nota >=5) {
					System.out.println("Prova de Recuperação!!");
				
				} else {
					System.out.println("Rprovado!!");
					
				}
			}




	}


