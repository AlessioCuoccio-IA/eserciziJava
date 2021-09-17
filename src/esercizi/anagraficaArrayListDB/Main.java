package esercizi.anagraficaArrayListDB;

import java.io.File;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		String filePropertiesPostgres = "postgres.properties";
		String filePropertiesMySql = "mysql.properties";

		ConnectionManager connessione1 = new ConnectionManager(filePropertiesPostgres);

		File file = new File("C:\\Users\\Alessio Cuoccio\\Desktop\\prova\\prova.csv");

		ArrayList<String> stringhe = GestoreFile.leggiFile(file);
		GestoreAnagrafica.creaAnagrafica(stringhe, connessione1);
		GestoreAnagrafica.rimuoviAnagrafica(connessione1);

		GestoreAnagrafica.mostraAnagrafica(connessione1);

	}

}
