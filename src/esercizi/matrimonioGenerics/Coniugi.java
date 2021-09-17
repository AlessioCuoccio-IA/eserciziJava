package esercizi.matrimonioGenerics;


public class Coniugi<X, Y> extends Coppia<X, Y> {

	private X maschio;
	private Y femmina;

	public Coniugi(X maschio, Y femmina) {
		this.maschio = maschio;
		this.femmina = femmina;
	}

	@Override
	public X getPrimo() {

		return maschio;
	}

	@Override
	public Y getSecondo() {

		return femmina;
	}

}
