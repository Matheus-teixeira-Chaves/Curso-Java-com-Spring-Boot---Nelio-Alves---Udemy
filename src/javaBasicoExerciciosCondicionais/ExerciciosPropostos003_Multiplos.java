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
				System.out.println("S�O MULTIPLOS");
			} else {
				System.out.println("N�O S�O MULTIPLOS");
			}
		} else if (a < b) {
			if (b % a == 0) {
				System.out.println("S�O MULTIPLOS");
			} else {
				System.out.println("N�O S�O MULTIPLOS");
			}
		  }
		
		else {
			System.out.println("OS N�MEROS S�O IGUAIS");
		}
	}

}
