package JavaBasicoExerciciosRepeticao;

import java.util.Scanner;

public class ExerciciosPropostos001_Senha {

	public static void main(String[] args) {
		
		int bd = 2002;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite à sua senha:");
		int senha = scan.nextInt();
		while (senha != bd) {
			System.out.println("Senha Invalida.. Digite novamente:");
			senha = scan.nextInt();
		}
		System.out.println("Acesso Permitido");

		scan.close();
	}

}
