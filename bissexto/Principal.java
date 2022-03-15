package bissexto;

import utils.Teclado;

public class Principal {
	
	public static void main(String[] args) {
		
		int ano = Teclado.inteiro("Informe o ano");
		
		if(ano % 4 == 0) {
			System.out.println("Ano bissexto");
		}else {
			System.out.println("Ano não bissexto");
		}
		
		
		
	}
}
