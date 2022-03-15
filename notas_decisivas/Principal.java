package notas_decisivas;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {
		
		
		double nota1 = Teclado.real("Digite a primeira nota do aluno");
		double nota2 = Teclado.real("Digite a segunda nota do aluno");
		
		System.out.println((nota1 < 7 || nota2 < 7) ? "Reprovado" : "Aprovado");
		
	}
}
