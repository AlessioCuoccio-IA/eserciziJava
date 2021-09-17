package esercizi.matrimonioEreditarietaInterface;


public class Main {
public static void main(String[] args) {
		Parroco dondino = new Parroco("Don Dino");
		ViceSindaco gino = new ViceSindaco("Gino");
		Maschio adamo = new Maschio("Adamo");
		Femmina eva = new Femmina("Eva");
		dondino.unisceInMatrimonio(adamo, eva);
		gino.unisceInMatrimonio(adamo, eva);
	}
}
