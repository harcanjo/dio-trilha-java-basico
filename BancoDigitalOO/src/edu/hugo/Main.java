package edu.hugo;

public class Main {

	public static void main(String[] args) {
		Cliente hugo = new Cliente();
		hugo.setNome("Hugo");
		
		Conta contaCorrente = new ContaCorrente(hugo);
		Conta contaPoupanca = new ContaPoupanca(hugo);

		contaCorrente.depositar(1337);
		contaCorrente.transferir(42, contaPoupanca);
		
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
	}

}
