import java.util.Scanner;

public class Exercicio_temperatura {

	public static void main(String[] args) {
		
		double Celsius;
		double resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Temperatura o Grau em Celsius ");
		Celsius = sc.nextDouble();
		
		sc.close();
		
		resultado = (Celsius * 1.8)+32;
		
		
		System.out.println("Temperatura: " + resultado + " F°");

	}

}
