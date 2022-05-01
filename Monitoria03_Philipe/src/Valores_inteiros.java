import java.util.Scanner;

public class Valores_inteiros {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int num3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número?");
		num1 = sc.nextInt();
		
		System.out.print("Informe o segundo número?");
		num2 = sc.nextInt();
		
		System.out.print("Informe o terceiro número?");
		num3 = sc.nextInt();
		
		sc.close();
		
		if(num1 > num2){
			if(num1 > num3) {
				System.out.println(" Numero maior: " + num1);
				System.out.println(" Numero maior: " + num2);
				System.out.println(" Numero maior: " + num3);
			}else if(num2 > num3){
				if(num2 > num1){
					System.out.println(" Numero maior: " + num2);
					System.out.println(" Numero maior: " + num3);
					System.out.println(" Numero maior: " + num1);					
				}
			}else if(num3 > num2){
				if(num3 > num1){
					System.out.println(" Numero maior: " + num3);
					System.out.println(" Numero maior: " + num2);
					System.out.println(" Numero maior: " + num1);
				}
			}			
		}else {
			System.out.println("");
		}	
	}
}
	


