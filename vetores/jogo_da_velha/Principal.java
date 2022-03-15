package vetores.jogo_da_velha;

public class Principal {

	public static void main(String[] args) {
		
		String[][] jogo = new String[3][3];
		
		iniciaJogo(jogo);
		
		
		
		
	}
	
	public static void iniciaJogo(String[][] jogo) {
		int contador = 1;
		for(int i = 0; i < jogo.length; i++) {
			for(int j = 0; j < jogo[0].length; j++) {
			
				jogo[i][j] = Integer.toString(contador) + " ";
				contador++;
			}
		}
		
		for(String[] linha : jogo) {
			for(String posicao: linha) {
				System.out.print(posicao);
			}
			
			System.out.println();
			
		}
	}
	
	
}
