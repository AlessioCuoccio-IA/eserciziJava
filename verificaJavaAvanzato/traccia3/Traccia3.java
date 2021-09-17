package traccia3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Traccia3 {

	public static void main(String[] args) {

		StudenteDAOimpl gestore = new StudenteDAOimpl();

		Studente mario = new Studente("Mario", LocalDate.of(2006, 11, 23));
		Studente gianna = new Studente("Gianna", LocalDate.of(2006, 1, 13));
		Studente franco = new Studente("Franco", LocalDate.of(2005, 5, 12));
		Studente chiara = new Studente("Chiara", LocalDate.of(2006, 4, 6));
		Studente rino = new Studente("Rino", LocalDate.of(2007, 7, 18));
		Studente peppe = new Studente("Peppe", LocalDate.of(2007, 5, 2));

		ArrayList<Studente> studenti = new ArrayList<Studente>();

		studenti.add(mario);
		studenti.add(gianna);
		studenti.add(franco);
		studenti.add(chiara);
		studenti.add(rino);
		studenti.add(peppe);

		for (Studente s : studenti) {
			gestore.insertAnagrafica(s);

		}

		ArrayList<Studente> studentiDaOrdinare = gestore.getStudente();

		Collections.sort(studentiDaOrdinare);

		System.out.println("Primo ordinamento" + "\n");
		for (Studente s : studentiDaOrdinare) {
			System.out.println(s);
		}

		System.out.println("----------------------------------------------------------");

		studentiDaOrdinare.sort(new ComparatoreDataCompleanno());

		System.out.println("Secondo ordinamento" + "\n");
		for (Studente s : studentiDaOrdinare) {
			System.out.println("Lo studente " + s.nome + " compie gli anni il " + s.dataNascita.getDayOfMonth() + " "
					+ s.dataNascita.getMonth());
		}
	}
}
