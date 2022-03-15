package lacos_repeticao.adivinha_numero;

import java.util.Random;

import javax.swing.JOptionPane;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {

		Random r = new Random();
		int aleatorio = r.nextInt(100) + 1;
		int tentativas = 0;
		int valor;
		
		do {
			
			tentativas++;
			valor = Teclado.inteiro("Chute um número de 1 a 100");
			
			if(valor < aleatorio) {
				JOptionPane.showMessageDialog(null, "É maior");
			} if(valor > aleatorio) {
				JOptionPane.showMessageDialog(null, "É menor");
			}
			
		}while(valor != aleatorio);
		
		System.out.println("Tentativas usadas: " + tentativas 
				+"\nNúmero gerado: " + aleatorio);
		

	}
}
