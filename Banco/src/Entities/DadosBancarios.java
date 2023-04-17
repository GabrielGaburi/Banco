package Entities;

public class DadosBancarios {
	
	private int conta;
	private String nome;
	private double valorConta;

	public DadosBancarios(int conta, String nome) {
		super();
		this.conta = conta;
		this.nome = nome;
	}


	public DadosBancarios(int conta, String nome, double depositoInicial) {
		super();
		this.conta = conta;
		this.nome = nome;
		deposito(depositoInicial);
	}


	public double getValorConta() {
		return valorConta;
	}


	public int getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return ("Conta :" + conta + ", Nome: " + nome + ", Saldo: " + String.format("%.2f",valorConta));
	}
	public void deposito (double quantidade) {
		valorConta += quantidade;
	}
	public void saque (double quantidade) {
		valorConta -= quantidade + 5.0;
	}
}
