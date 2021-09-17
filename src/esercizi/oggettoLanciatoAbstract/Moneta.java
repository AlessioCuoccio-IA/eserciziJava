package esercizi.oggettoLanciatoAbstract;

public class Moneta extends OggettoLanciato {
	Integer risultato;

	@Override
	public void lancio() {

		risultato = (int) (Math.random() * FacciaMoneta.values().length);

	}

	public void stampa() {
		System.out.println(FacciaMoneta.values()[risultato]);
	}

}
