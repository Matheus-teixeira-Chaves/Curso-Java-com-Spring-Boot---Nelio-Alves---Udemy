package JavaBasico;

import java.util.Scanner;

public class ExerciciosPropostos005_Produtos {

	public static void main(String[] args) {
		
		int id1, qnt1, id2, qnt2;
		double preco1, preco2, valorCompra1, valorCompra2, total;
		
		Scanner scan = new Scanner(System.in);
		
		// PRODUTO 1
		System.out.println("Digite o Código do Produto 1: ");
		id1 = scan.nextInt();
		
		System.out.println("Digite à quantidade do Produto 1: ");
		qnt1 = scan.nextInt();
		
		System.out.println("Digite o Valor unitario do Produto 1: ");
		preco1 = scan.nextDouble();
		
		valorCompra1 = qnt1 * preco1;
		
		// PRODUTO 2
		System.out.println("Digite o Código do Produto 2: ");
		id2 = scan.nextInt();
		
		System.out.println("Digite à quantidade do Produto 2: ");
		qnt2 = scan.nextInt();
		
		System.out.println("Digite o Valor unitario do Produto 2: ");
		preco2 = scan.nextDouble();

		valorCompra2 = qnt2 * preco2;
		
		scan.close();
		
		total = valorCompra1 + valorCompra2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
	}

}
