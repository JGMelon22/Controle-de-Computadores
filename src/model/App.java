package model;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Arrays para armazenar os objetos
		Servidor[] servidores = new Servidor[3];
		Notebook[] notebooks = new Notebook[3];
		Desktop[] desktops = new Desktop[3];

		// Cadastro dos objetos
		for (int i = 0; i < 3; i++) {
			System.out.println("\nCadastrando Servidor " + (i + 1));
			servidores[i] = new Servidor();
			servidores[i].entradaDados(scanner);

			System.out.println("\nCadastrando Notebook " + (i + 1));
			notebooks[i] = new Notebook();
			notebooks[i].entradaDados(scanner);

			System.out.println("\nCadastrando Desktop " + (i + 1));
			desktops[i] = new Desktop();
			desktops[i].entradaDados(scanner);
		}

		// Impressão dos objetos cadastrados
		System.out.println("\n--- Computadores Cadastrados ---");
		for (int i = 0; i < 3; i++) {
			System.out.println("\nServidor " + (i + 1));
			servidores[i].imprimir();

			System.out.println("\nNotebook " + (i + 1));
			notebooks[i].imprimir();

			System.out.println("\nDesktop " + (i + 1));
			desktops[i].imprimir();
		}

		scanner.close();
	}
}
