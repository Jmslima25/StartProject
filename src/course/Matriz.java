package course;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de linhas e colunas:");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[m][n];

		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				mat[i][j] = sc.nextInt();

			}
		}

		System.out.print(mat[m][n] + " ");

		sc.close();
	}
}
