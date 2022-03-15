package calculadora_imc;

import utils.Teclado;

public class Principal {
	public static void main(String[] args) {
		
		double peso = Teclado.real("Digite seu peso em kg");
		double altura = Teclado.real("Digite sua altura em cm");
		altura /= 100;
		
		double imc = peso / (altura * altura);
		
		
		if(imc < 17.5) {
			System.out.println("IMC: " + imc + "\nAbaixo do peso");
			return;
		}
		if(imc < 25) {
			System.out.println("IMC: " + imc + "\nPeso normal");
			return;
		}
		if(imc < 30) {
			System.out.println("IMC: " + imc + "\nAcima do peso");
			return;
		}
		if(imc < 35) {
			System.out.println("IMC: " + imc + "\nObesidade 1");
			return;
		}
		if(imc < 40) {
			System.out.println("IMC: " + imc + "\nObesidade 2");
			return;
		}
		System.out.println("IMC: " + imc + "\nObesidade 3");

		
	}
}
