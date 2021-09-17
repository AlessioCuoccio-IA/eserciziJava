package esercizi.oggettoLanciatoAbstract;

public class Dado extends OggettoLanciato {

	@Override
	public void lancio() {
		Integer risultato = (int) (Math.random() * 6 + 1);
		System.out.println(risultato);

	}

}
