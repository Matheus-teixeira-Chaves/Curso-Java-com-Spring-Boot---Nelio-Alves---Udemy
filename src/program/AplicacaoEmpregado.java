package program;

import java.util.Locale;
import java.util.Scanner;

import entity.Funcionario;

public class AplicacaoEmpregado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();

		System.out.println("Digite o nome do funcionario:");
		String nome = scan.nextLine();
		funcionario.nome(nome);

		System.out.println("Digite o salario bruto:");
		double salarioBruto = scan.nextDouble();

		System.out.println("Digite à taxa de imposto:");
		double taxa = scan.nextDouble();

		funcionario.netSalary(salarioBruto, taxa);

		System.out.println(funcionario.nome);
		System.out.println(funcionario.desconto);
		System.out.println(taxa);

		System.out.printf("------------------------------- %n" + "Name: " + "%s%n" + "Gross Salary: " + "%.2f%n"
				+ "Tax: " + "%.2f%n" + "--------------------------------%n", funcionario.nome, salarioBruto, taxa);

		System.out.printf("Employee: %s, $ %.2f%n", funcionario.nome, funcionario.desconto);

		System.out.println("Which percent to increase salary?");
		double incremento = scan.nextDouble();
		funcionario.increaseSalary(salarioBruto, incremento);

		System.out.printf("Update data: %s , $ %.2f", funcionario.nome, funcionario.desconto);

		scan.close();
	}
}
