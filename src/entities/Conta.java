package entities;

public class Conta {
	private int numConta;
	private String nome;
	private double saldo;

	public Conta(int numConta, String nome, double depositoInicial) {
		this.numConta = numConta;
		this.nome = nome;
		depositar(depositoInicial);
	}
	
	public Conta(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
	}

	public int getNumConta() {
		return numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		saldo += valor;
	}
	public void sacar(double valor) {
		saldo -= valor;
		saldo -= 5;
	}
	public String toString() {
		return "\nNúmero da conta: " + numConta + ", Usuário: " + nome + ", Saldo atual: " + String.format("%.2f", saldo) + "\n";
		
	}
	

	
}
