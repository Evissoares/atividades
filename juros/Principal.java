package juros;

import utils.Teclado;

public class Principal {
	public static void main(String[] args) {
		
		int modalidadeCompra = Teclado.inteiro("Digite"
				+ "\n1 - A prazo"
				+ "\n2 - A vista");
		
		double valorCompra = Teclado.real("Digite o valor total da compra");
		
		if(modalidadeCompra == 2 && valorCompra >= 200) {
			valorCompra -= (valorCompra * 0.10); 
			System.out.println(valorCompra);
		}
		
		System.out.println("Valor sem desconto: " + valorCompra);
		
		
	}
}
