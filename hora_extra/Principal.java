package hora_extra;

import utils.Teclado;

public class Principal {
	public static void main(String[] args) {
		
		double valorHora = Teclado.real("Digite o valor da hora trabalhada");
		double horasTrabalhadas = Teclado.real("Digite o total de horas normais trabalhadas");
		double horasExtraTrabalhadasCinquenta = Teclado.real("Digite o total de horas extras trabalhadas com 50% de ascrescimo");
		double horasExtraTrabalhadasCem = Teclado.real("Digite o total de horas extras trabalhadas com 100% de ascrescimo");
		double valorNormal = valorHora * horasTrabalhadas;
		double valorExtraCinquenta = (valorHora + (valorHora * 0.5)) * horasExtraTrabalhadasCinquenta;
		double valorExtraCem = (valorHora * 2) * horasExtraTrabalhadasCem;
		
		System.out.println("Horas trabalhadas: R$" + valorNormal
				+"\nHoras extras 50%: R$" + valorExtraCinquenta
				+"\nHoras extras 100%: R$" + valorExtraCem  
				+"\nSalario: R$" + (valorNormal + valorExtraCinquenta + valorExtraCem));
		
		
		
	}
}
