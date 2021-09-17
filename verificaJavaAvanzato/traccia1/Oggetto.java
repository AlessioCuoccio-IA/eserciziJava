package traccia1;

public class Oggetto<T> {

	private T oggettoColorabile;

	public Oggetto(T oggettoColorabile) {
		this.oggettoColorabile = oggettoColorabile;
	}

	public T getOggettoColorabile() {
		return oggettoColorabile;
	}

	public void setOggettoColorabile(T oggettoColorabile) {
		this.oggettoColorabile = oggettoColorabile;
	}

}
