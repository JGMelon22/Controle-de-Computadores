package model;

import java.util.Scanner;

public class Desktop extends Computador {

	// Campos
	private Monitor monitor;
	private String marcaPlacaVideo, tipoGabinete, marcaGabinete;
	private int quantidadePlacasVideo;

	// Construtores
	public Desktop() {
		super();
		this.monitor = new Monitor();
	}

	public Desktop(Monitor monitor) {
		super();
		this.monitor = monitor;
	}

	public Desktop(Monitor monitor, String marcaPlacaVideo) {
		super();
		this.monitor = monitor;
		this.marcaPlacaVideo = marcaPlacaVideo;
	}

	public Desktop(Monitor monitor, String marcaPlacaVideo, int quantidadePlacasVideo) {
		super();
		this.monitor = monitor;
		this.marcaPlacaVideo = marcaPlacaVideo;
		this.quantidadePlacasVideo = quantidadePlacasVideo;
	}

	public Desktop(Monitor monitor, String marcaPlacaVideo, int quantidadePlacasVideo, String marca, String tipoMemoria,
			String marcaMemoria, String tipoHD, String marcaHD, String capacidadeHD, String tipoFonte,
			String marcaFonte, float preco, int quantidade, int slotsMemoria, int potenciaFonte,
			String tipoGabinete, String marcaGabinete) {
		super(marca, tipoMemoria, marcaMemoria, tipoHD, marcaHD, capacidadeHD, tipoFonte, marcaFonte, preco, quantidade,
				slotsMemoria, potenciaFonte);
		this.monitor = monitor;
		this.marcaPlacaVideo = marcaPlacaVideo;
		this.quantidadePlacasVideo = quantidadePlacasVideo;
		this.tipoGabinete = tipoGabinete;
		this.marcaGabinete = marcaGabinete;
	}

	// Getters e Setters
	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public String getMarcaPlacaVideo() {
		return marcaPlacaVideo;
	}

	public void setMarcaPlacaVideo(String marcaPlacaVideo) {
		this.marcaPlacaVideo = marcaPlacaVideo;
	}

	public int getQuantidadePlacasVideo() {
		return quantidadePlacasVideo;
	}

	public void setQuantidadePlacasVideo(int quantidadePlacasVideo) {
		this.quantidadePlacasVideo = quantidadePlacasVideo;
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

	// Método para cadastro
	public void entradaDados(Scanner sc) {
		System.out.println("######## Desktop ########");
		this.entradaDadosComputadorBase(sc);

		this.monitor.entradaDadosMonitor(sc);

		System.out.print("Marca da Placa de Vídeo: ");
		this.marcaPlacaVideo = sc.nextLine();

		System.out.print("Quantidade de Placas de Vídeo: ");
		this.quantidadePlacasVideo = sc.nextInt();
		sc.nextLine();

		System.out.print("Tipo do Gabinete: ");
		this.tipoGabinete = sc.nextLine();

		System.out.print("Marca do Gabinete: ");
		this.marcaGabinete = sc.nextLine();
	}

	// Método para impressão
	public void imprimir() {
		System.out.println("##################################");
		this.imprimirDadosComputadorBase();
		System.out.println("Marca da Placa de Vídeo: " + this.marcaPlacaVideo);
		System.out.println("Quantidade de Placas de Vídeo: " + this.quantidadePlacasVideo);
		System.out.println("Tipo Gabinete: " + this.tipoGabinete);
		System.out.println("Marca Gabinete: " + this.marcaGabinete);
		this.monitor.imprimirDadosMonitor();
		System.out.println("##################################");
	}
}
