package esercizi.matrimonioGenerics;


public class Main {
	public static void main(String[] args) {
		Maschio gino = new Maschio("Gino");
		Femmina peppa = new Femmina("Peppa");
		Maschio luigi = new Maschio("Luigi");
		Femmina gina = new Femmina("Gina");
		Parroco dino = new Parroco("Don Dino");
		ViceSindaco donato = new ViceSindaco("Donato");

		Coniugi<Femmina, Femmina> coppia = new Coniugi<Femmina, Femmina>(peppa, gina);
		dino.unisceInMatrimonio(coppia);
		donato.unisceInMatrimonio(coppia);
	}
}
