package Programa;

import java.util.Scanner;

import Entidade.Conta;
import Entidade.Invalido;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Locale.setDefault(Locale.US);

		try {
			System.out.println("Entre com os dados da conta:");
			System.out.print("Número: ");
			int numero = sc.nextInt();
			System.out.print("Usúario: ");
			sc.nextLine();
			String usuario = sc.nextLine();
			System.out.print("Saldo inicial: ");
			Double saldo = sc.nextDouble();
			System.out.print("Limite de saque: ");
			Double limite = sc.nextDouble();
			Conta conta = new Conta(numero, usuario, saldo, limite);
			System.out.println();
			System.out.print("Entre com o valor de saque: ");
			double saque = sc.nextDouble();
			conta.Saque(saque);
			System.out.println();
			System.out.println(conta);
		}
		catch (Invalido i) {
			System.out.println(i.getMessage());
		} 
		catch (RuntimeException e) {
			System.out.println("Erro inesperado!");
		}
		
		sc.close();
	}
}