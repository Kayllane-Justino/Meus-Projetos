import java.util.Scanner;

public class Variaveis_trocadas {

	public static void main(String[] args) {
		
		int numA;
		int numB;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro n�mero: ");
		numA = sc.nextInt();
		
		System.out.print("Informe o segundo n�mero?");
		numB = sc.nextInt();
		
		sc.close();
		
		System.out.println("O valor do n�mero A: " + numB);
		System.out.println("O valor do n�mero B: " + numA);

	}

}
