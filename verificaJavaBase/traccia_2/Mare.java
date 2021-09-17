package traccia_2;

public class Mare extends Territorio {

	protected String nome;

	public Mare(String nome) {
		super(nome);
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Mare " + nome;
	}

}
