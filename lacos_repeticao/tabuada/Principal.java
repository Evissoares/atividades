package lacos_repeticao.tabuada;

import utils.Teclado;

public class Principal {
	public static void main(String[] args) {
		
		int tabuada = Teclado.inteiro("Digite a tabuada que deseja ver");
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(tabuada + " X " +  i + " = " + (tabuada * i));
		}
		
		
	}
	
}
