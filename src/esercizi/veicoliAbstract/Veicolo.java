package esercizi.veicoliAbstract;

public abstract class Veicolo {
	String marca;
	String modello;
	Integer velocitaMax;

	public Veicolo(String marca, String modello, Integer velocitaMax) {
		this.marca = marca;
		this.modello = modello;
		this.velocitaMax = velocitaMax;
	}

}
