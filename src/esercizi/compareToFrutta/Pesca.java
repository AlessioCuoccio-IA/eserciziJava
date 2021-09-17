package esercizi.compareToFrutta;

public class Pesca extends Frutto{

	public Pesca(String nome, Double peso) {
		super(nome, peso);
		
	}

	@Override
	public String toString() {
		return "Pesca [nome=" + nome + ", peso=" + peso + "]";
	}

}
