package esercizi.anagraficaScritturaLetturaFile;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GestoreFile {

	public static void creaDirectory(File dir) {
		if (!dir.exists())
			dir.mkdir();

	}

	public static void creaFile(File file) throws IOException {
		String path = file.getParent();
		File dir = new File(path);
		creaDirectory(dir);
		if (!file.exists())
			file.createNewFile();
	}

	public static void cancellaFile(File file) {
		if (file.exists())
			file.delete();
	}

	public static void scriviFile(File file, String stringa) {
		try (BufferedWriter bff = new BufferedWriter(new FileWriter(file))) {
			bff.write(stringa);
			bff.flush();
		} catch (IOException e) {
			System.err.println("Errore durante la scrittura sul file");
			e.printStackTrace();
		}
	}

	public static ArrayList<String> leggiFile(File file) {
		ArrayList<String> stringhe = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String riga;
			while ((riga = reader.readLine()) != null) {

				stringhe.add(riga);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stringhe;
	}

}
