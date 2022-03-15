package vetores.ordenacao_vetores;

import utils.Teclado;

public class Principal {

	
public static void main(String[] args) {
		
		
		int[] vetor = new int[5];
		int maior;
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = Teclado.inteiro("Digite o " + (i + 1) + "º numero de 5");
		}
		
		for(int i = 0; i < vetor.length; i++) {
			for(int j = 1; j < vetor.length; j++) {
				if(vetor[j] < vetor[j-1]) {
					maior = vetor[j];
					vetor[j] = vetor[j - 1];
					vetor[j - 1] = maior;
				}
			}
		}
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
		}
		
	
	}
}
