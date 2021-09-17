package esercizi.veicoliAbstract;

public class Auto extends Veicolo {

	public Auto(String marca, String modello, Integer velocitaMax) {
		super(marca, modello, velocitaMax);
	}

	@Override
	public String toString() {
		return marca + " " + modello;
	}

}
