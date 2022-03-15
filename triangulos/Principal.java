package triangulos;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {

		int lado1 = Teclado.inteiro("Informe o lado do triângulo");
		int lado2 = Teclado.inteiro("Informe o lado do triângulo");
		int lado3 = Teclado.inteiro("Informe o lado do triângulo");

		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Equilátero");
			return;
		}

		if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
			System.out.println("Escaleno");
			return;
		}

		System.out.println("Isósceles");

	}
}
