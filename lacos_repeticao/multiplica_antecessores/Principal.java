package lacos_repeticao.multiplica_antecessores;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {

		int entrada = Teclado.inteiro("Digite um numero");

		for (int i = entrada; i > 1; i--) {

			System.out.print(entrada + "X" + (i-1) + " = ");
			entrada *= i - 1;
			System.out.print(entrada);
			System.out.println();
		
		}
		
	}
}
