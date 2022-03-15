package ordenador_decrescente;

import utils.Teclado;

public class Principal {
	public static void main(String[] args) {
		
		int maior = -999999999;
		
		int numero1 = Teclado.inteiro("Digite um numero");
		int numero2 = Teclado.inteiro("Digite um numero");
		int numero3 = Teclado.inteiro("Digite um numero");

		
		if(numero1 > maior) {
			maior = numero1;
		}
		if(numero2 > maior) {
			maior = numero2;
			numero2 = numero1;
			numero1 = maior;
			
			
		}if(numero3 > maior) {
			maior = numero3;
			numero3 = numero2;
			numero2 = numero1;
			numero1 = maior;
			

		}if(numero3 > numero2) {
			int aux = numero2;
			numero2 = numero3;
			numero3 = aux;
			
		}
		
		System.out.println(numero1 + " " + numero2 + " " + numero3);
		
		
		
	}
}
