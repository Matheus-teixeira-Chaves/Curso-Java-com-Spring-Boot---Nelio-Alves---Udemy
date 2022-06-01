package program;

import java.util.Locale;
import java.util.Scanner;

import entity.Student;

public class AplicacaoAluno {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Student estudante = new Student();
		
		System.out.println("Digite o nome do aluno:");
		String aluno = scan.nextLine();
		estudante.aluno(aluno);
		
		System.out.println("Digite à média do primeiro semestre: ");
		double primeiraMedia = scan.nextDouble();
		
		System.out.println("Digite à média do segundo semestre: ");
		double segundaMedia = scan.nextDouble();
		
		System.out.println("Digite à média do terceiro semestre: ");
		double terceiraMedia = scan.nextDouble();
		
		estudante.media(primeiraMedia, segundaMedia, terceiraMedia);
		estudante.soma(primeiraMedia, segundaMedia, terceiraMedia);
		String resultado = estudante.resultado();
		
		System.out.printf("FINAL GRADE = %.2f%n %s%n", estudante.somaAluno, resultado, estudante.mediaAluno);
		
		scan.close();

	}

}
