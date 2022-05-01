//Kayllane Justino de Melo - ADS
import java.util.Scanner;
public class Questao03_PesoPlaneta {

	public static void main(String[] args) {
		
		double peso, pesoPlaneta;
		int cod_plan;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1- Mercurio, 2- Venus, 3- Marte, 4- Jupiter, 5- Saturno, 6- Urano");
		
		System.out.println("Informe o planeta 1 a 6");
		cod_plan = sc.nextInt();
		
		System.out.println("Informe o seu peso: ");
		peso = sc.nextInt();
		
		sc.close();
		
		switch(cod_plan){
		
		case 1:
			pesoPlaneta = (peso / 10) * 0.37;
			System.out.println("Seu peso em Mercurio é: " + pesoPlaneta);
		break;
		
		case 2:
			pesoPlaneta = (peso / 10) * 0.88;
			System.out.println("Seu peso em Venus é: " + pesoPlaneta);
		break;
		
		case 3:
			pesoPlaneta = (peso / 10) * 0.38;
			System.out.println("Seu peso em Marte é: " + pesoPlaneta);
		break;
		
		case 4:
			pesoPlaneta = (peso / 10) * 2.64;
			System.out.println("Seu peso em Jupiter é: " + pesoPlaneta);
		break;
		
		case 5:
			pesoPlaneta = (peso / 10) * 1.15;
			System.out.println("Seu peso em Saturno é: " + pesoPlaneta);
		break;
		
		case 6:
			pesoPlaneta = (peso / 10) * 1.17;
			System.out.println("Seu peso em Urano é: " + pesoPlaneta);
		break;
		
	
		
		}

	}

}
