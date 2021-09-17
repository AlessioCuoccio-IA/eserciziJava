package traccia1;

public class Foglio implements OggettoColorabile {

	private Colore colore;

	public Foglio(Colore colore) {
		this.colore = colore;
	}

	public Foglio() {

	}

	@Override
	public void colora(Colore colore) {
		this.colore = colore;
	}

	@Override
	public Colore getColore() {
		return colore;
	}

	@Override
	public String toString() {
		return "Foglio " + colore;
	}

}