package esercizi.ereditarietaRettangoloQuadrato;


public class Quadrato extends Rettangolo{
	
	public Quadrato(int lato) {
		super(lato, lato);
		}
	
	@Override
	public int Perimetro() {
		return super.base*4;
	}

	@Override
	public String toString() {
		return "lato " + base;
	}
	
	
	
	
}
