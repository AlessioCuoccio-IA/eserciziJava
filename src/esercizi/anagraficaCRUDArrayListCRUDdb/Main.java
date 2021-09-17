package esercizi.anagraficaCRUDArrayListCRUDdb;

import java.io.File;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		

		

		File file = new File("C:\\Users\\Alessio Cuoccio\\Desktop\\prova\\prova.csv");

		ArrayList<String> stringhe = GestoreFile.leggiFile(file);
		GestoreAnagrafica.creaAnagrafica(stringhe);
		GestoreAnagrafica.rimuoviAnagrafica();

		GestoreAnagrafica.mostraAnagrafica();

	}

}
