package radar;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {
		
		double velocidadeVeiculo = Teclado.real("Digite a velocidade do veículo");
		double limiteVia = Teclado.real("Digite a velocidade limite da via");
		
		if(velocidadeVeiculo <= limiteVia) {
			System.out.println("Bom motorista");
			return;
		}
		
		if(velocidadeVeiculo <= (limiteVia + 10)) {
			System.out.println("Multa de R$50,00");
			return;
		}
		
		if(velocidadeVeiculo <= (limiteVia + 20)) {
			System.out.println("Multa de R$100,00");
			return;
		}
		 System.out.println("Multa de R$200,00");
		
		
		
		
	}
}
