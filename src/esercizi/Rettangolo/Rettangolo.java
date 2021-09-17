package esercizi.Rettangolo;

public class Rettangolo {
	int base;
	int altezza;
	
	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public void Area() {
		System.out.println((altezza*base)/2);
	}
	
	public void Perimetro() {
		System.out.println((base+altezza)*2);
	}
	
}
