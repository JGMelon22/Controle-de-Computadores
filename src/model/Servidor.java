package model;

import java.util.Scanner;

public class Servidor extends Computador {

	// Atributos
	private int numeroHD, capacidadeMemoria;
	private String tipoGabinete, marcaGabinete;

	// Construtores
	public Servidor() {
	}

	public Servidor(int numeroHD, int capacidadeMemoria, String tipoGabinete, String marcaGabinete) {
		this.numeroHD = numeroHD;
		this.capacidadeMemoria = capacidadeMemoria;
		this.tipoGabinete = tipoGabinete;
		this.marcaGabinete = marcaGabinete;
	}

	public Servidor(int numeroHD, int capacidadeMemoria, String tipoGabinete, String marcaGabinete, String marca,
			String tipoMemoria, String marcaMemoria, String tipoHD, String marcaHD, String capacidadeHD,
			String tipoFonte, String marcaFonte, float preco, int quantidade, int slotsMemoria, int potenciaFonte) {
		super(marca, tipoMemoria, marcaMemoria, tipoHD, marcaHD, capacidadeHD, tipoFonte, marcaFonte, preco, quantidade, slotsMemoria, potenciaFonte);
		this.numeroHD = numeroHD;
		this.capacidadeMemoria = capacidadeMemoria;
		this.tipoGabinete = tipoGabinete;
		this.marcaGabinete = marcaGabinete;
	}

	// Métodos getter e setter
	public int getNumeroHD() {
		return numeroHD;
	}

	public void setNumeroHD(int numeroHD) {
		this.numeroHD = numeroHD;
	}

	public int getCapacidadeMemoria() {
		return capacidadeMemoria;
	}

	public void setCapacidadeMemoria(int capacidadeMemoria) {
		this.capacidadeMemoria = capacidadeMemoria;
	}

	public String getTipoGabinete() {
		return tipoGabinete;
	}

	public void setTipoGabinete(String tipoGabinete) {
		this.tipoGabinete = tipoGabinete;
	}

	public String getMarcaGabinete() {
		return marcaGabinete;
	}

	public void setMarcaGabinete(String marcaGabinete) {
		this.marcaGabinete = marcaGabinete;
	}

	// Métodos para entrada de dados
	public void entradaDados(Scanner sc) {
        System.out.println("--------Servidor--------");
        this.entradaDadosComputadorBase(sc);

        System.out.print("Tipo Gabinete: ");
        setTipoGabinete(sc.nextLine());

        System.out.print("Capacidade Memoria: ");
        setCapacidadeMemoria(sc.nextInt());
    }

	// Métodos para impressão
	public void imprimir() {
		System.out.println("##################################");
		this.imprimirDadosComputadorBase();
		System.out.println("Numero HD: " + getNumeroHD());
		System.out.println("Capacidade Memoria: " + getCapacidadeMemoria());
		System.out.println("Tipo Gabinete: " + getTipoGabinete());
		System.out.println("Marca Gabinete: " + getMarcaGabinete());
		System.out.println("##################################");
	}

}
