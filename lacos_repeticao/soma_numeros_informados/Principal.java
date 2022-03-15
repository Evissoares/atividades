package lacos_repeticao.soma_numeros_informados;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {
		
		int continua = 1;
		int valores = 0;
		
		while(continua != 0) {
			continua = Teclado.inteiro("Digite um numero para somar ou zero para sair");
			if(continua != 0) {
				valores+= continua;
			}
		}
		
		System.out.println("Soma dos valores digitados: " + valores);
		
	}
}
