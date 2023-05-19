package Conta;

public class Conta {

	private int numeroDaConta;
	private double saldo;
	private double valor; 
	private String titular;
	
	public Conta(int numeroDaConta, double saldo, double valor, String titular) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.setSaldo(saldo);
		this.valor = valor;
		this.titular = titular;
	}
		public void depositar(double valor) {
			if (valor <= 0)
			System.out.println("Nao pode depositar valor negativo");
			setSaldo(this.getSaldo() + valor);
		}
		public void sacar(double valor) {
			if (valor > getSaldo()){ 
			System.out.println("Não foi possivel sacar.");
			}else {
			this.saldo = this.saldo - valor;
			}
	
}
		public void transferir(double valor, Conta conta) {
				if ((saldo > valor) && (this.titular == conta.titular) && (valor > 0)) {	
				conta.saldo = conta.saldo + valor;
				}else {
					System.out.println("Nao foi possivel transferir!");
				}
			
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
}
