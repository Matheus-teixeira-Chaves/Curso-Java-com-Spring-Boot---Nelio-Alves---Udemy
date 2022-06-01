package javaBasicoExerciciosCondicionais;

import java.util.Scanner;

public class ExerciciosPropostos002_ImparOuPar {

	public static void main(String[] args) {
		
		int num; 
		
		System.out.println("Digite um Número para Saber se é ímpar ou par: ");
		
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		scan.close();
		
		if (num % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}
	}

}
