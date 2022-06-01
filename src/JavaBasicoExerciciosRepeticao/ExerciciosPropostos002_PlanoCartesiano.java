package JavaBasicoExerciciosRepeticao;

import java.util.Scanner;

public class ExerciciosPropostos002_PlanoCartesiano {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double x, y;

		System.out.println("Digite o valor de 'x'");
		x = scan.nextDouble();

		System.out.println("Digite o valor de 'y'");
		y = scan.nextDouble();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("Segundo");
			}
			
			System.out.println("Digite o valor de 'x'");
			x = scan.nextDouble();

			System.out.println("Digite o valor de 'y'");
			y = scan.nextDouble();
		}
		scan.close();

	}

}
