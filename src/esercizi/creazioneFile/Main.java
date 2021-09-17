package esercizi.creazioneFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		File dir = new File("C:\\Users\\Alessio Cuoccio\\Desktop\\prova");

		File file1 = new File("C:\\Users\\Alessio Cuoccio\\Desktop\\prova\\prova1.txt");
		File file2 = new File("C:\\Users\\Alessio Cuoccio\\Desktop\\prova\\prova2.txt");
		File file3 = new File("C:\\Users\\Alessio Cuoccio\\Desktop\\prova\\prova3.txt");

		File file4 = new File("C:\\Users\\Alessio Cuoccio\\Desktop\\prova\\prova1.csv");
		File file5 = new File("C:\\Users\\Alessio Cuoccio\\Desktop\\prova\\prova2.csv");
		File file6 = new File("C:\\Users\\Alessio Cuoccio\\Desktop\\prova\\prova3.csv");

		ArrayList<File> files = new ArrayList<>();
		files.add(file1);
		files.add(file2);
		files.add(file3);
		files.add(file4);
		files.add(file5);
		files.add(file6);

		dir.mkdir();

		for (File f : files) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.err.println("Problemi con la creazione del file");

			}
		}

		FiltroCsv filtro = new FiltroCsv();

		for (File f : dir.listFiles(filtro)) {
			f.delete();
		}
		try (BufferedWriter bff = new BufferedWriter(new FileWriter(file1))) {
			bff.write("Hello World");
			bff.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
