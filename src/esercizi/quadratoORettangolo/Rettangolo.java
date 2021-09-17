package esercizi.quadratoORettangolo;

public class Rettangolo {
	int base;
	int altezza;
	
	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public int Area() {
		return altezza*base;
	}
	
	public int Perimetro() {
		return (base+altezza)*2;
	}
	
}
