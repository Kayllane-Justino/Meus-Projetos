import java.util.Scanner;

public class Salario_multa {

	public static void main(String[] args) {
		
		double multa = 0.02;
		double salario = 1200.00;
		double conta1 = 200.00;
		double conta2 = 120.00;
		double resultado_conta1;
		double resultado_conta2;
		double resultado;
		
		Scanner sc = new Scanner(System.in);
		
		sc.close();
		
		resultado_conta1 = conta1 + (conta1 * multa);
		System.out.println( "conta1 com juros " + resultado_conta1);
		
		resultado_conta2= conta2 + (conta2 * multa);
		System.out.println( resultado_conta2);
		
		resultado = salario - (resultado_conta1 + resultado_conta2);
		System.out.println(resultado);

	}

}
