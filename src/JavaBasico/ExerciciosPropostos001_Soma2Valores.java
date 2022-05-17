package JavaBasico;

import java.util.Scanner;

public class ExerciciosPropostos001_Soma2Valores {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int valor1, valor2, soma;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = scan.nextInt();
		
		System.out.println("Agora digite o segundo valor: ");
		valor2 = scan.nextInt();
		
		scan.close();
		
		soma = valor1 + valor2;
		System.out.println("A soma entre " + valor1 + " e " + valor2 + " = " + soma);
	}

}
