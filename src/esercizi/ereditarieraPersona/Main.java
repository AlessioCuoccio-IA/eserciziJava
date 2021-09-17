package esercizi.ereditarieraPersona;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Uomo alessio = new Uomo("Alessio", LocalDate.of(1996, 04, 11));
		Uomo giacomo = new Uomo("Giacomo", LocalDate.of(1992, 01, 16));
		Uomo dalila = new Uomo("dalila", LocalDate.of(2001, 11, 05));
		Uomo serena = new Uomo("Serena", LocalDate.of(2001, 06, 13));
		Donna signora = new Donna("Signora", LocalDate.of(1964, 07, 19));
		ArrayList<Persona> persone = new ArrayList<>();

		persone.add(serena);
		persone.add(alessio);
		persone.add(dalila);
		persone.add(giacomo);
		persone.add(signora);

		for (Persona p : persone) {
			try {
				System.out.println(p.getEta());
			} catch (Exception e) {
				System.err.println("Non si chiede l'et� ad una signora!");
			}
		}
	}

}
