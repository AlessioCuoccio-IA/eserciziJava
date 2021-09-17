package esercizi.veicoliAbstract;

public class Main {

	public static void main(String[] args) {
		Guida<Veicolo> guida1 = new Guida<Veicolo>(new Auto("Ford", "Focus", 200));
		Guida<Veicolo> guida2 = new Guida<Veicolo>(new Furgone("Fiat", "Ducato", 150));

		Autista alessio = new Autista("Alessio");

		alessio.avviaVeicolo(guida1);
		alessio.acceleraATavoletta(guida1);

		alessio.avviaVeicolo(guida2);
		alessio.acceleraATavoletta(guida2);

	}

}
