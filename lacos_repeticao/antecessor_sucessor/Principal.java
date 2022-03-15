package lacos_repeticao.antecessor_sucessor;

import utils.Teclado;

public class Principal {
	
	public static void main(String[] args) {
		
		int numero = Teclado.inteiro("Digite um numero");
		int dx = 1;
		String msg = "Sucessor";
		for(int i = 0; i < 11; i++) {
			System.out.println(msg + " " +( numero + (i*dx)));
			if(i == 10 && dx > 0) {
				dx = -1;
				i = 0;
				msg = "antecessor";
			}
		}
		
	}
}
