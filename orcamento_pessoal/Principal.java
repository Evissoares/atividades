package orcamento_pessoal;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {
		
		double salario = Teclado.real("Digite o salario do mês");
		double luz = Teclado.real("Digite o valor da conta de luz");
		double telefone = Teclado.real("Digite o valor da conta de telefone");
		double agua = Teclado.real("Digite o valor da conta de água");
		double mercado = Teclado.real("Digite o valor das compras do mês");
		double lazer = Teclado.real("Digite o valor dos gastos com lazer");
		double aluguel = Teclado.real("Digite o valor do aluguel");
		
		salario -= (luz + telefone + agua + mercado + lazer + aluguel);
		
		System.out.println("Sobrou do seu salário: R$" + salario);
		
		
		
	
		
	}
}
