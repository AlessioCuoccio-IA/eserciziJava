package esercizi.areaPerimetroRettangolo;
public class Esercizio02 {
//
	//
	//
	//
	public static void main(String[] args) {
		double base = 3;
		double altezza = 7;
		
		double area = (base*altezza)/2;
		
		
		System.out.println("Il perimetro del rettangolo � : "+(base+altezza)*2);
		System.out.println("L'area del rettangolo � : "+base*altezza);
		
		System.out.println("L'area del triangolo � : "+area);
	
		String ris = (altezza>base) ? "L'altezza � maggiore della base" : "La base � maggiore dell'altezza";
	
		System.out.println(ris);
	}

}
