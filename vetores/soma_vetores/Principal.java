package vetores.soma_vetores;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {

		int[] vetor1 = new int[10];
		int[] vetor2 = new int[10];

		for (int i = 0; i < vetor1.length; i++) {
			vetor1[i] = Teclado.inteiro("Digite o " + (i + 1) + "º numero de 10");
		}

		for (int i = 0; i < vetor2.length; i++) {
			vetor2[i] = Teclado.inteiro("Digite o " + (i + 1) + "º numero de 10");
		}

		int operacao = Teclado.inteiro(
				"Escolha a operação matemática:" + "\n[1] - (+)" + "\n[2] - (-)" + "\n[3] - (*)" + "\n[4] - (/)");

		switch (operacao) {
		case 1:
			for (int i = 0; i < vetor1.length; i++) {
				System.out.print((vetor1[i] + vetor2[i]) + " ");
			}
			break;

		case 2:
			for (int i = 0; i < vetor1.length; i++) {
				System.out.print((vetor1[i] - vetor2[i]) + " ");
			}
			break;
		case 3:
			for (int i = 0; i < vetor1.length; i++) {
				System.out.print((vetor1[i] * vetor2[i]) + " ");
			}
			break;
		case 4:
			for (int i = 0; i < vetor1.length; i++) {

				if (vetor2[i] == 0) {
					System.out.println("Impossivel dividir por zero...");
					continue;
				}
				System.out.print((vetor1[i] / vetor2[i]) + " ");
			}
			break;
		}

	}
}
