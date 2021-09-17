package esercizi.matrimonioGenerics;


public class Parroco implements PubblicoUfficiale {
	String nome;

	public Parroco(String nome) {
		this.nome = nome;
	}

	@Override
	public void unisceInMatrimonio(Coniugi<?, ?> coniugi) {
		if (coniugi.getPrimo().getClass() == coniugi.getSecondo().getClass()) {
			System.err.println("Il parroco " + nome + " non ha sposato in chiesa  " + coniugi.getPrimo() + " e  "
					+ coniugi.getSecondo());
		} else {
			System.out.println("Il parroco " + nome + " ha sposato in chiesa  " + coniugi.getPrimo() + " e  "
					+ coniugi.getSecondo());
		}

	}

}
