package entity;

public class FuncionarioAumento {

	private Integer id;
	private String nome;
	private Double salario;
	
	
	public FuncionarioAumento(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getSalario() {
		return salario;
	}


	public void aumentoSalario (Double salario, Double x) {
		salario += salario * x;
	}
	
	
}
