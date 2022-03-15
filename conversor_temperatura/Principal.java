package conversor_temperatura;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {
		int converterPara = Teclado.inteiro("Digite"
				+ "\n1 - Celsius para Fahrenheit"
				+ "\n2 - Fahrenheit para Celsius");
		
		double temperatura = Teclado.real("Digite a temperatura");
		
		
		System.out.println(converterPara == 1 ? ((temperatura * 9 / 5) + 32) + "°F" : ((temperatura -32)*5 / 9) + "°C");
		
	}
}
