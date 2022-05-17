package JavaBasico;

import java.util.Scanner;

public class ExerciciosPropostos006_Triangulos {

	public static void main(String[] args) {
		
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
		
		Scanner scan = new Scanner(System.in);
		
		// ENTRADA DE DADOS
		
		System.out.println("Digite o valor A: ");
		a = scan.nextDouble();
		
		System.out.println("Digite o valor B: ");
		b = scan.nextDouble();
		
		System.out.println("Digite o valor C: ");
		c = scan.nextDouble();
		
		scan.close();
		
		System.out.println("------------------------------------------");
		
		// TRIANGULO
		triangulo = (a * c) / 2;
		System.out.printf("TRIANGULO %.3f%n", triangulo);
		
		
		// CIRCULO
		circulo = 3.14159 * (c * c);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		
		// TRAPEZIO
		trapezio = ((a + b) * c) / 2;
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		
		
		// QUADRADO
		quadrado = b * b;
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		
		
		// RETANGULO
		retangulo = a * b;
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
	}

}
