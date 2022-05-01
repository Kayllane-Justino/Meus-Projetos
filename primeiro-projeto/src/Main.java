import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float lado, area;
		Scanner sc = new Scanner (System.in);
		//Entrada de dados
		System.out.println("Digite o lado da sala");
		lado = sc.nextFloat();
		area = lado * lado;
		//Saída de dados
		System.out.println("Área da Sala:" + area + "m2");
		
	}

}
