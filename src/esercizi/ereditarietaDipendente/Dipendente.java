package esercizi.ereditarietaDipendente;


public class Dipendente {
	
	String nome;
	int pagaGiornaliera;
		
	public Dipendente(String nome) {
		this.nome = nome;
		this.pagaGiornaliera = 80;
	}

	public int calcolaStipendio (int giorniLavorativi) {
		return giorniLavorativi*this.pagaGiornaliera;
		
	}
}
