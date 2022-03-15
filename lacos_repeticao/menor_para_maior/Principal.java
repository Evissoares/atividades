package lacos_repeticao.menor_para_maior;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {

		int menor = Teclado.inteiro("Digite um numero");
		int maior = Teclado.inteiro("Digite um numero");
		int contPos = 0;
		int contNeg = 0;
		
		for(int i = menor; i < maior + 1; i++) {
			System.out.print(i + " ");
			if(i >= 0) {
				contPos++;
			}else {
				contNeg++;
			}
		}
		System.out.println("\nPositivos nesta sequência: " +contPos 
				+"\nNegativos nesta sequência: " + contNeg);
		
		
	}
}
