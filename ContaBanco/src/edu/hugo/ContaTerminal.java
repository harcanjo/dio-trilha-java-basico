package edu.hugo;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int numeroConta;
		String agencia;
		String nomeCliente;
		double saldo;
		
		// Leitura dos dados do usuário
		System.out.println("Olá, sejá bem-vindo(a)!");
		
		System.out.println("Por favor, digite o número da Conta! E tecle ENTER para o próximo campo");
		numeroConta = leitor.nextInt();
		
		System.out.println("Por favor, digite o número da Agência! E tecle ENTER para o próximo campo");
		agencia = leitor.next();
		
		System.out.println("Por favor, digite o nome do Cliente! E tecle ENTER para o próximo campo");
		nomeCliente = leitor.next();
		
		System.out.println("Por favor, digite o saldo do Cliente! E tecle ENTER para o próximo campo");
		saldo = leitor.nextDouble();
				// Mensagem final
		System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

	}

}
