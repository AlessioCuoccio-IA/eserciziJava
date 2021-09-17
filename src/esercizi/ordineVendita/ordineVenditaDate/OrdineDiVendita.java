package esercizi.ordineVendita.ordineVenditaDate;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class OrdineDiVendita {
	Cliente cliente;
	ArrayList<RigaOrdine> righe;
	Double totale=0.0;
	LocalDate dataOrdine;
	
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public OrdineDiVendita(Cliente cliente, ArrayList<RigaOrdine> righe, String dataOrdine) {
		this.cliente = cliente;
		this.righe = righe;
		this.totale = totale();
		this.dataOrdine= stringToDate(dataOrdine);
	}
	
	public LocalDate stringToDate(String date) {
		LocalDate data = LocalDate.parse(date, formatter);
		return data;
	}
	
	public String dateToString() {
		String dataString = dataOrdine.format(formatter);
		return dataString;
	}
	
	public Double totale() {
		for(RigaOrdine r : righe) {
			totale+=r.totaleRiga;
		} return totale;
	}
	
	@Override
	public String toString() {
		return cliente + "\n"
	+ dateToString()
	+ "\n" + "\n"
	+ righe
	+ "\n" + "\n"
	+ "Totale: " + totale + "\n"
	+ "\n" + "\n";
	}
	
	
}
