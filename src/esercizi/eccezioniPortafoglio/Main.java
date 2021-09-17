package esercizi.eccezioniPortafoglio;

public class Main {

	public static void main(String[] args) {

		Portafoglio portafoglio = new Portafoglio();

		portafoglio.aggiungiDenaro(50);
		
		try {
			portafoglio.prendiDenaro(60);
		} catch (Exception e) {
		System.out.println("Riprova");
			e.printStackTrace();
		}
		
	
		
	}
}
