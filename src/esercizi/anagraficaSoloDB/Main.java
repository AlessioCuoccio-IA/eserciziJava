package esercizi.anagraficaSoloDB;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\Alessio Cuoccio\\Desktop\\prova\\prova.csv");

		ArrayList<String> stringhe = null;

		try {
			stringhe = GestoreFile.leggiFile(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (String s : stringhe) {
			String[] persone = s.split(";");
			String nome = persone[0];
			String cognome = persone[1];
			String citta = persone[2];
			String data = persone[3];
			Anagrafica anagrafiaca = new Anagrafica(nome, cognome, citta, data);
			GestoreAnagrafica.insertAnagrafica(anagrafiaca);
		}

		GestoreAnagrafica.rimuoviAnagrafica();

		for (Anagrafica a : GestoreAnagrafica.getAnagrafica()) {
			System.out.println(a);
		}

	}

}
