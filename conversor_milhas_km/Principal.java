package conversor_milhas_km;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {

		int opcao = Teclado.inteiro("Digite" + "\n1 - km para milhas" + "\n2- milhas para km");

		double distancia = Teclado.real("Digite a distância para converter");

		switch (opcao) {

		case 1:
			distancia /= 1.609;
			System.out.println("Milhas: " + distancia);
			break;

		case 2:
			distancia *= 1.609;
			System.out.println("Km: " + distancia);
			break;
		default:
			System.out.println("Opção inválida");
		}

	}
}
