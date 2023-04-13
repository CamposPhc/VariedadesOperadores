package JavaTech;

import java.util.Scanner;

public class exer3 {

	public static void main(String[] args) {

		float bruto, noturno, extra, desconto, SalarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu salario bruto");
		bruto = leia.nextFloat();
		
		System.out.println("Digite seu adicional noturno");
		noturno = leia.nextFloat();
		
		System.out.println("Digite sua hora extra");
		extra = leia.nextFloat();
		
		System.out.println("Digite seu desconto");
		desconto = leia.nextFloat();
		
		SalarioLiquido = bruto + noturno +(extra*5)- desconto;
		System.out.printf("Seu salario liquido é: %.2f", SalarioLiquido);
		
		
	}

}
