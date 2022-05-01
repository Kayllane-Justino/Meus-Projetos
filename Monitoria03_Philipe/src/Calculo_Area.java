import java.util.Scanner;

public class Calculo_Area {

	public static void main(String[] args) {
		
		int poligono;
		int medida;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos lados tem seu poligono");
		poligono = sc.nextInt();
		
		if(poligono ==3){
			System.out.println("Informe as medidas do triangulo");
			int medida1 = sc.nextInt();
		}
		
		sc.close();
		
	
		
	}

}
