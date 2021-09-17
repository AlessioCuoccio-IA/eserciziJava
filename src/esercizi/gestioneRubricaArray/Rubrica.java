package esercizi.gestioneRubricaArray;

import java.util.Arrays;


public class Rubrica {
	Contatto [] Contatti;
	int max;
	int nContatti = 0;
		
	public Rubrica(int max) {
		this.max=max;
		this.Contatti = new Contatto[max];
	}

	public void aggiungiContatto(Contatto contatto) {
		Contatti[nContatti]= contatto;
		nContatti+=1;
		
	}

	@Override
	public String toString() {
		return "Rubrica  " + Arrays.toString(Contatti) + "]";
	
	}
}


