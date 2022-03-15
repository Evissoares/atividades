package poo.banco;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Banco {

	List<Conta> contas = new ArrayList<>();

	public Banco() {

		contas.add(new Conta("Everton", "001", "123456"));
		contas.add(new Conta("Joana", "001", "123457"));
		contas.add(new Conta("Paulo", "001", "123458"));

		String menuConta = "[1] - Sacar" + "\n[2] - Depositar" + "\n[3] - Extrato" + "\n[4] - Sair";
		Conta c = null;
		int opcao = 0;

		do {

			if (c == null) {

				JOptionPane.showMessageDialog(null, "Acesse sua conta com nome e numero da conta");
				String nome = JOptionPane.showInputDialog("Digite seu nome");
				String numConta = JOptionPane.showInputDialog("Digite o número da sua conta");

				c = acessarConta(nome, numConta);
			}
			else {
				
				String msgLogin = c.getNome() + "\nSeu saldo atual é R$" + c.getSaldo() + "\n";
				opcao = Integer.parseInt(JOptionPane.showInputDialog("Olá " + msgLogin + menuConta));

				switch (opcao) {

				case 1:
					sacar(c);
					break;
				case 2:
					depositar(c);
					break;
				case 3:
					JOptionPane.showMessageDialog(null, extrato(c));
					break;
				}
			}

			

		} while (opcao != 4);

		if (c != null && opcao == 4) {
			JOptionPane.showMessageDialog(null, "Finalizando sistema. Obrigado!");
			return;
		}

	}

	private Conta acessarConta(String nome, String numConta) {

		for (Conta c : contas) {
			if (c.getNome().equals(nome) && c.getNumConta().equals(numConta)) {
				return c;
			}
		}
		JOptionPane.showMessageDialog(null, "Conta não encontrada\nTente novamente.");
		return null;
	}

	private void sacar(Conta c) {
		String valorSaque = JOptionPane.showInputDialog("Digite o valor do saque");
		c.sacar(valorSaque);
	}

	private void depositar(Conta c) {
		String valorDeposito = JOptionPane.showInputDialog("Digite o valor do deposito");
		c.depositar(valorDeposito);
	}
	
	private String extrato(Conta c) {
		return c.imprimirExtrato();
	}

}
