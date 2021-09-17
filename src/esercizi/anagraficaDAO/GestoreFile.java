package esercizi.anagraficaDAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GestoreFile {
	
	public static void creaFile(File file) {
		String path = file.getParent();
		File dir = new File(path);
		try {
			if(!dir.exists()) creaDirectory(dir);
			if(!file.exists()) file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void creaDirectory(File dir) {
		if(!dir.exists()) dir.mkdir();
	}
	
	public static void scriviRigaNelFile(File file, String riga) {
		try(BufferedWriter buffer = new BufferedWriter(new FileWriter(file));) {		
			buffer.write(riga);
			buffer.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<String> leggiFile(File file) {
		
		ArrayList<String> righeLette = new ArrayList<String>();
		
		if(file.exists()) {
			try(BufferedReader lettore = new BufferedReader(new FileReader(file));) {
				String riga;
				while((riga=lettore.readLine()) != null){
					righeLette.add(riga);
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		return righeLette;
	}
		
}
