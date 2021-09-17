package traccia_2;

public class Citta extends Territorio {

	protected String nome;

	public Citta(String nome) {
		super(nome);
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Territorio della città di " + nome;
	}

}
