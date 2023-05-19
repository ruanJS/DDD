package Conta;

public class Poupanca extends Conta {

	private boolean contaPoupanca;
	
	public Poupanca(int numeroDaConta, double saldo, double valor, String titular) {
		super(numeroDaConta, saldo, valor, titular);
	}
		@Override
		public void sacar(double valor) {
			System.out.println("Nao foi possivel sacar da conta poupanca!");

	}
	public boolean isContaPoupanca() {
		return contaPoupanca;
	}
	public void setContaPoupanca(boolean contaPoupanca) {
		this.contaPoupanca = contaPoupanca;
	}
	
}