package esercizi.letturaFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

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

		for (File f : files) {
			try {
				GestoreFile.creaFile(f);
			} catch (IOException e) {
				System.err.println("Problema nella creazione dei file");
				e.printStackTrace();
			}
		}

		File dir = file1.getParentFile();

		for (File f : dir.listFiles(new FiltroCsv())) {
			GestoreFile.cancellaFile(f);

		}

		for (File f : dir.listFiles(new FiltroTxt())) {

			GestoreFile.scriviFile(f, "Hello World");
		}

		
		GestoreFile.leggiFile(file1);
	
	}
}
