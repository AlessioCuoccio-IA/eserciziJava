package esercizi.classificazionePerimetroRettangolo;



public class Triangolo {
	int a;
	int b;
	int c;
	String classe;
	String perimetro;
	
	public Triangolo(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String classificazione() {
		if (a==b && b==c) {
			return"Equilatero"; 
		} else if (a==b || b==c) {
			return"Isoscele";
		} else {
			return"Scalero";
		}
	}
	
	public int perimetro( ) {
		return a+b+c; 
	}

	@Override
	public String toString() {
		return "Il perimetro del triangolo "+classificazione()+" di lati "+a+", "+b+", "+c+" � "+perimetro();
	}

	

	
}
