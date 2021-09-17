package esercizi.ordineVendita.ordineVenditaAbstract;


public class Smartphone extends Prodotto{
	String marca;
	String modello;
	
	
	public Smartphone(String id, String marca, String modello, String descrizione, Double prezzo) {
		super.id=id;
		super.prezzo=prezzo;
		this.marca = marca;
		this.modello = modello;
		super.descrizione = descrizione;
	}


	@Override
	public String toString() {
		return id +" - " + CatProdotto.SMARTPHONE + " - " + marca + " - " + modello + " - " + " - " + descrizione
				+ " - " + prezzo;
	}
	
	
	
}
