package esercizi.quadratoORettangolo;

public class Quadrato extends Rettangolo{
	
	public Quadrato(int lato) {
		super(lato, lato);
		}

	@Override
	public String toString() {
		return "lato " + base;
	}
	
	
	
	
}
