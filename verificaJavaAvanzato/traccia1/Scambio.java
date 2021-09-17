package traccia1;

public class Scambio {

	public void scambiaColori(Oggetto<? extends OggettoColorabile> oggetto1,
			Oggetto<? extends OggettoColorabile> oggetto2) {

		Colore colore = oggetto1.getOggettoColorabile().getColore();

		oggetto1.getOggettoColorabile().colora(oggetto2.getOggettoColorabile().getColore());
		oggetto2.getOggettoColorabile().colora(colore);
	}

}