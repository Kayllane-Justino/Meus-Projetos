import java.util.Scanner;

public class Caixa_Eletronico {

	public static void main(String[] args) {
		
		int valor = 0;
		int nota100;
		int nota50;
		int nota20;
		int nota10;
		int nota5;
		int nota2;
		int resultado;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		if(nota100>= nota100) {
			nota100 = valor / 100; 
			valor = valor % 100;   
			if (nota100 != 0)
				System.out.println(nota100 + " notas de R$ 100,00");
				
		} 
		
		if(nota50 >= nota50) {
			nota50 = valor / 50;
			valor = valor % 50;
			if (nota50 != 0)
				System.out.println(nota50 + " notas de R$ 50,00");
			
		}
		
		if(nota20 >= nota20) {
			nota20 = valor / 20;
			valor = valor % 20;
			if (nota20 != 0)
				System.out.println(nota20 + " notas de R$ 20,00");
		}
		
		if(nota10 >= nota10) {
			nota10 = valor / 10;
			valor = valor % 10;
			if (nota10 != 0)
				System.out.println(nota10 + " notas de R$ 10,00");
		}
		
		if(nota5 >= nota5) {
			nota5 = valor / 5;
			valor = valor % 5;
			if (nota5 != 0)
				System.out.println(nota5 + " notas de R$ 5,00"); 
			
			if(nota2 >= nota2) {
				nota2 = valor / 2;
				valor = valor % 2;
				if (nota2 != 0)
					System.out.println(nota2 + " notas de R$ 2,00");
				
				sc.close();
			}
		}
		}
		
		
		
		
			
		
		
		

	}


