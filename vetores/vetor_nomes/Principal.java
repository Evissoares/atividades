package vetores.vetor_nomes;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {
		
		
		String[] nomes = new String[100];
		
		for(int i = 0; i < nomes.length; i++) {
			
			nomes[i] = Teclado.texto("Cadastre o " + (i+1) + "º nome");
			
			int continuar = Teclado.inteiro("Deseja continuar cadastrando nomes?"
					+ "\n[0] - SIM"
					+ "\n[1] - NÃO");
			
			if(continuar != 0) {
				break;
			}
		}
		
		for(int i = 0; i < nomes.length; i++) {
			
			System.out.println(nomes[i]);
			
			if(nomes[i+1] == null) {
				break;
			}
			
			
			
		}
		
	}
}
