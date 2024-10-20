package entities;

public class Funcionario {
	private String nome;
	private int id;
	private double salario;
	
	public Funcionario() {
	}

	public Funcionario(String nome, int id, double salario) {
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	}

	public String getName() {
		return nome;
	}

	public int getId() {
		return id;
	}

	public double getSalario() {
		return salario;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void aumentarSalario(double porcentagem) {
		salario += salario * porcentagem /100.0;
	}

	@Override
	public String toString() {
		return "nome: " + nome + ", id: " + id + ", salario: " + String.format("%.2f", salario);
	}
	
}
