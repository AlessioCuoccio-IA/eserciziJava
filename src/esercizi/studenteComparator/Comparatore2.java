package esercizi.studenteComparator;

import java.util.Comparator;

public class Comparatore2 implements Comparator<Studente> {

	@Override
	public int compare(Studente a, Studente b) {
		int ris = a.cognome.compareTo(b.cognome);
		if (ris == 0) {
			ris = a.nome.compareTo(b.nome);
		}
		return ris;

	}

}
