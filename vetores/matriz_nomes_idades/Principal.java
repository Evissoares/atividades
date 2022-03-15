package vetores.matriz_nomes_idades;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {

		String[][] nomesIdades = new String[10][2];

		for (int i = 0; i < nomesIdades.length; i++) {
			for (int j = 0; j < nomesIdades[0].length; j++) {

				if (j == 0) {
					nomesIdades[i][j] = Teclado.texto("Digite um nome");
				} else {
					nomesIdades[i][j] = Teclado.texto("Digite uma idade");
				}

			}

			int continuar = Teclado
					.inteiro("Deseja continuar cadastrando nomes e idades?" + "\n[1] - SIM" + "\n[2] - NÃO");

			if (continuar != 1) {
				break;
			}

		}

		for (String[] linha : nomesIdades) {
			boolean proxValorNull = false;
			
			for (String dado : linha) {
				if(dado == null) {
					proxValorNull = true;
					break;
				}
				
				System.out.print(dado + " ");
			}
			
			if(proxValorNull) {
				break;
			}
			System.out.println();
		}

	}
}
