package soma_iguais;

import utils.Teclado;

public class Principal {
	
	public static void main(String[] args) {
		double numero1 = Teclado.real("Digite um número");
		double numero2 = Teclado.real("Digite um número");
		
		if(numero1 == numero2) {
			System.out.println(numero1 + numero2);
		}else {
			System.out.println(numero1 * numero2);
		}
	}

}
