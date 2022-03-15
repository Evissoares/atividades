package vetores.inverter_vetor;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {
		
		int[] vetor = new int[10];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = Teclado.inteiro("Digite o " + (i+1) + "º numero");
		}
		
		for(int i = vetor.length; i > 0; i--) {
			System.out.print(vetor[i - 1] + " ");
		}
		
	}
}
