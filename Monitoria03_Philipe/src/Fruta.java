import java.util.Scanner;

public class Fruta {

	public static void main(String[] args) {
		
		double macad;
		double macamd;
		int quant;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas ma��? ");
		quant = sc.nextInt();
		
		sc.close();
		
		macamd = (0.30 * quant);
		macad = (0.25 * quant);
		
		if(quant < 12){
			System.out.println("Quantidade: " + quant);
			System.out.println("O valor �: " + macamd);
		}else if(quant >= 12) {
			System.out.println("Quantidade: " + quant);
			System.out.println("O valor �: " + macad);
		}else {
			System.out.println("");
		}
		
		

	}

}
