package esercizi.ordineVendita.ordineVenditaInterface;


public class Cliente {
	String nome;
	String cognome;
	String cf;
	
	public Cliente(String nome, String cognome, String cf) {
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\n"
				+"Cognome: " + cognome + "\n"
				+"Codice Fiscale: " + cf + "\n";
	}
	
	
	
}
