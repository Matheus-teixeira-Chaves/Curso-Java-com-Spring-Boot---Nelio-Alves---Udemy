package entity;

public class Funcionario {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double salary;
	public String nome;
	public double desconto;
	
	
	public String nome (String name) {
		return nome = name;
	}
	
	public double netSalary (double grossSalary, double tax) {
		return desconto = grossSalary - tax;
	}
	
	public double increaseSalary (double grossSalary, double percent) {
		return desconto += (grossSalary * percent) / 100;
	}

}
