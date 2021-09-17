package esercizi.findDeleteInArrayList;


public class Esercizio14 {
	public static void main(String[] args) 
	{
		Contatto RobertoBaggio = new Contatto("Roberto", "Baggio", "3334567890");
		Contatto RobertoMancini = new Contatto("Roberto", "Mancini", "3345645678");
		Contatto AlexDelPiero = new Contatto("Alex", "Del Piero", "3569828402");
		Contatto FrancescoTotti = new Contatto("Francesco", "Totti", "3498726632");
		
		Rubrica rubrica = new Rubrica();
		
		rubrica.aggiungicontatto(FrancescoTotti);
		rubrica.aggiungicontatto(AlexDelPiero);
		rubrica.aggiungicontatto(RobertoMancini);
		rubrica.aggiungicontatto(RobertoBaggio);
		
		System.out.println(rubrica);
		
		rubrica.cerca_numero("Roberto", "Baggio");
		rubrica.rimuovicontatto("Roberto", "Mancini");
		
		
		System.out.println(rubrica);
	}
}
