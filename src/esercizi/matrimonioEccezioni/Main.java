package esercizi.matrimonioEccezioni;



public class Main {
	public static void main(String[] args) {

		Maschio gino = new Maschio("Gino");
		Femmina peppa = new Femmina("Peppa");

		Maschio luigi = new Maschio("Luigi");
		Femmina gina = new Femmina("Gina");

		Parroco dino = new Parroco("Don Dino");

		ViceSindaco donato = new ViceSindaco("Donato");

		Coniugi<Femmina, Femmina> coppia = new Coniugi<Femmina, Femmina>(peppa, gina);
		try {
			dino.unisceInMatrimonio(coppia);
		} catch (Exception e) {
			System.err.println("Il parroco " + dino.nome + " NON ha sposato in chiesa  " + coppia.getPrimo() + " e  "
					+ coppia.getSecondo());

		}
		donato.unisceInMatrimonio(coppia);
	}
}
