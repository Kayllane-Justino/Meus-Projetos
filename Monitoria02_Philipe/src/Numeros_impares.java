import java.util.Scanner;

public class Numeros_impares {

	public static void main(String[] args) {
		
		long produtoPar = 1;
		int somaImpar = 0;
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		for(numero = 0; numero <= 30; numero++){
			if(numero % 2 == 1){
				somaImpar = numero + numero;
				
				
			}else{
				if(numero % 2 == 0)
					produtoPar = numero * numero;
			}
			
			System.out.println("\nSoma dos Ímpares: " + somaImpar);
			System.out.println("Produto dos pares: " + produtoPar);
		}
			
				sc.close();
			}
		

	}


