import java.util.Scanner;

public class NumeroDecrescenteWhile {

	public static void main(String[] args) {
		
		int x;
		int i =1;
		
		Scanner sc = new Scanner(System.in);
		

			System.out.println("Digite o valor");
			x = sc.nextInt();
			
			sc.close();
			
			while(i <= x) {
				System.out.println("Ordem:" + i++);
		}
	}

}
