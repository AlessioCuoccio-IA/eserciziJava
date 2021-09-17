package esercizi.es56;


import java.util.ArrayList;

public class AnagraficaDAOimplAL implements AnagraficaDAO {

	static ArrayList<Anagrafica> anagrafiche = new ArrayList<>();
	public static Integer contatore = 0;

	@Override
	public void insertAnagrafica(esercizi.es56.Anagrafica persona) {
		anagrafiche.add(persona);
		contatore = anagrafiche.size();

	}

	@Override
	public void rimuoviAnagrafica() {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Anagrafica> getAnagrafica() {
		return anagrafiche;
	}

}
