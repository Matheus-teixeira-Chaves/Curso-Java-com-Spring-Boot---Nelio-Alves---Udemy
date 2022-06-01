package javaBasicoExerciciosCondicionais;

import java.util.Scanner;

public class ExerciciosPropostos003_Multiplos {

	public static void main(String[] args) {
		
		int a, b;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um Valor para A:");
		a = scan.nextInt();
		
		System.out.println("Digite um Valor para B:");
		b = scan.nextInt();
		
		scan.close();

		if (a > b) {
			if (a % b == 0) {
				System.out.println("SÃO MULTIPLOS");
			} else {
				System.out.println("NÃO SÃO MULTIPLOS");
			}
		} else if (a < b) {
			if (b % a == 0) {
				System.out.println("SÃO MULTIPLOS");
			} else {
				System.out.println("NÃO SÃO MULTIPLOS");
			}
		  }
		
		else {
			System.out.println("OS NÚMEROS SÃO IGUAIS");
		}
	}

}
