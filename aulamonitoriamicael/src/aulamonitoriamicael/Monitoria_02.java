package aulamonitoriamicael;

import java.util.Scanner;

public class Monitoria_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resposta = "";
		
		System.out.println("Digite o valor de x: ");
		int x = sc.nextInt();
		System.out.print("Digite o valor de y: ");
		int y = sc.nextInt();
		
		int z = (x * y) + 5;
		
		if (z <= 0) {
			resposta = "A";
		}
		else { 
			if (z <= 100) {
				resposta = "B";
			}
			else {
				 resposta = "C";
			}
		}
		
		System.out.printf("z = %d e reposta = %s", z, resposta );
	
		sc.close();
	}	
	
}
