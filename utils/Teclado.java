package utils;

import javax.swing.JOptionPane;

public class Teclado {

	
	public static double real(String msg) {
		return Double.parseDouble(JOptionPane.showInputDialog(null, msg));
	}
	
	public static int inteiro(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(null, msg));
	}
	
	public static String texto(String msg) {
		return JOptionPane.showInputDialog(null, msg);

	}
	
	public static char letra(String msg) {
		String letra = JOptionPane.showInputDialog(null, msg);
		return letra.charAt(0);
	}
	
	
}

