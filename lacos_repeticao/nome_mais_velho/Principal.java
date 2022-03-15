package lacos_repeticao.nome_mais_velho;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		String nomeMaisVelho = "p";
		int idadeMaisVelho = -999999999;
		int continuar = 1;
		
		while(continuar == 1) {
			
			nome = Teclado.texto("Digite um nome");
			idade = Teclado.inteiro("Digite a idade");
			
			if(idade > idadeMaisVelho) {
				idadeMaisVelho = idade;
				nomeMaisVelho = nome;
			}
			
			continuar = Teclado.inteiro("Deseja continuar?\n[1] - SIM\n[2] - NÃO");
			
		}
		
		System.out.println("Nome do mais velho: " + nomeMaisVelho + "\nIdade do mais velho: " + idadeMaisVelho);
		
	}
}
