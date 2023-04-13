package JavaTech;

import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {
		
		float salario, abono, NovoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu salario: ");
		salario = leia.nextFloat();
		System.out.println("Digite o seu abono: ");
		abono = leia.nextFloat();
		
		NovoSalario = salario+abono;
		
		System.out.println("Seu novo Salario é: " +NovoSalario);
		
		

	}

}
