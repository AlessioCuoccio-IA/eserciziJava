package esercizi.matrimonioEccezioni;

public class Sindaco implements PubblicoUfficiale {
	String nome;

	public Sindaco(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public void unisceInMatrimonio(Coniugi<?, ?> coniugi) {
		System.out.println(
				"Il sindaco " + nome + " ha sposato in comune  " + coniugi.getPrimo() + " e " + coniugi.getSecondo());
	}

}
