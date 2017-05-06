package Projeto;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		boolean fim01 = false;
		Scanner leitor = new Scanner(System.in);

		while (!fim01) {
			System.out.println("[1]Gerente.\n[2]Treinador.\n[3]Cliente.\n[4]Saida.\n\n");
			int menu01 = leitor.nextInt();

			if (menu01 == 1) {
				boolean fim02 = false;
				while (!fim02) {
					System.out.println("[1]Add Treinador.\n[2]Remove Treinador.\n[3]Altera Salario.\n[4]Saida.\n\n");
					int menu02 = leitor.nextInt();
					if (menu02 == 1) {
						fim02 = false;

					} else if (menu02 == 2) {
						fim02 = false;

					} else if (menu02 == 3) {
						fim02 = false;

					} else if (menu02 == 4) {
						System.out.println("fIM");
						fim02 = true;

					} else {
						System.out.println("Erro");
						fim02 = false;

					}
				}

			} else if (menu01 == 2) {
				boolean fim03 = false;
				while (!fim03) {
					System.out.println(
							"[1]ADD Cliente.\n[2]Remove Cliente.\n[3]ADD Treino DO Cliente.\n[4]Remove Treino Do Cliente.\n[5]Saida.\n\n\"");
					int menu03 = leitor.nextInt();
					if (menu03 == 1) {
						fim03 = false;

					} else if (menu03 == 2) {
						fim03 = false;

					} else if (menu03 == 3) {
						fim03 = false;

					} else if (menu03 == 4) {
						fim03 = false;

					} else if (menu03 == 5) {
						System.out.println("fIM");
						fim03 = true;

					} else {
						System.out.println("Erro");
						fim03 = false;

					}
				}

			} else if (menu01 == 3) {
				boolean fim04 = false;
				while (!fim04) {
					System.out.println("[1]Imprimindo Treino.\n[2]Saida.");
					int menu04 = leitor.nextInt();
					if (menu04 == 1) {
						fim04 = false;

					} else if (menu04 == 2) {
						System.out.println("fIM");
						fim04 = true;

					} else {
						System.out.println("Erro");
						fim04 = false;

					}
				}

			} else if (menu01 == 4) {
				System.out.println("fIM");
				fim01 = true;

			} else {
				System.out.println("Erro");
				fim01 = false;

			}
		}
		leitor.close();
	}

}
