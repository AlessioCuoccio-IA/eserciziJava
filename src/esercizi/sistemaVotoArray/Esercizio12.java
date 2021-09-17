package esercizi.sistemaVotoArray;


public class Esercizio12 {

	
	public static void main(String[] args) {
		
		Maggiorenne roberto = new Maggiorenne("Roberto");
		Maggiorenne gianluca = new Maggiorenne("Gianluca");
		Maggiorenne andrea = new Maggiorenne("Andrea");
		Maggiorenne sara = new Maggiorenne("Sara");
		Maggiorenne monica = new Maggiorenne("Monica");
		Maggiorenne virginia = new Maggiorenne("Virginia");
		Maggiorenne francesco = new Maggiorenne("Francesco");
		Maggiorenne fabio = new Maggiorenne("Fabio");
		roberto.vota();
		sara.vota();
		//nina.haVotato();
		System.out.println("Numero totale elettori: " + Maggiorenne.n_elettori);
		System.out.println("Numero votanti: " + Maggiorenne.n_votanti);
		
		roberto.ha_votato();
		andrea.ha_votato();
		
	}

		
	}


