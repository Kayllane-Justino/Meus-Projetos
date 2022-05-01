//Kayllane Justino de Melo - ADS
import java.util.Scanner;
public class Questao04_PrecoUnitario {

	public static void main(String[] args) {
		
		int quantidade, valor, total;
		String produto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o produto: ");
		produto = sc.next();
		
		System.out.println("Iforme a quantidade do produto: ");
		quantidade = sc.nextInt();
		
		System.out.println("Informe o valor do produto: ");
		valor = sc.nextInt();
		
		sc.close();
		
		total = quantidade * valor;
		
		if(quantidade <=5) {
			System.out.println("Desconto de 2%, vai pagar apenas " + total*0.98 + " reais ");
		}else if(quantidade > 5 && quantidade <= 10) {
			System.out.println("Desconto de 3%, vai pagar apenas " + total*0.97 + " reais ");
		}else {
			System.out.println("Desconto de 5%, vai pagar apenas " + total*0.95 + " reais ");
		}

	}

}
