package conversor_moeda;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {
	
		double valor = Teclado.real("Digite um valor");
		
		int moeda = Teclado.inteiro("Digite a moeda para converter"
				+ "\n1 - Real - Dolar"
				+ "\n2 - Dolar - Real "
				+ "\n3 - Real - Euro"
				+ "\n4 - Euro - Real");
		
		switch(moeda) {
		
		case 1:
			System.out.println("U$" + valor / 5);
			break;
		case 2:
			System.out.println("R$" + valor * 5);
			break;
		case 3:
			System.out.println("EU" + valor / 7);
			break;
		case 4: 
			System.out.println("R$" + valor * 7);
			break;
			
			
		}
	}
}
