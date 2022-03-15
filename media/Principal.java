package media;

import java.text.DecimalFormat;

import utils.Teclado;

public class Principal {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,##0.00");
		
		double nota1 = Teclado.real("Digite a 1ª nota");
		double nota2 = Teclado.real("Digite a 2ª nota");
		double nota3 = Teclado.real("Digite a 3ª nota");
		
		
		System.out.println("Média: " + df.format((nota1 + nota2 + nota3) / 3));
		
	}
}
