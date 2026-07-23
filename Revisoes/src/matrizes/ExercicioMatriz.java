package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantidade de linhas = ");
		int l = sc.nextInt();

		System.out.println("Quantidade de colunas");
		int c = sc.nextInt();

		int[][] mat = new int[l][c];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int x = sc.nextInt();
		int linha = 0;
		int coluna = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					linha = i;
					coluna = j;
				}
			}
		}

		System.out.println("Numero encontrado na linha " + linha + " coluna " + coluna);
		System.out.println("Numero acima = " + mat[linha-1][coluna]);
		System.out.println("Numero abaixo = " + mat[linha+1][coluna]);
		System.out.println("Numero a esquerda = " + mat[linha][coluna-1]);
		System.out.println("Numero a direita = " + mat[linha][coluna+1]);
		sc.close();
	}

}
