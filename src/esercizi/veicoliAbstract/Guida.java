package esercizi.veicoliAbstract;

public class Guida<V extends Veicolo> {
	Veicolo veicolo;

	public Guida(Veicolo veicolo) {
		this.veicolo = veicolo;
	}

	public void start() {
		System.out.println("Il motore si � acceso");
	}

	public void accelera() {
		System.out.println("Il veicolo ha raggiunto al velocit� massima di " + veicolo.velocitaMax);
	}

	@Override
	public String toString() {
		return "Guida [veicolo=" + veicolo + "]";
	}

}
