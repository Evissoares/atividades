package poo.banco;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Conta {
	
	private String agencia;
	private String numConta;
	private String nome;
	private double saldo;
	private List<String> extratos;
	private String extrato;
	
	public Conta(String nome, String agencia, String numConta) {
		this.agencia = agencia;
		this.numConta = numConta;
		this.nome = nome;
		this.saldo = 0;
		this.extratos = new ArrayList<>();
		extrato = "Conta criada em: " + dataFormatada(LocalDateTime.now());
		extratos.add(extrato);
	}
	
	public String getAgencia() {
		return agencia;
	}

	public String getNumConta() {
		return numConta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void sacar(String valorSaque) {
		valorSaque = valorSaque.replace(",", ".");
		double saqueFormatado = Double.valueOf(valorSaque);
		
		if(saqueFormatado > saldo) {
			JOptionPane.showMessageDialog(null, "Saldo insuficiênte");
			return;
		}
		
		this.saldo -= saqueFormatado;
		formatarCentavosSaldo();
		extrato = "\nSaque realizado " + dataFormatada(LocalDateTime.now())
		+"\nValor do saque: R$" + saqueFormatado;
		extratos.add(extrato);
	}
	
	public void depositar(String valorDeposito) {
		valorDeposito = valorDeposito.replace(",", ".");
		double depositoFormatado = Double.valueOf(valorDeposito);
		this.saldo += depositoFormatado;
		formatarCentavosSaldo();
		extrato = "\nDepósito realizado " + dataFormatada(LocalDateTime.now())
		+"\nValor do depósito: R$" + depositoFormatado;
		extratos.add(extrato);
		
	}
	
	public String imprimirExtrato() {
		
		String extrato = "";
		for(String e : extratos) {
			extrato += e + "\n";
		}
		
		return extrato;
		
	}
	
	private String dataFormatada(LocalDateTime data) {
		
		DateTimeFormatter  formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        return data.format(formatter);
	}
	
	private void formatarCentavosSaldo() {
		DecimalFormat df = new DecimalFormat("###,###.00");
		System.out.println(saldo);
		this.saldo = Double.parseDouble(String.valueOf(df.format(this.saldo).replace(",", ".")));
		System.out.println(saldo);
	}
	
	
	
	
	
	
	

}
