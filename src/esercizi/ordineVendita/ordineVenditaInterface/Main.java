package esercizi.ordineVendita.ordineVenditaInterface;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Televisore tv = new Televisore("01", "Samsung", "UE50TU7090UXZT", "Descrizione dello smartphone", 10.00);
		Libro lib = new Libro("02", "1984", "Georg Orwell", "Descrizione libro", 10.00);
		Smartphone sm = new Smartphone("03", "Xiaomi", "Mi11", "Descrizione", 10.00);
	
		Cliente c = new Cliente("Alessio", "Cuoccio", "CCCLSS96D11A893T");
		
		RigaOrdine r1 = new RigaOrdine(tv, 1, 0);
		RigaOrdine r2 = new RigaOrdine(lib, 1, 0);
		RigaOrdine r3 = new RigaOrdine(sm, 1, 0);
		
		r1.aggiungiAnniGaranzia(1);
		r2.aggiungiAnniGaranzia(1);
		r3.aggiungiAnniGaranzia(1);
		
		ArrayList<RigaOrdine> righe = new ArrayList<>();
		
		righe.add(r1);
		righe.add(r2);
		righe.add(r3);
		
		OrdineDiVendita or = new OrdineDiVendita(c, righe, "04/06/2021");
		
		or.setStato(Stato.valueOf("IN_LAVORAZIONE"));
		
		System.out.println(or);

		
	}

}
