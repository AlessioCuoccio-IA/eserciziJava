package esercizi.ordineVendita.ordineVendita;



import java.util.ArrayList;

public class OrdineDiVendita {
	Cliente cliente;
	ArrayList<RigaOrdine> righe;
	Double totale=0.0;
	
	
	
	
	
	public OrdineDiVendita(Cliente cliente, ArrayList<RigaOrdine> righe) {
		this.cliente = cliente;
		this.righe = righe;
		this.totale = totale();
	}
		
	public Double totale() {
		for(RigaOrdine r : righe) {
			totale+=r.totaleRiga;
		} return totale;
	}
	
	
	
	

	@Override
	public String toString() {
		return cliente + "\n"
				+ "\n" + "\n"
				+ righe
				+ "\n" + "\n"
				+ "Totale: " + totale + "\n"
				+ "\n" + "\n";
	}
	
	
}
