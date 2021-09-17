package esercizi.ordineVendita.ordineVenditaDate;


public class Televisore extends Prodotto{
	String marca;
	String modello;
	
	
	public Televisore(String id, String marca, String modello, String descrizione, Double prezzo) {
		super.id=id;
		super.prezzo=prezzo;
		this.marca = marca;
		this.modello = modello;
		super.descrizione = descrizione;
	}


	@Override
	public String toString() {
		return id + " - " + marca + " - " + modello + " - " + descrizione
				+ " - " + prezzo;
	}
	
	
	
	
}
