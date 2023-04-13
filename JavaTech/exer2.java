package JavaTech;
import java.util.Scanner;
public class exer2 {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4, MediaFinal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota:");
		nota1 = leia.nextFloat();
		
		System.out.println("Entre com a segunda nota:");
		nota2 = leia.nextFloat();

		System.out.println("Entre com a terceira nota:");
		nota3 = leia.nextFloat();

		System.out.println("Entre com a quarta nota:");
		nota4 = leia.nextFloat();
		
		MediaFinal = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("Sua nota final é: %.1f", MediaFinal );


	}

}
