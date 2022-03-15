package horoscopo;

import utils.Teclado;

public class Principal {

    public static void main(String[] args) {


        int dia = Teclado.inteiro("Digite o dia do seu aniversário");
        int mes = Teclado.inteiro("Digite o mês do seu aniversário"
                + "\n1 - Janeiro"
                + "\n2 - Fevereiro"
                + "\n3 - Março"
                + "\n4 - Abril"
                + "\n5 - Maio"
                + "\n6 - Junho"
                + "\n7 - Julho"
                + "\n8 - Agosto"
                + "\n9 - Setembro"
                + "\n10 - Outubro"
                + "\n11 - Novembro"
                + "\n12 - Dezembro");

        if (mes == 1 && dia > 20 || mes == 2 && dia < 19) {
            System.out.println("Aquário");
        } else if (mes == 2 && dia > 18 || mes == 3 && dia < 21) {
            System.out.println("Peixes");
        } else if (mes == 3 && dia > 20 || mes == 4 && dia < 21) {
            System.out.println("Áries");
        }else if(mes == 4 && dia > 20 || mes == 5 && dia < 21){
			System.out.println("Touro");
		} else if(mes == 5 && dia > 18 || mes == 6 && dia < 21){
			System.out.println("Gêmeos");
		} else if(mes == 6 && dia > 20 || mes == 7 && dia < 23){
			System.out.println("Câncer");
		} else if(mes == 7 && dia > 22 || mes == 8 && dia < 23){
			System.out.println("Leão");
		}  else if(mes == 8 && dia > 22 || mes == 9 && dia < 23){
			System.out.println("Virgem");
		}  else if(mes == 9 && dia > 22 || mes == 10 && dia < 23){
			System.out.println("Libra");
		}   else if(mes == 10 && dia > 22 || mes == 11 && dia < 22){
			System.out.println("Escorpião");
		}  else if(mes == 11 && dia > 21 || mes == 12 && dia < 22){
			System.out.println("Sagitário");
		}  else if(mes == 12 && dia > 21 || mes == 1 && dia < 21){
			System.out.println("Capricórnio");
		} else{
			System.out.println("Dia ou mês informado é inválido");
		}

        /**
         * Aquário: de 21 de janeiro a 18 de fevereiro;
         * Peixes: de 19 de fevereiro a 20 de março;
         * Áries: de 21 de março a 20 de abril;
         * Touro: de 21 de abril a 20 de maio;
         * Gêmeos: de 21 de maio a 20 de junho;
         * Câncer: de 21 de junho a 22 de julho;
         * Leão: de 23 de julho a 22 de agosto;
         * Virgem: de 23 de agosto a 22 de setembro;
         * Libra: de 23 de setembro a 22 de outubro;
         * Escorpião: de 23 de outubro a 21 de novembro;
		 *
         * Sagitário: de 22 de novembro a 21 de dezembro;
         * Capricórnio: de 22 de dezembro a 20 de janeiro;
         */

    }
}
