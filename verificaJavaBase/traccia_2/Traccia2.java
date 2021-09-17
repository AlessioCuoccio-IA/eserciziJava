package traccia_2;

public class Traccia2 {

	public static void main(String[] args) {

		Citta andria = new Citta("Andria");
		Mare adriatico = new Mare("Adriatico");
		Citta corato = new Citta("Corato");
		Citta bisceglie = new Citta("Bisceglie");
		Citta trani = new Citta("Trani");
		Citta barletta = new Citta("Barletta");

		trani.setTerritoriConfinanti(adriatico);
		trani.setTerritoriConfinanti(bisceglie);
		trani.setTerritoriConfinanti(corato);
		trani.setTerritoriConfinanti(andria);
		trani.setTerritoriConfinanti(barletta);

		System.out.println(trani.confini());
		System.out.println(bisceglie.confini());
	}

}
