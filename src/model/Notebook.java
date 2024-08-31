package model;

import java.util.Scanner;

public class Notebook extends Computador {

	// Atributos
	private Monitor monitor;

	// Construtores
	public Notebook() {
		super();
		this.monitor = new Monitor();
	}

	public Notebook(Monitor monitor) {
		super();
		this.monitor = monitor;
	}

	public Notebook(String marca, float preco, int quantidade) {
		super(marca, preco, quantidade);
		this.monitor = new Monitor();
	}

	public Notebook(Monitor monitor, String marca, float preco, int quantidade) {
		super(marca, preco, quantidade);
		this.monitor = monitor;
	}

	public Notebook(Monitor monitor, String marca, String tipoMemoria, String marcaMemoria, String tipoHD,
			String marcaHD, String capacidadeHD, String tipoFonte, String marcaFonte, float preco, int quantidade,
			int slotsMemoria, int potenciaFonte) {
		super(marca, tipoMemoria, marcaMemoria, tipoHD, marcaHD, capacidadeHD, tipoFonte, marcaFonte, preco, quantidade,
				slotsMemoria, potenciaFonte);
		this.monitor = monitor;
	}

	// Getters e Setters
	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

    // Método para cadastro
	public void entradaDados(Scanner sc) {
		System.out.println("######## Notebook ########");
		this.entradaDadosComputadorBase(sc);
		this.monitor.entradaDadosMonitor(sc);
	}

    // Método para impressão
	public void imprimir() {
		System.out.println("##################################");
		super.imprimirDadosComputadorBase();
		this.monitor.imprimirDadosMonitor();
		System.out.println("##################################");
	}
}
