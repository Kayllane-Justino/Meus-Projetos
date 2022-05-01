import java.util.Scanner;

public class Variaveis_trocadas {

	public static void main(String[] args) {
		
		int numA;
		int numB;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		numA = sc.nextInt();
		
		System.out.print("Informe o segundo número?");
		numB = sc.nextInt();
		
		sc.close();
		
		System.out.println("O valor do número A: " + numB);
		System.out.println("O valor do número B: " + numA);

	}

}
