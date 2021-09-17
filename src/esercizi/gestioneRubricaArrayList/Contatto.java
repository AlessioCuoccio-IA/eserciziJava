package esercizi.gestioneRubricaArrayList;

public class Contatto {
	
	String Nome;
	String Cognome;
	String Contatto;
	
	public Contatto(String nome, String cognome, String contatto) {
		Nome = nome;
		Cognome = cognome;
		Contatto = contatto;
	}

	@Override
	public String toString() {
		return "Nome: " + Nome + "Cognome: " + Cognome + "Contatto: " + Contatto;
	}
}
