package positivo_negativo;

import utils.Teclado;

public class Principal {
	public static void main(String[] args) {
		
		int numero = Teclado.inteiro("Digite um numero");
		
		if(numero >= 0) {
			System.out.println("Positivo");
			return;
		}
		System.out.println("Negativo");
		
	}
}
