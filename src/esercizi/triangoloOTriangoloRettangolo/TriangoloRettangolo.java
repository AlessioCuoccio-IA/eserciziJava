package esercizi.triangoloOTriangoloRettangolo;


public class TriangoloRettangolo extends Triangolo{
//	double c1;
//	double c2;
	double ipo;
	
	public TriangoloRettangolo(double c1, double c2) {
		super(c1, c2);
		this.ipo=calcolaIpotenusa(c1, c2);
	}

	public double calcolaIpotenusa(double c1, double c2) {
		ipo=Math.sqrt(Math.pow(c1, 2)+Math.pow(c2, 2));
		return ipo;
	}
	
	public void perimetro( double c1, double c2) {
		System.out.println("Il perimetro � "+(c1+c2+ipo));
	}
	
	public void area(double c1, double c2) {
		System.out.println("L'area � "+(c1*c2)/2);
	}
	
	public String classificazione(double c1, double c2, double ipo) {
		if (c1==c2 && c1==ipo) {
			return"Equilatero"; 
		} else if (c1==c2 || c2==ipo) {
			return"Isoscele";
		} else {
			return"Scalero";
		}
	}

	@Override
	public String toString() {
		return "TriangoloRettangolo [ipo=" + ipo + ", a=" + a + ", b=" + b + "]";
	}

	

	

		
	
}
