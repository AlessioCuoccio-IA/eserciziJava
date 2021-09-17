package traccia1;

public class Maglia implements OggettoColorabile {
	private Colore colore;

	public Maglia(Colore colore) {
		this.colore = colore;
	}

	public Maglia() {

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
		return "Maglia " + colore;
	}

}
