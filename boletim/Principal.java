package boletim;

import utils.Teclado;

public class Principal {
	public static void main(String[] args) {
		
		double media = 0;
		
		for(int i = 0; i < 4; i++) {
			
			media += Teclado.real("Digite uma nota");
		}
		
		media /= 4;
		
		if(media < 4.9) {
			System.out.println("Reprovado");
			
		} else if(media < 6.9) {
			System.out.println("Em exame");
		}
		else {
			System.out.println("Aprovado");
		}
		
		
	}
}
