import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float lado, area;
		Scanner sc = new Scanner (System.in);
		//Entrada de dados
		System.out.println("Digite o lado da sala");
		lado = sc.nextFloat();
		area = lado * lado;
		//Sa�da de dados
		System.out.println("�rea da Sala:" + area + "m2");
		
	}

}
