package javaBasicoExerciciosCondicionais;

import java.util.Scanner;

public class ExerciciosPropostos004_HoraJogo {

	public static void main(String[] args) {
		
		int horaInicial, horaFinal, duracao, desconto;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite à Hora Inicial do Jogo: ");
		horaInicial = scan.nextInt();
		
		System.out.println("Digite à Hora Final do Jogo: ");
		horaFinal = scan.nextInt();
		
		scan.close();
		
		if (horaInicial >= horaFinal) {
			desconto = horaInicial - horaFinal;
			duracao = 24 - desconto;
		} else {
			duracao = horaFinal - horaInicial;
		}
		
		System.out.printf("O JOGO DUROU %d HORA (S)", duracao);
	}

}
