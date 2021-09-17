package esercizi.compareToFrutta;

public class Banana extends Frutto{

	public Banana(String nome, Double peso) {
		super(nome, peso);
		
	}

	@Override
	public String toString() {
		return "Banana [nome=" + nome + ", peso=" + peso + "]";
	}

	
}
