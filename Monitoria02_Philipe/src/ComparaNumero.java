import java.util.Scanner;

public class ComparaNumero {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número:");
		num1 = sc.nextInt();
		
		System.out.println("Informe o segundo número:");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("Seu resultado é: " + num1);
			
		}else{
			System.out.println("Seu resultado é: " + num2);
		}
		
		

	}

}
