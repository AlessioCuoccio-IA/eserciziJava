package esercizi.tesseraElettoraleInterface;


public class TesseraElettorale {

	public boolean timbrodivoto = false;
	public Opzione scelta;

	public TesseraElettorale(Opzione scelta) {
		this.scelta = scelta;
	}

	public Opzione getScelta() {
		return scelta;
	}

	public void setScelta(Opzione scelta) {
		this.scelta = scelta;
	}

	@Override
	public String toString() {
		return "TesseraElettorale [scelta=" + scelta + "]";
	}
}
