package ArrayJava;

public class Exercicio1 {

	public static void main(String[] args) {
		int[] A = { 1, 0, 5, -2, -5, 7 };
		int soma=0, X;

		for (X = 0; X < 6; X++) {
		soma= A[0]+A[1]+A[5];
		A[4]=100;
		
		}
		System.out.println("Valor: "+soma);

		for(X = 0; X < 6; X++) {
			System.out.println("Valor de cada elemento: "+A[X]);
		}
	}
}
