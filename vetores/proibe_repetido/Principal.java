package vetores.proibe_repetido;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {

		int[] vetor = new int[10];
		boolean zeroAdicionado = false;
		for (int i = 0; i < vetor.length; i++) {
			boolean existe = false;
			int numDigitado = Teclado.inteiro("Digite o " + (i + 1) + "º numero de 10");
			for (int j = 0; j < vetor.length; j++) {
				
				
				
				if (numDigitado == vetor[j]) {
					
					if(numDigitado == 0 && !zeroAdicionado){
						zeroAdicionado = true;
						existe = true;
						break;
					}
					
					System.out.println("Numero já cadastrado. Digite outro número");
					existe = true;
					if (i > 0) {
						i--;
						break;
					}
					break;
				}
			}
			
			if(!existe) {
				vetor[i] = numDigitado;
			}
		}
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

	}
}
