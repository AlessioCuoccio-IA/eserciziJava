package traccia_1;

import java.util.Arrays;

public class Traccia1 {

	public static void main(String[] args) {
//Primo array e ciclo per il calcolo della media

		int[] numeri = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		double media = 0;
		int contatore = 0;
		int somma = 0;

		for (int i = 0; i < numeri.length; i++) {

			contatore++;
			somma += numeri[i];

		}

		media = somma / contatore;

		System.out.println("La media dei numeri inseriti è " + media);

		System.out.println("");
		System.out.println("");

//Secondo array e stampa della media		
		Arrays.sort(numeri);
		int[] numeri2 = new int[numeri.length - 5];
		double somma2 = 0;
		int i;
		int j;

		for (i = 0, j = 0; i < numeri.length; i++, j++) {

			if (numeri[i] > media) {
				if (j < numeri2.length) {
					numeri2[j] = numeri[i];
				} else {
					j = 0;
					numeri2[j] = numeri[i];
				}
			}
		}

		for (i = 0; i < numeri2.length; i++) {
			somma2 += numeri2[i];

		}
		double nuova_media = somma2 / numeri2.length;
		System.out.println("La media dei nuovi numeri è: " + nuova_media);

	}

}
