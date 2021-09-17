package traccia_3;

public class Commento {
	String utente;
	String testo;

	public Commento(String utente, String testo) {
		this.utente = utente;
		this.testo = testo;
	}

	@Override
	public String toString() {
		return "utente=" + utente + ", testo=" + testo;
	}

}
