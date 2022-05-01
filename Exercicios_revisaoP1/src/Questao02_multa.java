//Kayllane Justino de Melo - ADS
import java.util.Scanner;
public class Questao02_multa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int velocidade;
		double multa = 12.00;
		double velo_a_mais;
		double valor_multa;
		
		System.out.println("Informe a velocidade: ");
		velocidade = sc.nextInt();
		
		sc.close();
		
		if(velocidade > 80) {
			System.out.println("Multado!! ");
			velo_a_mais = velocidade -80;
			valor_multa = velo_a_mais * multa;
			
			System.out.println("O valor da multa em reais foi: " + valor_multa);
			
		}else {
			System.out.println("Não foi multado!! ");
		}
	

	}

}
