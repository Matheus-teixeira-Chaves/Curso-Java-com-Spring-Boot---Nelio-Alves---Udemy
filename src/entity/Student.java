package entity;

public class Student {

	public String nome;
	public double primeiroSemestre;
	public double segundoSemestre;
	public double terceiroSemestre;
	
	public String nomeAluno;
	public double somaAluno;
	public double mediaAluno;
	public String resultado;
	public String mensagem;
	
	public String aluno (String nome) {
		return nomeAluno = nome;
	}
	
	public double soma (double primeiroSemestre, double segundoSemestre, double terceiroSemestre) {
		return somaAluno = primeiroSemestre + segundoSemestre + terceiroSemestre;
	}
	
	public double media (double primeiroSemestre, double segundoSemestre, double terceiroSemestre) {
		somaAluno = primeiroSemestre + segundoSemestre + terceiroSemestre;
		mediaAluno = 60 - somaAluno;
		return mediaAluno;
	}
	
	public String resultado () {
		return resultado = (somaAluno >= 60) ? "PASS" : "FAILED: MISSING " + mediaAluno + " POINTS";
	}
}
