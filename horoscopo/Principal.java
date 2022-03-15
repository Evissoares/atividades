package horoscopo;

import utils.Teclado;

public class Principal {

    public static void main(String[] args) {


        int dia = Teclado.inteiro("Digite o dia do seu anivers�rio");
        int mes = Teclado.inteiro("Digite o m�s do seu anivers�rio"
                + "\n1 - Janeiro"
                + "\n2 - Fevereiro"
                + "\n3 - Mar�o"
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
            System.out.println("Aqu�rio");
        } else if (mes == 2 && dia > 18 || mes == 3 && dia < 21) {
            System.out.println("Peixes");
        } else if (mes == 3 && dia > 20 || mes == 4 && dia < 21) {
            System.out.println("�ries");
        }else if(mes == 4 && dia > 20 || mes == 5 && dia < 21){
			System.out.println("Touro");
		} else if(mes == 5 && dia > 18 || mes == 6 && dia < 21){
			System.out.println("G�meos");
		} else if(mes == 6 && dia > 20 || mes == 7 && dia < 23){
			System.out.println("C�ncer");
		} else if(mes == 7 && dia > 22 || mes == 8 && dia < 23){
			System.out.println("Le�o");
		}  else if(mes == 8 && dia > 22 || mes == 9 && dia < 23){
			System.out.println("Virgem");
		}  else if(mes == 9 && dia > 22 || mes == 10 && dia < 23){
			System.out.println("Libra");
		}   else if(mes == 10 && dia > 22 || mes == 11 && dia < 22){
			System.out.println("Escorpi�o");
		}  else if(mes == 11 && dia > 21 || mes == 12 && dia < 22){
			System.out.println("Sagit�rio");
		}  else if(mes == 12 && dia > 21 || mes == 1 && dia < 21){
			System.out.println("Capric�rnio");
		} else{
			System.out.println("Dia ou m�s informado � inv�lido");
		}

        /**
         * Aqu�rio: de 21 de janeiro a 18 de fevereiro;
         * Peixes: de 19 de fevereiro a 20 de mar�o;
         * �ries: de 21 de mar�o a 20 de abril;
         * Touro: de 21 de abril a 20 de maio;
         * G�meos: de 21 de maio a 20 de junho;
         * C�ncer: de 21 de junho a 22 de julho;
         * Le�o: de 23 de julho a 22 de agosto;
         * Virgem: de 23 de agosto a 22 de setembro;
         * Libra: de 23 de setembro a 22 de outubro;
         * Escorpi�o: de 23 de outubro a 21 de novembro;
		 *
         * Sagit�rio: de 22 de novembro a 21 de dezembro;
         * Capric�rnio: de 22 de dezembro a 20 de janeiro;
         */

    }
}
