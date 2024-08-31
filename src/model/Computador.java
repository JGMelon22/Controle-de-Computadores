package model;

import java.util.Scanner;

public abstract class Computador {

	// Atributos
	private String marca, tipoMemoria, marcaMemoria, tipoHD, marcaHD, capacidadeHD, tipoFonte, marcaFonte;
	private float preco;
	private int quantidade, slotsMemoria, potenciaFonte;

	// Construtores

	public Computador() {
	}

	public Computador(String marca, String tipoMemoria, String marcaMemoria, String tipoHD, String marcaHD,
			String capacidadeHD, String tipoFonte, String marcaFonte, float preco, int quantidade, int slotsMemoria,
			int potenciaFonte) {
		this.marca = marca;
		this.tipoMemoria = tipoMemoria;
		this.marcaMemoria = marcaMemoria;
		this.tipoHD = tipoHD;
		this.marcaHD = marcaHD;
		this.capacidadeHD = capacidadeHD;
		this.tipoFonte = tipoFonte;
		this.marcaFonte = marcaFonte;
		this.preco = preco;
		this.quantidade = quantidade;
		this.slotsMemoria = slotsMemoria;
		this.potenciaFonte = potenciaFonte;
	}

	public Computador(String marca, float preco, int quantidade) {
		this.marca = marca;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Computador(String marca, String marcaMemoria, String marcaHD, String marcaFonte) {
		this.marca = marca;
		this.marcaMemoria = marcaMemoria;
		this.marcaHD = marcaHD;
		this.marcaFonte = marcaFonte;
	}

	public Computador(String tipoMemoria, String tipoHD, String tipoFonte) {
		this.tipoMemoria = tipoMemoria;
		this.tipoHD = tipoHD;
		this.tipoFonte = tipoFonte;
	}

	// Setters e Getters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipoMemoria() {
		return tipoMemoria;
	}

	public void setTipoMemoria(String tipoMemoria) {
		this.tipoMemoria = tipoMemoria;
	}

	public String getMarcaMemoria() {
		return marcaMemoria;
	}

	public void setMarcaMemoria(String marcaMemoria) {
		this.marcaMemoria = marcaMemoria;
	}

	public String getTipoHD() {
		return tipoHD;
	}

	public void setTipoHD(String tipoHD) {
		this.tipoHD = tipoHD;
	}

	public String getMarcaHD() {
		return marcaHD;
	}

	public void setMarcaHD(String marcaHD) {
		this.marcaHD = marcaHD;
	}

	public String getCapacidadeHD() {
		return capacidadeHD;
	}

	public void setCapacidadeHD(String capacidadeHD) {
		this.capacidadeHD = capacidadeHD;
	}

	public String getTipoFonte() {
		return tipoFonte;
	}

	public void setTipoFonte(String tipoFonte) {
		this.tipoFonte = tipoFonte;
	}

	public String getMarcaFonte() {
		return marcaFonte;
	}

	public void setMarcaFonte(String marcaFonte) {
		this.marcaFonte = marcaFonte;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getSlotsMemoria() {
		return slotsMemoria;
	}

	public void setSlotsMemoria(int slotsMemoria) {
		this.slotsMemoria = slotsMemoria;
	}

	public int getPotenciaFonte() {
		return potenciaFonte;
	}

	public void setPotenciaFonte(int potenciaFonte) {
		this.potenciaFonte = potenciaFonte;
	}

	// Método para cadastro
	public void entradaDadosComputadorBase(Scanner sc) {
		System.out.print("Marca: ");
		setMarca(sc.nextLine());

		System.out.print("Marca Memória: ");
		setMarcaMemoria(sc.nextLine());

		System.out.print("Tipo Memória: ");
		setTipoMemoria(sc.nextLine());

		System.out.print("Tipo HD: ");
		setTipoHD(sc.nextLine());

		System.out.print("Marca HD: ");
		setMarcaHD(sc.nextLine());

		System.out.print("Capacidade HD: ");
		setCapacidadeHD(sc.nextLine());

		System.out.print("Tipo Fonte: ");
		setTipoFonte(sc.nextLine());

		System.out.print("Marca Fonte: ");
		setMarcaFonte(sc.nextLine());

		System.out.print("Preço: ");
		setPreco(sc.nextFloat());
		sc.nextLine();

		System.out.print("Potência Fonte: ");
		setPotenciaFonte(sc.nextInt());
		sc.nextLine();

		System.out.print("Quantidade: ");
		setQuantidade(sc.nextInt());
		sc.nextLine();

		System.out.print("Slots Memória: ");
		setSlotsMemoria(sc.nextInt());
		sc.nextLine();
	}

	// Método para impressão
	public void imprimirDadosComputadorBase() {
		System.out.println("##################################");
		System.out.println("Marca: " + getMarca());
		System.out.println("Preço: " + getPreco());
		System.out.println("Quantidade: " + getQuantidade());
		System.out.println("Slots Memória: " + getSlotsMemoria());
		System.out.println("Tipo Memória: " + getTipoMemoria());
		System.out.println("Marca Memória: " + getMarcaMemoria());
		System.out.println("Tipo HD: " + getTipoHD());
		System.out.println("Marca HD: " + getMarcaHD());
		System.out.println("Capacidade HD: " + getCapacidadeHD());
		System.out.println("Tipo Fonte: " + getTipoFonte());
		System.out.println("Marca Fonte: " + getMarcaFonte());
		System.out.println("Potência Fonte: " + getPotenciaFonte());
		System.out.println("##################################");
	}
}
