package traccia1;

public class Traccia1 {
	public static void main(String[] args) {

		Oggetto<Maglia> maglia = new Oggetto<Maglia>(new Maglia(Colore.ROSSO));
		Oggetto<Foglio> foglio = new Oggetto<Foglio>(new Foglio(Colore.BLU));

		System.out.println(maglia.getOggettoColorabile());
		System.out.println(foglio.getOggettoColorabile());

		Scambio gestore = new Scambio();

		gestore.scambiaColori(maglia, foglio);

		System.out.println(maglia.getOggettoColorabile());
		System.out.println(foglio.getOggettoColorabile());
	}
}
