package esercizi.matrimonioGenerics;


public class Maschio {
	private String nome;

	public Maschio(String nome) {
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
		return "un'individuo maschio di nome " + nome;
	}

}