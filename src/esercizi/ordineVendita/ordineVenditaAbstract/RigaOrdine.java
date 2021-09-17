package esercizi.ordineVendita.ordineVenditaAbstract;


public class RigaOrdine {
	Prodotto p;
	Integer quantita;
	Integer sconto;
	Double totaleRiga;
			
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
	public String toString() {
		return "|" + p + "|" + quantita + "|" + sconto + "|" + totaleRiga + "|\n";
	}
	
	
}
