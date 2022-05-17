package JavaBasico;

import java.util.Scanner;

public class ExerciciosPropostos002_AreaCirculo {

	public static void main(String[] args) {

		double pi = 3.14159;
		double raio, resultado;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio: ");
		raio = scan.nextDouble();
		
		resultado = pi * (raio * raio);
		
		System.out.printf("A area é = %.4f", resultado);
		
		scan.close();

	}

}
