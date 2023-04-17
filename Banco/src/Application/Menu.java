package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.DadosBancarios;



public class Menu {
	
	static Scanner leia = new Scanner (System.in);
		
		public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		DadosBancarios dados = null;
		
		
		System.out.println("Digite o número da conta: ");
		int conta = leia.nextInt();
		leia.nextLine();
		System.out.println("Digite o nome: ");
		String nome = leia.nextLine();
		System.out.println("Gostaria de fazer um depósito Inicial (y/n)");
		char resposta = leia.next().charAt(0);
		
		if( resposta == 'y') {
			System.out.println("Digite o valor a ser depositado: ");
			double depositoInicial = leia.nextDouble();
			dados = new DadosBancarios(conta, nome,depositoInicial);
			
		}
		else if (resposta == 'n') {
			dados = new DadosBancarios(conta, nome);
		}
		
		System.out.println("Conta: ");
		System.out.println(dados);
		System.out.println("Digite o valor a ser depositado: ");
		double depositoValor = leia.nextDouble();
		dados.deposito(depositoValor);
		System.out.println("Novo valor: ");
		System.out.println(dados);
		System.out.println("Digite o valor a ser sacado: ");
		double depositoSaque = leia.nextDouble();
		dados.saque(depositoSaque);
		System.out.println("Novo valor: ");
		System.out.println(dados);
		
	}
}
