package Entities;

public class Cadastro {

	private int conta;
	private String name;
	private double saldo;

	public Cadastro(int conta, String name, double saldoinicial) {
		
		this.conta = conta;
		this.name = name;
		depositAc(saldo);
	
	}
	public Cadastro(int conta, String name) {
		this.conta = conta;
		this.name = name;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposito1() {
		return getDeposito1();
	}

	public double totalvalueAc() {
		return saldo;
	}

	public void depositAc(double deposito1) {
		this.saldo += deposito1;
	}

	public void saqueAc(double deposito1) {
		this.saldo-= deposito1 + 5;
		
	}

	public String toString() {
		return conta + ", Holder: " + name + ", Balance: $" + String.format("%.2f", saldo);
	}

}
