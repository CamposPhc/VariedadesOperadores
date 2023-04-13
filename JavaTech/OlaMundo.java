package JavaTech;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		String nome = "Pedro";
		int idade = 24;
		double altura = 1.82;
		float nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("nome participante: " +nome);
		System.out.println( "idade:" +idade+ " anos");
		System.out.println("altura:" +altura);
		
		System.out.println("entre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("entre com a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("entre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3)/3;
		
		System.out.println("\nMedia aritimética:" +media);
		System.out.printf("\nMedia aritimética: %.2f", media);


	}

}