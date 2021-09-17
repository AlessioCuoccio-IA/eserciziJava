package esercizi.gestioneRubricaArray;


public class GestioneRubrica {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Contatto RobertoBaggio = new Contatto("Roberto", "Baggio", "Numero1");
		Contatto RobertoMancini = new Contatto("Roberto", "Mancini", "Numero2");
		Contatto AlexDelPiero = new Contatto("Alex", "Del Piero", "Numero3");
		Contatto FrancescoTotti = new Contatto("Francesco", "Totti", "Numero4");
		
		Rubrica rubrica = new Rubrica(200);
		
		rubrica.aggiungiContatto(FrancescoTotti);
		rubrica.aggiungiContatto(AlexDelPiero);
		rubrica.aggiungiContatto(RobertoMancini);
		rubrica.aggiungiContatto(RobertoBaggio);
		
		System.out.println(rubrica);
	}

}
