package lacos_repeticao.jogo_forca;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {
		
		String palavra = "ESTUDAR";
		int tentativa = 0;
		String display = "";
		
		do {
			
			char letra = Teclado.letra("Escolha uma letra");
			
			for(int i = 0; i < palavra.length(); i++) {
				
				if(palavra.charAt(i) == letra) {
					
					
					 
				} else {
					
					 tentativa++;
				}
			}
			
			
		}while(tentativa < 7);
		
		
	}
}
