import java.util.Scanner;

public class questao9 {
	public static void main(String[] args) {
		Scanner puxe = new Scanner(System.in);

		System.out.print("Digite um numero inteiro para o tamanho da matriz quadrática: ");

		int q = puxe.nextInt();

		double[][] Matriz = new double[q][q];

		double MaiorMatriz, MenorMatriz;

		double MaiorLinha, MenorLinha;

		double MaiorColuna, MenorColuna;

		MaiorMatriz = MaiorColuna = MaiorLinha = 0;

		MenorLinha = MenorColuna = MenorMatriz = 99999;

		double SomaMatriz, SomaDiagonal;

		SomaMatriz = SomaDiagonal = 0;
		double MediaMatriz, MediaLinha;

		MediaLinha = MediaMatriz = 0;

		double[][] MatrizTranposta = new double[q][q];

		double elementoM, elementoC, elementoL;
		elementoC = elementoL = elementoM = 0;

		for (int i = 0; i < q; i++) {

			System.out.println("Dê valores para " + (i + 1) + "° linha da matriz");

			for (int j = 0; j < q; j++) {

				System.out.print("Digite um valor para a " + (j + 1) + "° coluna: ");

				Matriz[i][j] = puxe.nextDouble();

				SomaMatriz += Matriz[i][j];


			}

			SomaDiagonal += Matriz[i][i];

		}

		for (int i = 0; i < q; i++) {

			MaiorColuna = MaiorLinha = 0;

			MenorLinha = MenorColuna = 999999;

			for (int j = 0; j < q; j++) {

				// checagem das linhas

				elementoL = Matriz[i][j];

				if (elementoL > MaiorLinha)

					MaiorLinha = elementoL;

				if (elementoL < MenorLinha)

					MenorLinha = elementoL;

				// checagem das colunas

				elementoC = Matriz[j][i];

				if (elementoC > MaiorColuna)

					MaiorColuna = elementoC;


				if (elementoC < MenorColuna)

					MenorColuna = elementoC;
				// checagem da matriz

				elementoM = Matriz[i][j];
				if (elementoM > MaiorMatriz)

					MaiorMatriz = elementoM;

				if (elementoM < MenorMatriz)

					MenorMatriz = elementoM;


				MediaLinha += (elementoL / q);

			}
			// printagem

			System.out.println("O maior elemento da linha " + i + " é   " + MaiorLinha);

			System.out.println("E o menor elemento da linha " + i + " é   " + MenorLinha);

			System.out.println();

			System.out.println("__________________________________________________________________");

			System.out.println();

			System.out.println("O maior elemento da coluna " + i + " é   " + MaiorColuna);

			System.out.println("E o  menor elemento da coluna " + i + " é   " + MenorColuna);

			System.out.println();

			System.out.println("__________________________________________________________________");

			System.out.println();

			System.out.println("A media aritmética dos elementos da linha " + i + " é:   " + MediaLinha);

			System.out.println();

			System.out.println("__________________________________________________________________");

			System.out.println("__________________________________________________________________");

			System.out.println();

			// Adcionarei aqui a variavel MediaLinha, elementoL/q, pq no final,
			// o resultado será a média "pronta"

			// elementoL, significa elemento da linha, apenas mais uma
			// abreviação de Matriz[i][j]


		}

		System.out.println("A soma dos elementos dessa matriz é " + SomaMatriz);

		System.out.println("E a soma da diagonal principal é " + SomaDiagonal);

		System.out.println("O maior elemento dessa matriz é: " + MaiorMatriz);

		System.out.println("E o menor é: " + MenorMatriz);

		MediaMatriz = SomaMatriz / (q * q);

		System.out.println("A media dos elementos dessa matriz é:   " + MediaMatriz);

		// tentarei fazer agora, a matriz transposta

		System.out.println("A matriz transposta: ");

		for (int i = 0; i < q; i++) {

			System.out.print("\n");

			for (int j = 0; j < q; j++) {

				MatrizTranposta[i][j] = Matriz[j][i];

				System.out.print(MatrizTranposta[i][j] + " ");

			}

		}

		puxe.close();
	}
}
