package esercizi.creazioneFile;

import java.io.File;
import java.io.IOException;

public class GestoreFile {
	File dir;
	File file;

	public void creaFile(File file) throws IOException {
		if (!file.exists())
			file.createNewFile();
		throw new IOException();
	}

	public void creaDirectory(File dir) throws IOException {
		if (!dir.exists())
			file.mkdir();
		throw new IOException();
	}

}
