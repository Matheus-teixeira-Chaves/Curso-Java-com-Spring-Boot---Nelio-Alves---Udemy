package JavaBasicoExerciciosRepeticao;

import java.util.Scanner;

public class ExerciciosPropostos003_PostoCombustivel {

	public static void main(String[] args) {

		int gasolina = 0;
		int alcool = 0;
		int diesel = 0;
		int voto = 0;
		boolean controle = true;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Tipo de combustível abastecido");
		System.out.println("    Digite: (1) Álcool (2) Gasolina (3) Diesel (4) Encerrar");

		voto = scan.nextInt();
		while (controle) {
			switch (voto) {
			case 1:
				alcool += 1;
				System.out.println("Tipo de combustível abastecido");
				System.out.println("    Digite: (1) Álcool (2) Gasolina (3) Diesel (4) Encerrar");

				voto = scan.nextInt();
				break;
			case 2:
				gasolina += 1;
				System.out.println("Tipo de combustível abastecido");
				System.out.println("    Digite: (1) Álcool (2) Gasolina (3) Diesel (4) Encerrar");

				voto = scan.nextInt();
				break;
			case 3:
				diesel += 1;
				System.out.println("Tipo de combustível abastecido");
				System.out.println("    Digite: (1) Álcool (2) Gasolina (3) Diesel (4) Encerrar");

				voto = scan.nextInt();
				break;
			case 4:
				System.out.println("-----------------------------------------");
				System.out.println("		MUITO OBRIGADO!");
				System.out.println("-----------------------------------------");
				System.out.printf("Alcool: %d%n", alcool);
				System.out.printf("Gasolina: %d%n", gasolina);
				System.out.printf("Diesel: %d%n", diesel);
				controle = false;
				break;
			default:
				System.out.println("Número Invalido! Digite Apenas entre 1 e 4:");
				System.out.println("    Digite: (1) Álcool (2) Gasolina (3) Diesel (4) Encerrar");

				voto = scan.nextInt();
				break;
			}
		}
		
		scan.close();

	}
}
