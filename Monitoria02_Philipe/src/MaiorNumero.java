import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro n�mero?");
		num1 = sc.nextInt();
		
		System.out.print("Informe o segundo n�mero?");
		num2 = sc.nextInt();
		
		sc.close();
		
		if(num1 > num2){
			System.out.print("O maior n�mero digitado foi:" + num1);
			} else {
				System.out.print("O maior n�mero digitado foi:" + num2 );
			}
		
			
			
		}
		

	}

