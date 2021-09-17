package esercizi.anagraficaScritturaLetturaFile;


import java.util.ArrayList;

public class GestoreAnagrafica {

	static ArrayList<Anagrafica> anagrafiche = new ArrayList<>();
	public static Integer contatore = 0;

	public static void insertAnagrafica(Anagrafica persona) {
		anagrafiche.add(persona);
		contatore = anagrafiche.size();
	}

	public static void creaAnagrafica(ArrayList<String> stringhe) {
		for (String s : stringhe) {
			String[] persone = s.split(";");
			Anagrafica p = new Anagrafica(persone[0], persone[1], persone[2], persone[3]);
			insertAnagrafica(p);
		}

	}

	public static void mostraAnagrafica() {
		for (Anagrafica p : anagrafiche) {
			System.out.println(p);
		}
	}
}
