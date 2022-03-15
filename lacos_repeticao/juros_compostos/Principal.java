package lacos_repeticao.juros_compostos;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {


		double valorInvestido = Teclado.real("Valor inicial investido");
		double taxaJuros = Teclado.real("Taxa de juros mensal em %");
		int meses = Teclado.inteiro("Quantos meses ficará investido?");
		double rendimentoMensal = 0;
		double montante = valorInvestido;
		
		for(int i = 1; i < meses + 1; i++) {
			
			montante += rendimentoMensal;
			rendimentoMensal = montante * (taxaJuros / 100);
			System.out.printf("Mês - %d Ganhos - %.2f Total - %.2f\n", i, rendimentoMensal, montante);
			
		}

	}		
}
