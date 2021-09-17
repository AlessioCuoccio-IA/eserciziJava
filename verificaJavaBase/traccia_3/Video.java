package traccia_3;

import java.util.ArrayList;

public class Video {
	String autore;
	String titolo;
	Double lunghezza;
	ArrayList<Commento> commenti = new ArrayList<>();
	ArrayList<Reazione> reazioni = new ArrayList<>();
	
	public Video(String autore, String titolo, Double lunghezza) {
		this.autore = autore;
		this.titolo = titolo;
		this.lunghezza = lunghezza;
	}

	public String getAutore() {
		return autore;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Double getLunghezza() {
		return lunghezza;
	}

	public void aggiungiCommento(Commento c) {
		commenti.add(c);
	}

	public void rimuoviCommento(Commento c) {
		commenti.remove(c);
	}

	public void aggiungiReazione(Reazione r) {
		reazioni.add(r);
	}

	public void rimuoviReazione(Reazione r) {
		reazioni.remove(r);
	}
	
	@Override
	public String toString() {
		return "Video [autore=" + autore + ", titolo=" + titolo + ", lunghezza=" + lunghezza + ", commenti=" + commenti
				+ ", reazioni=" + reazioni + "]";
	}

}
