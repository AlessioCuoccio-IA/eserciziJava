package esercizi.studenteComparator;

import java.util.Comparator;

public class Comparatore implements Comparator<Studente> {

	@Override
	public int compare(Studente a, Studente b) {
		return a.dataDiNascita.compareTo(b.dataDiNascita);
//				Integer.compare(a.eta, b.eta);
	}

}
