package aulamonitoriamicael;

public class Monitoria_01 {

	public static void main(String[] args) {
		int a = 30;
		int b = 20;
		int c = a + b;
		
		System.out.printf("Valor C: %d\n", c);
		b = 10;
		System.out.printf("Valor B = %d, \nvalor C = %d", b, c);
		c = a + b;
		System.out.printf("\nValor A = %d, \nvalor B = %d, \nvalor c = %d", a,b, c);
		System.out.printf("\nValor A: %d\nValor B: %d", a, b);
		System.out.println("\nValor A: " + a + "\nValor B: " + b);		
	}
	
	{
	
		int a = 10;
		int b = 20;
		int c = a;
		b = c;
		a = b;
		System.out.println("Questão 2");
		System.out.printf("Valor c = %d, valor c = %d, valor c = %d", a, b, c);
			
	}

}
