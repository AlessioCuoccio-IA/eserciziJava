package esercizi.gestioneRubricaArrayList;

import java.util.ArrayList;

public class Esercizio13 {

	public static void main(String[] args) {
		Contatto RobertoBaggio = new Contatto("Roberto", "Baggio", "Numero1");
		Contatto RobertoMancini = new Contatto("Roberto", "Mancini", "Numero2");
		Contatto AlexDelPiero = new Contatto("Alex", "Del Piero", "Numero3");
		Contatto FrancescoTotti = new Contatto("Francesco", "Totti", "Numero4");
		
		ArrayList <Contatto> rubrica = new ArrayList<>();
		
		rubrica.add(FrancescoTotti);
		rubrica.add(AlexDelPiero);
		rubrica.add(RobertoMancini);
		rubrica.add(RobertoBaggio);
		
		System.out.println(rubrica);
	}

}
