import java.util.Scanner;

public class Exercicio_salario_multa {

	public static void main(String[] args) {
		
		//1. Guardar os valores em variáveis 
		//2. Calcular os juros para conta1
		//3. Calcular os juros para conta2
		//4. Somar os juros à conta1
		//5. Somar os juros à conta2
		//6. Subtrair do salário a soma de conta1 e conta2 resultado do passo 4 e 5
		//7. Mostrar o salário final
		
		//1. Guardar os valores em variáveis
		double salario = 1200.00;
		double conta1 = 200.00;
		double conta2 = 120.00;
		double multa = 0.02;
		
		//2. Calcular os juros para conta1
		double jurosConta1 = conta1 * 0.02; // conta1 * (2/100) ==2%
		
		//3. Calcular os juros para conta2
		double jurosConta2 = conta2 * multa;
		
		//4. Somar os juros à conta1
		double conta1Atualizada = conta1 + jurosConta1;
		
		//5. Somar os juros à conta2
		double conta2Atualizada = conta2 + jurosConta2;
		
		//6. Subtrair do salário a soma de conta1 e conta2 resultado do passo 4 e 5
		double novoSalario = salario - (conta1Atualizada + conta2Atualizada);
		
		//7. Mostrar o salário final
		System.out.println("Restará R$" + novoSalario + " do salário de joão!");
		
		Scanner entrada = new Scanner(System.in);
		

	}

}
