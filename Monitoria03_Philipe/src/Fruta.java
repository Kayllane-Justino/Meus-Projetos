import java.util.Scanner;

public class Fruta {

	public static void main(String[] args) {
		
		double macad;
		double macamd;
		int quant;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas maçã? ");
		quant = sc.nextInt();
		
		sc.close();
		
		macamd = (0.30 * quant);
		macad = (0.25 * quant);
		
		if(quant < 12){
			System.out.println("Quantidade: " + quant);
			System.out.println("O valor é: " + macamd);
		}else if(quant >= 12) {
			System.out.println("Quantidade: " + quant);
			System.out.println("O valor é: " + macad);
		}else {
			System.out.println("");
		}
		
		

	}

}
