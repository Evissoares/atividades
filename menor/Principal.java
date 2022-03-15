package menor;

import utils.Teclado;

public class Principal {
	public static void main(String[] args) {
				
		
		int menor = 999999999;
		int contador = 0;
		
		do {
			int numero = Teclado.inteiro("Digite um numero");
			
			if(menor > numero) {
				menor = numero;
			}
			
			contador++;
		} while(contador != 3);
		
		System.out.println("O menor número digitado foi: " + menor);
		
		
	}
}
