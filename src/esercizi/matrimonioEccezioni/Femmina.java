package esercizi.matrimonioEccezioni;

public class Femmina {
	private String nome;

	public Femmina(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "un'individuo femmina di nome " + nome;
	}
}