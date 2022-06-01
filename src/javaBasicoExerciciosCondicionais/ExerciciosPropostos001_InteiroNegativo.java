package javaBasicoExerciciosCondicionais;

import java.util.Scanner;

public class ExerciciosPropostos001_InteiroNegativo {

	public static void main(String[] args) {
		
		int num;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um um Número:");
		num = scan.nextInt();
		
		if (num >= 0) {
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		
		scan.close();

	}

}
