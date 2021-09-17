package esercizi.calcolaRata;

public class Esercizio03 {

	public static void main(String[] args) {
		int sommaIniziale = 1000;
		double tasso = 0.03;
		double rata;
		
		for(int i=0; i<3; i++) {
			sommaIniziale+=+(sommaIniziale*tasso);
			System.out.println(sommaIniziale);
		} 
		
		rata =sommaIniziale+(sommaIniziale*tasso);
		System.out.println("La somma dopo il primo anno � "+rata); 
		
		rata +=+(sommaIniziale*tasso);
		System.out.println("La somma dopo il secondo anno � "+rata); 
		
		rata +=+(sommaIniziale*tasso);
		System.out.println("La somma dopo il terzo anno � "+rata); 
		
		
	}

}
