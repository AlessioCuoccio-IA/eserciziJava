package esercizi.ordineVendita.ordineVenditaInterface;


public class RigaOrdine implements EstensioneGaranzia {
	Prodotto p;
	Integer quantita;
	Integer sconto;
	Double totaleRiga;
	Integer anniGaranzia;
			
	public RigaOrdine(Prodotto p, Integer quantita, Integer sconto) {
		this.p = p;
		this.quantita = quantita;
		this.sconto = sconto;
		this.totaleRiga = totaleRiga();
	}
	
	public Double totaleRiga() {
		return (p.prezzo*quantita)-(sconto*p.prezzo)/100;
	}
	
	@Override
	public void aggiungiAnniGaranzia(int anni) {
			this.anniGaranzia=anni;
			p.prezzo+= p.prezzo*(10*anni)/100;
	}
	
	@Override
	public String toString() {
		return "|" + p + " - Garanzia + " + anniGaranzia +  "|" + quantita + "|" + sconto + "|" + totaleRiga + "|\n";
	}

	
	
	
}
