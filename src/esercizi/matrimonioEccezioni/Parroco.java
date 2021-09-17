package esercizi.matrimonioEccezioni;



public class Parroco implements PubblicoUfficiale {
	String nome;

	public Parroco(String nome) {
		this.nome = nome;
	}

	@Override
	public void unisceInMatrimonio(Coniugi<?, ?> coniugi) throws Exception {
		if (coniugi.getPrimo().getClass() == coniugi.getSecondo().getClass()) {
			throw new Exception();

		} else {
			System.out.println("Il parroco " + nome + " ha sposato in chiesa  " + coniugi.getPrimo() + " e  "
					+ coniugi.getSecondo());
		}

	}

}
