package javaBasicoExerciciosCondicionais;

import java.util.Scanner;

public class ExerciciosPropostos005_Cardapio {

	public static void main(String[] args) {
		
		int codigo, qnt;
		double valor, total;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--------------------------------------------------");
		
		System.out.println("CODIGO        ESPECIFICAÇÃO        PREÇO");

		System.out.println("--------------------------------------------------");
		
		System.out.println("1             Cachorro Quente      R$ 4.00");
		System.out.println("2             X-Salada             R$ 4.50");
		System.out.println("3             X-Bacon              R$ 5.00");
		System.out.println("4             Torrada              R$ 2.00");
		System.out.println("5             Refrigerante         R$ 1.50");
		
		System.out.println("--------------------------------------------------");
		
		System.out.println("Digite o Código do Produto:");
		codigo = scan.nextInt();
		
		System.out.println("Digite à quantidade:");
		qnt = scan.nextInt();
		
		scan.close();
		
		switch (codigo) {
			case 1:
				valor = 4.00;
				total = valor * qnt;
				System.out.printf("Total: R$ %.2f", total);
				break;
		
			case 2:
				valor = 4.50;
				total = valor * qnt;
				System.out.printf("Total: R$ %.2f", total);
				break;
			
		
			case 3:
				valor = 5.00;
				total = valor * qnt;
				System.out.printf("Total: R$ %.2f", total);
				break;
		
			case 4:
				valor = 2.00;
				total = valor * qnt;
				System.out.printf("Total: R$ %.2f", total);
				break;
		
			case 5:
				valor = 1.50;
				total = valor * qnt;
				System.out.printf("Total: R$ %.2f", total);
				break;		
		}
	}
}
