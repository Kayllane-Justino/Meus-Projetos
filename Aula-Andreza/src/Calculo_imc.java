import java.util.Scanner;

public class Calculo_imc {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe sua altura:");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura*altura); // Math.pow(altura, 2)
		
		System.out.println("Seus IMC é: " + imc)
	}

}