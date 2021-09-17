package esercizi.veicoliAbstract;

public class Furgone extends Veicolo {

	public Furgone(String marca, String modello, Integer velocitaMax) {
		super(marca, modello, velocitaMax);
	}

	@Override
	public String toString() {
		return marca + " " + modello;
	}

}
