package lacos_repeticao.lacos_e_numeros;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {

		int continuar = 0;
		int contador = 0;
		int pares = 0;
		int impares = 0;
		int positivos = 0;
		int negativos = 0;
		
		do {
			if(continuar != 0) {				
				contador++;
			}
			
			continuar = Teclado.inteiro("Digite um numero ou "
					+ "\n[0] - Encerrar");
			
			if(continuar != 0 && continuar >= 0) {
				positivos++;
			}
			if(continuar != 0 && continuar < 0) {
				negativos++;
			}
			if(continuar != 0 && continuar % 2 == 0) {
				pares++;
			} 
			if(continuar != 0 && continuar % 2 != 0) {
				impares++;
			}
			
			
			
		} while (continuar != 0);
		
		System.out.println("Quantidade de números informados: " + contador 
				+ "\nQuantidade de pares: " + pares 
				+ "\nQuantidade de impares: " + impares
				+ "\nQuantidade de positivos: " + positivos
				+ "\nQuantidade de negativos: " + negativos);
		
	}
}
