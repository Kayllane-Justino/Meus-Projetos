import java.util.Scanner;

public class Crime {

	public static void main(String[] args) {
		
		String nome;
		int soma;
		int res1;
		int res2;
		int res3;
		int res4;
		int res5;
	
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Telefonou para a vitima? 1(Sim) ou 0(N�o): ");
		res1 = sc.nextInt();
		System.out.println("Esteve no local do crime? 1(Sim ou 0)N�o: ");
		res2 = sc.nextInt();
		System.out.println("Mora perto da v�tima? 1(Sim ou 0)N�o: ");
		res3 = sc.nextInt();
		System.out.println("Devia para a vitima? 1(Sim ou 0)N�o: ");
		res4 = sc.nextInt();
		System.out.println("J� trabalhou com a vitima? 1(Sim ou 0)N�o: ");
		res5 = sc.nextInt();
		
		sc.close();
		
		soma = (res1 + res2 + res3 + res4 + res5);
		
		if(soma < 2) {
			System.out.println("Inocente!! ");
			
			
		}else if(soma == 2 ){
		System.out.println("Suspeita!! ");
		
		}else if(soma == 3 || soma == 4){
			System.out.println("C�mplice!! ");
		}else if(soma == 5){
			System.out.println(" Assassino!!");
		}else { 
			System.out.println(" ERRO");
			

		}
		
	}
	
}
