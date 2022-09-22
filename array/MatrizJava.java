package ArrayJava;

import java.util.Scanner;

public class MatrizJava {
	public static void main(String[] args) {
		int[][] m = new int[3][3];
		int linha, coluna, valorM = 0;

		Scanner leia = new Scanner(System.in);

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite o valor: ");
				m[linha][coluna] = leia.nextInt();

				if (m[linha][coluna] > 10) {
					valorM++;
				}

			}
		}
		System.out.println("Valor linha e coluna: "+valorM);

	}

}
