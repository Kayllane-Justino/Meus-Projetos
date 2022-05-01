// Kayllane Justino de Melo e Vitor Alberto - ADS

import java.util.Scanner;
public class Questao01 {

	public static void main(String[] args) {
		
		double distan_total, total_combs, consum_med;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe qual foi a distância total percorrida em km: ");
		distan_total = sc.nextDouble();
		
		System.out.println("Informe o total de combustível utilizado: ");
		total_combs = sc.nextDouble();
		
		
		sc.close();
		
		consum_med = distan_total/total_combs;
		
		System.out.println("Sua distância percorrida foi: " + distan_total + " km ");
		
		System.out.println("O total do seu combustível foi: " + total_combs + " litros ");
		System.out.println("Seu consumo médio: " + consum_med);
		
		

	}

}
