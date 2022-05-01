import java.util.Scanner;

public class Ordem_Crescente {

	public static void main(String[] args) {
		
		int valor1;
		int valor2;
		int valor3;
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		valor1 = sc.nextInt();
		
		while(i < valor1) {
			System.out.println("Ordem:" + i++);
		}
		
		System.out.println("Digite o segundo valor :");
		valor2 = sc.nextInt();
		
		while(i < valor2) {
			System.out.println("Ordem:" + i++);
		}
		
		System.out.println("Digite o terceiro valor :");
		valor3 = sc.nextInt();
		
		while(i < valor3) {
			System.out.println("Ordem:" + i++);
		}
		sc.close();
		
		
		
		

	}

}
