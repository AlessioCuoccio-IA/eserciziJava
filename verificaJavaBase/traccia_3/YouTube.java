package traccia_3;

public class YouTube {
		
	public static void main(String[] args) {
				
		Video v1 = new Video("Alessio", "Esempi di programmazione Java", 5.00);
		
		
		Video v2 = new Video("Andrea", "Java Avanzata", 10.00);
		
		
		Video v3 = new Video("Gianluca", "Sviluppo Web", 15.00);
	
		
		Commento c1 = new Commento("Utente1", "Ciao");
		Reazione r1 = new Reazione(true);

		v1.aggiungiCommento(c1);
		v1.aggiungiReazione(r1);

		Commento c2 = new Commento("Utente2", "Interessante");
		Reazione r2 = new Reazione(true);

		v2.aggiungiCommento(c2);
		v2.aggiungiReazione(r2);

		Commento c3 = new Commento("Utente3", "Non mi piace");
		Reazione r3 = new Reazione(false);

		v3.aggiungiCommento(c3);
		v3.aggiungiReazione(r3);

		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		
	}
	
}

