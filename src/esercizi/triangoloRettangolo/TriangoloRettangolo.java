package esercizi.triangoloRettangolo;


public class TriangoloRettangolo {
	double c1;
	double c2;
	double ipo;
	
	public TriangoloRettangolo(int c1, int c2) {
		
		this.c1 = c1;
		this.c2 = c2;
		this.ipo = calcolaIpotenusa();
	}

	public double calcolaIpotenusa() {
		ipo=Math.sqrt(Math.pow(c1, 2)+Math.pow(c2, 2));
		return ipo;
	}
	
	public void perimetro( ) {
		System.out.println("Il perimetro � "+(c1+c2+ipo));
	}
	
	public void area() {
		System.out.println("L'area � "+(c1*c2)/2);
	}

	@Override
	public String toString() {
		return "c1=" + c1 + ", c2=" + c2 + ", ipo=" + ipo;
	}
	
	
}
