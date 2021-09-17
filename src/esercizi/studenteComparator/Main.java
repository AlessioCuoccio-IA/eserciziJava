package esercizi.studenteComparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		Comparatore c = new Comparatore();
		Comparatore2 c2 = new Comparatore2();

		Studente alessio = new Studente("Alessio", "Cuoccio", LocalDate.of(1996, 04, 11));
		Studente alessio2 = new Studente("Mario", "Cuoccio", LocalDate.of(1996, 04, 10));
		Studente alessio3 = new Studente("Vito", "Cuoccio", LocalDate.of(1996, 04, 9));
		Studente giacomo = new Studente("Giacomo", "Signorile", LocalDate.of(1992, 01, 16));
		Studente gianluca = new Studente("Gianluca", "Marino", LocalDate.of(2001, 07, 03));

		ArrayList<Studente> studenti = new ArrayList<>();
		studenti.add(alessio);
		studenti.add(alessio2);
		studenti.add(giacomo);
		studenti.add(gianluca);
		studenti.add(alessio3);

		for (Studente s : studenti) {
			System.out.println(s);
		}

		System.out.println("------");

		Collections.sort(studenti, c);

		for (Studente s : studenti) {
			System.out.println(s);
		}

		System.out.println("------");
		Collections.sort(studenti, c2);
		for (Studente s : studenti) {
			System.out.println(s);
		}
	}
}
