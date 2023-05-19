package Conta;

public class App {

	public static void main(String[] args) {
		Conta conta = new Conta(1002, 5000.00, 0.0, "itau");
		Conta conta1 = new Conta(1004, 7000.00, 0.0, "itau");
		Poupanca poupanca = new Poupanca(1005, 23000.00, 0, "bradesco");
		
		conta.sacar(10);
		conta.depositar(2000);
		poupanca.sacar(50);
		System.out.println("Seu saldo e: " + conta.getSaldo());
		System.out.println("Saldo poupanca: " + poupanca.getSaldo());
		
	}


}
