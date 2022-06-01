package javaBasicoExerciciosCondicionais;

import java.util.Scanner;

public class ExerciciosPropostos008_ImpostoRenda {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu salario:");
		
		double salario = scan.nextDouble();
		
		scan.close();

		double imposto, desconto, deducao;
		
		if (salario >= 0 && salario <= 2000.00) {
			System.out.println("Isento");
		}
		else if (salario > 2000.00 && salario <= 3000.00) {
			desconto = salario - 2000.00;
			imposto = desconto * 0.08;
			System.out.printf("R$ %.2f", imposto);
		}
		else if (salario > 3000.00 && salario <= 4500.00) {
			imposto = (salario - 2000.00) * 0.08;
			System.out.printf("R$ %.2f", imposto);
		}
		else {
			imposto = (salario - 4500.00) * 0.28;
			desconto = salario - 4500.00;
			imposto = (((salario - desconto) - 3000.00) * 0.18) + imposto;
			desconto = (salario - 3000.00) - desconto;
			imposto = (((salario - desconto) - 2000.00 - (salario - 4500.00)) * 0.08) + imposto;
			
			System.out.printf("R$ %.2f", imposto);
		}
	}

}
