package vetores.crud_roots;

import javax.swing.JOptionPane;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {

		String[][] produtos = new String[50][3];
		
		//menuPrincipal();
		
		while(true) {
			
			int opcao; 
			while(true) {
				opcao = Teclado.inteiro("Escolha uma opção" 
						+ "\n[1] - Cadastrar" 
						+ "\n[2] - Listar Todos os produtos"
						+ "\n[3] - Alterar produto"
						+ "\n[4] - Remover produto"
						+ "\n[0] - Sair do sistema");
				if(opcao > 4 || opcao < 0) {
					JOptionPane.showMessageDialog(null, "Opção inválida");
					continue;
				}
				if(opcao == 0) {
					JOptionPane.showMessageDialog(null, "Finalizando o sistema...\nClique OK para sair.");
					return;
				}
				
				
				
				
				
				
				
			}
			
			
		}
		
		
		
		
		
		/**
		 * Cadastrar; Listar todos os produtos; Alterar produtos (pesquise pelo nome do
		 * produto, peça o nome, valor e marca para efetuar a alteração); Remover
		 * produtos (remova pelo nome do produto); Finalizar sistema.
		 * 
		 */

	}
	
	public static void cadastrarProduto(String[][] matriz) {
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				if(matriz[i][j] != null) {
					break;
				}
			}
		}
		
	}

}
