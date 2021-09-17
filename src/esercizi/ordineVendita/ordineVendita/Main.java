package esercizi.ordineVendita.ordineVendita;


import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Televisore tv = new Televisore("01", "Samsung", "UE50TU7090UXZT", "Descrizione dello smartphone", 500.50);
		Libro lib = new Libro("02", "1984", "Georg Orwell", "Descrizione libro", 15.90);
		Smartphone sm = new Smartphone("03", "Xiaomi", "Mi11", "Descrizione", 300.50);
	
		Cliente c = new Cliente("Alessio", "Cuoccio", "CCCLSS96D11A893T");
		
		RigaOrdine r1 = new RigaOrdine(tv, 2, 10);
		RigaOrdine r2 = new RigaOrdine(lib, 2, 10);
		RigaOrdine r3 = new RigaOrdine(sm, 2, 10);
		
		ArrayList<RigaOrdine> righe = new ArrayList<>();
		
		righe.add(r1);
		righe.add(r2);
		righe.add(r3);
		
		OrdineDiVendita or = new OrdineDiVendita(c, righe);
				
		System.out.println(or);

		
	}

}
