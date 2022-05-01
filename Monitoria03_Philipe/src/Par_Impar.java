import java.util.Scanner;

public class Par_Impar {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um valor inteiro: ");
	    numero = sc.nextInt();
	 
	    if(numero % 2 == 0){
	      System.out.print("Você informou um numero par");
	    }
	    else{
	      System.out.print("Você informou um numero impar");
	    }
	      sc.close();
	      
	    }
	    
	}
	

	    
	    
	
	     
	   
		

	
