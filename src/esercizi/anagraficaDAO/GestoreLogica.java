package esercizi.anagraficaDAO;

import java.util.Scanner;

public class GestoreLogica {
	
	Scanner scanner;
    private AnagraficaDao gestoreAnagrafiche;

    
	public GestoreLogica(AnagraficaDao gestoreAnagrafiche) {
		this.gestoreAnagrafiche = gestoreAnagrafiche;
	}
	
	//Application Logic
	
	public void init() {
		for(;;) {
			String scelta = getScelta();
        	switch(scelta.toLowerCase()){
        	case "l": listAllAnagrafiche();
        		break;
        	case "i": getAnagraficaDaConsole();
        		break;
        	case "e": return;
        	}
		}

	}

	public String getScelta() {
		scanner = new Scanner(System.in);
		System.out.print("\n(I) Inserisci Anagrafica\n(L) Lista Anagrafiche\n(E) Esci\nScegli:");
		String scelta = scanner.next();
		return scelta;
	}

	public String recuperaDettaglioAnagrafica(String dettaglio) {
		scanner = new Scanner(System.in);
		System.out.println("Inserisci " + dettaglio + ": ");
		return scanner.next();
	}
    
	public void printDettagliAnagrafica(String anagrafica){
       System.out.println(anagrafica);
    }

	public void getAnagraficaDaConsole() {
    	String nome = recuperaDettaglioAnagrafica("nome");
    	String cognome = recuperaDettaglioAnagrafica("cognome");
    	String citta = recuperaDettaglioAnagrafica("citt� di nascita");
    	String dataDiNascita = recuperaDettaglioAnagrafica("data di nascita (dd/mm/yyyy)");
    	aggiungiAnagrafica(nome, cognome, citta, dataDiNascita);
    }
    
    
	public void aggiungiAnagrafica(String nome, String cognome, String citta, String dataDiNascita) {
		Anagrafica anagrafica = new Anagrafica(nome, cognome, citta, dataDiNascita);
		gestoreAnagrafiche.insertAnagrafica(anagrafica);
	}
	
	public void listAllAnagrafiche(){                
    	for(Anagrafica a : gestoreAnagrafiche.getAnagrafiche()) {
    		printDettagliAnagrafica(a.toString());
    	}
    }

}
