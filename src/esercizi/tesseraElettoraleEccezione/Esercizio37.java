package esercizi.tesseraElettoraleEccezione;

import java.util.ArrayList;

public class Esercizio37 {

	public static void main(String[] args) {

		Maggiorenne roberto = new Maggiorenne("Roberto");
		Minorenne gianluca = new Minorenne("Gianluca");
		Maggiorenne andrea = new Maggiorenne("Andrea");
		Minorenne sara = new Minorenne("Sara");
		Minorenne monica = new Minorenne("Monica");
		Minorenne virginia = new Minorenne("Virginia");
		Maggiorenne francesco = new Maggiorenne("Francesco");
		Maggiorenne fabio = new Maggiorenne("Fabio");

		ArrayList<Cittadino> cittadini = new ArrayList<>();
		cittadini.add(francesco);
		cittadini.add(andrea);
		cittadini.add(roberto);
		cittadini.add(fabio);
		cittadini.add(virginia);
		cittadini.add(monica);
		cittadini.add(sara);
		cittadini.add(gianluca);
		for (Cittadino c : cittadini) {
			try {
				c.vota(Opzione.MONARCHIA);
			} catch (Exception e) {

				System.err.println(c.nome + " non pu� votare perch� minorenne");
			}
		}

		Maggiorenne.spoglio();
	}

}
