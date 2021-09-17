package esercizi.veicoliAbstract;

public class Autista {
	String nome;

	public Autista(String nome) {
		this.nome = nome;
	}

	public void avviaVeicolo(Guida<? extends Veicolo> g) {
		System.out.println("L'autista " + nome + " avvia la guida del veicolo " + g.veicolo);
		g.start();
	}

	public void acceleraATavoletta(Guida<? extends Veicolo> g) {
		System.out.println("L'autista " + nome + " accelera la guida del veicolo " + g.veicolo);
		g.accelera();
	}

	@Override
	public String toString() {
		return "L'autista " + nome + " ";
	}

}
