package traccia2;

import java.util.Comparator;

public class ComparatoreDataCompleanno implements Comparator<Studente> {

	@Override
	public int compare(Studente o1, Studente o2) {

		int ris = o1.dataNascita.getMonth().compareTo(o2.dataNascita.getMonth());

		if (ris == 0) {
			ris = o1.dataNascita.getDayOfWeek().compareTo(o2.dataNascita.getDayOfWeek());
		}
		return ris;
	}

}
