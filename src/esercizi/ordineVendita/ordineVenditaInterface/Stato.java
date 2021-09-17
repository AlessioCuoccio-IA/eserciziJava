package esercizi.ordineVendita.ordineVenditaInterface;


public enum Stato {
	IN_LAVORAZIONE("In lavorazione"),
	SPEDITO("Spedito"),
	CONSEGNATO("Consegnato");
	
	String descrizione;

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	private Stato(String descrizione) {
		this.descrizione = descrizione;
	}

	
	
	
	
}
