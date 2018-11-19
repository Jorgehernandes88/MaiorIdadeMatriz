package matriz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[][] matriz = new String[2][4];
		int linha = 0;
		int coluna = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Linha " + linha + " Coluna " + coluna);

				System.out.println("Nome");
				matriz[0][linha] = sc.nextLine();
				System.out.println("Idade");
				matriz[1][coluna] = sc.nextLine();

				linha = linha + 1;
				coluna = coluna + 1;
			}
		}

		// Imprimi todos os digitados
		System.out.println("***********************************************");
		linha = 0;
		coluna = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				System.out.println("Nome " + matriz[0][linha] + " Idade " + matriz[1][coluna]);
				linha = linha + 1;
				coluna = coluna + 1;
			}
		}

//		Testar valor maior
		System.out.println("***********************************************");

		coluna = 0;
		int ColunaSelecionada = 0;
		int v1 = 0;
		int vm = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				if (Integer.parseInt(matriz[1][coluna]) > v1) {				
		
					if (Integer.parseInt(matriz[1][coluna]) > vm)
					{
						vm = Integer.parseInt(matriz[1][coluna]);
						ColunaSelecionada = coluna;
					}
					
				}else {
					v1 = Integer.parseInt(matriz[1][coluna]);
				}

				coluna = coluna + 1;
			}
		}

		System.out.println("Maior Idade encontrada: " + matriz[1][ColunaSelecionada]);
		System.out.println("Nome : " + matriz[0][ColunaSelecionada]);
		
	}

}
