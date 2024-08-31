package model;

import java.util.Scanner;

public class Monitor {

	// Atributos
	private String tipo;
	private String marca;
	private int resolucao;

	// Construtores
	public Monitor() {
	}

	public Monitor(String tipo, String marca, int resolucao) {
		this.tipo = tipo;
		this.marca = marca;
		this.resolucao = resolucao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getResolucao() {
		return resolucao;
	}

	public void setResolucao(int resolucao) {
		this.resolucao = resolucao;
	}

	// Método para cadastro
	public void entradaDadosMonitor(Scanner sc) {
		System.out.println("######## Monitor ########");

		System.out.print("Tipo: ");
		setTipo(sc.nextLine());

		System.out.print("Marca: ");
		setMarca(sc.nextLine());

		System.out.print("Resolução: ");

		setResolucao(sc.nextInt());
		sc.nextLine();
	}

	// Método para impressão
	public void imprimirDadosMonitor() {
		System.out.println("##################################");
		System.out.println("Marca: " + getMarca());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Resolução: " + getResolucao());
		System.out.println("##################################");
	}

}
