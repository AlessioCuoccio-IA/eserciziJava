package esercizi.ordineVendita.ordineVenditaEnum;


public class Libro extends Prodotto{
	String titolo;
	String autore;
	
	
	public Libro(String id, String titolo, String autore, String descrizione, Double prezzo) {
		super.id=id;
		super.prezzo=prezzo;
		this.titolo = titolo;
		this.autore = autore;
		super.descrizione = descrizione;
	}


	@Override
	public String toString() {
		return id + " - " + CatProdotto.LIBRO + " - " + autore + " - " + prezzo;
	}
	
}
