import java.util.Scanner;

public class Tabajara {

	public static void main(String[] args) {
		
		double salario;
		double aumento;
		double resultado;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o seu salário atual? ");
		salario = sc.nextDouble();
		
		sc.close();
		
		if(salario <= 280 ) {
			System.out.println("Salário com aumento: " + salario * 1.20);
			System.out.println("Reajuste de: 0,20%");
			
		} else if (salario> 280 && salario>= 700 ) {
			System.out.println("Salário com aumento: " + salario * 1.15);
			System.out.println("Reajuste de: 0,15%");
			
		} else if (salario<= 1500 && salario >=700) {
			System.out.println("Salário com aumento: " + salario * 1.10);
			System.out.println("Reajuste de: 0,%");
		} else { 
			System.out.println(" erro ");
		}
		
		
	
		

	}

}
