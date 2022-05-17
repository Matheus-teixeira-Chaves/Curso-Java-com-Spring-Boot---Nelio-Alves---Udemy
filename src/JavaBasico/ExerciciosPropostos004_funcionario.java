package JavaBasico;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosPropostos004_funcionario {

	public static void main(String[] args) {
		
		int numId, horasTrab;
		double valorHora, salario;
		
		Locale.setDefault(Locale.US );
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o Número do Funcionario: ");
		numId = scan.nextInt();
		
		System.out.println("Digite à quantidade de horas trabalhadas: ");
		horasTrab = scan.nextInt();
		
		System.out.println("Digite o valor da hora: ");
		valorHora = scan.nextDouble();
		
		scan.close();
		
		salario = valorHora * horasTrab;
		
		System.out.printf("NUMBER %d%nSALARY = U$ %.2f", numId, salario);
	}

}
