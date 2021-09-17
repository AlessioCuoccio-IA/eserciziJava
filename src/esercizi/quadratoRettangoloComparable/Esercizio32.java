package esercizi.quadratoRettangoloComparable;

import java.util.ArrayList;
import java.util.Collections;

public class Esercizio32 {

	public static void main(String[] args) {
		Quadrato q1 = new Quadrato(5);
		Quadrato q2 = new Quadrato(4);
		Rettangolo r1 = new Rettangolo(3, 2);
		Rettangolo r2 = new Rettangolo(5, 4);

		ArrayList<Rettangolo> forme = new ArrayList<>();

		forme.add(r2);
		forme.add(r1);
		forme.add(q2);
		forme.add(q1);

		for (Rettangolo r : forme) {
			System.out.println(r);
		}

		Collections.sort(forme);

		System.out.println("-----------");

		for (Rettangolo r : forme) {
			System.out.println(r + " la cui area �: " + r.Area());

		}
	}

}
