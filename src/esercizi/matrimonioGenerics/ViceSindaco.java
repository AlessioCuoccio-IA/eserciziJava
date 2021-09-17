package esercizi.matrimonioGenerics;


public class ViceSindaco extends Sindaco {

	public ViceSindaco(String nome) {
		super(nome);
	}

	public void unisceInMatrimonio(Coniugi<?, ?> coniugi) {
		System.out.println("Il vicesindaco " + super.getNome() + " ha sposato in comune " + coniugi.getPrimo() + " e "
				+ coniugi.getSecondo());
	}

}
