package quadrado;

import utils.Teclado;

public class Principal {
	public static void main(String[] args) {
		
		double lado1 = Teclado.real("Digite 1º o lado do quadrado");
		double lado2 = Teclado.real("Digite 2º o lado do quadrado");
		double lado3 = Teclado.real("Digite 3º o lado do quadrado");
		double lado4 = Teclado.real("Digite 4º o lado do quadrado");
		
		double somaLados = (lado1 + lado2 + lado3 + lado4) /4;
		
		System.out.println(somaLados == lado1 ? "É um quadrado" : "Não é um quadrado");
		
		
	}
}
