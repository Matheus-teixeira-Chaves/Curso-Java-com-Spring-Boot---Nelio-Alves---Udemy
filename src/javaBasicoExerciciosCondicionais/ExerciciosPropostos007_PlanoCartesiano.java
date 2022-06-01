package javaBasicoExerciciosCondicionais;

import java.util.Scanner;

public class ExerciciosPropostos007_PlanoCartesiano {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double x, y;
		
		System.out.println("Digite um valor para o eixo 'X' ");
		x = scan.nextDouble();
		
		System.out.println("Digite um valor para o eixo 'Y' ");
		y = scan.nextDouble();
		
		scan.close();
		
		if (x == 0 || y == 0) {
			System.out.println("Origem");
		}
		else if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}

		else {
			System.out.println("Q4");
		}



	}

}
