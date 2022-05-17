package JavaBasico;

import java.util.Scanner;

public class ExerciciosPropostos003_DiferencaValores {

	public static void main(String[] args) {
		
		int a, b, c, d, diferenca;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor A: ");
		a = scan.nextInt();
		
		System.out.println("Digite o valor B: ");
		b = scan.nextInt();
		
		System.out.println("Digite o valor C: ");
		c = scan.nextInt();
		
		System.out.println("Digite o valor D: ");
		d = scan.nextInt();
		scan.close();
		
		diferenca = a * b - c * d;
		
		System.out.println("Diferença = " + diferenca);
		
	}

}
