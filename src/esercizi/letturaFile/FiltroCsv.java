package esercizi.letturaFile;

import java.io.File;
import java.io.FilenameFilter;

public class FiltroCsv implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {

		return name.toLowerCase().endsWith(".csv");
	}

}
