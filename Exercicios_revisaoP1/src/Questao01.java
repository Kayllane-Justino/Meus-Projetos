//Kayllane Justino de Melo - ADS
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x,y,z;
		String resposta;
		
		System.out.println("Digite o primeiro valor: ");
		x = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		y = sc.nextInt();
		
		z = ((x*y) +5);
		
		if (z <= 0) {
			resposta = "A";
			
		}else if (z <= 100){
			resposta = "B";
			
		}else {
			resposta = "C";
		}
		
		System.out.println("Sua resposta �: " + z + resposta);
		
		sc.close();
		
		

	}

}
