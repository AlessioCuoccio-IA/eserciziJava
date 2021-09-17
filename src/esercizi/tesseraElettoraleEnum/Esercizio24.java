package esercizi.tesseraElettoraleEnum;



public class Esercizio24 {

	
	public static void main(String[] args) {
		
		Maggiorenne roberto = new Maggiorenne("Roberto");
		Maggiorenne gianluca = new Maggiorenne("Gianluca");
		Maggiorenne andrea = new Maggiorenne("Andrea");
		Maggiorenne sara = new Maggiorenne("Sara");
		Maggiorenne monica = new Maggiorenne("Monica");
		Maggiorenne virginia = new Maggiorenne("Virginia");
		Maggiorenne francesco = new Maggiorenne("Francesco");
		Maggiorenne fabio = new Maggiorenne("Fabio");
		
		roberto.vota(Opzione.MONARCHIA);
		sara.vota(Opzione.REPUBBLICA);
		gianluca.vota(Opzione.REPUBBLICA);
		andrea.vota(Opzione.REPUBBLICA);
		monica.vota(Opzione.REPUBBLICA);
		virginia.vota(Opzione.MONARCHIA);
		francesco.vota(Opzione.REPUBBLICA);
		fabio.vota(Opzione.MONARCHIA);
		
		System.out.println("Numero totale elettori: " + Maggiorenne.n_elettori);
		System.out.println("Numero votanti: " + Maggiorenne.n_votanti);
		

		Maggiorenne.spoglio();
	}

		
	}


