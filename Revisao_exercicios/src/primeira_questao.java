//Kayllane Justino
import java.util.Scanner;
public class primeira_questao {

	public static void main(String[] args) {
		
		double x,y;
		String resposta;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de x: ");
		x = sc.nextDouble();
		
		System.out.println("Informe o valor de y: ");
		y = sc.nextDouble();
		
		
		
		sc.close();
		
		int z = (x * y) + 5;
		
		if(z <= 0) {
			System.out.println("A");
			z = sc.nextInt();
			
		}else if(z <= 100){
			System.out.println("B" + z);
			z = sc.nextInt();
			
		}else {
			System.out.println("C" + z);
			z = sc.nextInt();
		}
				
		
		

		
	}

}
