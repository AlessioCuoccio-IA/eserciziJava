package esercizi.eccezioniPortafoglio;

public class Portafoglio {
	Integer soldi = 0;

	public Portafoglio() {

	}

	public void aggiungiDenaro(Integer soldi) {
		 this.soldi += soldi;
	}

	public void prendiDenaro(Integer soldi) throws Exception{
		
		if (this.soldi < soldi) {
			throw new IllegalArgumentException("Disponibilit� < prelievo");}
		else this.soldi -= soldi;
	}

	@Override
	public String toString() {
		return "Portafoglio [soldi=" + soldi + "]";
	}

}
