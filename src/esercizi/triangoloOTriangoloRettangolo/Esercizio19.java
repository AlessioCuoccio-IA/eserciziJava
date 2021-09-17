package esercizi.triangoloOTriangoloRettangolo;


public class Esercizio19 {

	public static void main(String[] args) {
		
		double a = 4;
		double b = 5;
		
		
		TriangoloRettangolo tr = new TriangoloRettangolo(a, b);
		
		System.out.println(tr);
		tr.perimetro(a, b);
		tr.area(a, b);
		

	}

}
