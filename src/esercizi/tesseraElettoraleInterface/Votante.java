package esercizi.tesseraElettoraleInterface;


import java.util.ArrayList;

public interface Votante {
	public static final Opzione scelta = null;
	static ArrayList<TesseraElettorale> listaTessere = new ArrayList<>();
	public static final int n_votanti = 0;

	public default TesseraElettorale vota(Opzione scelta) {
		TesseraElettorale tessera = new TesseraElettorale(scelta);
		listaTessere.add(tessera);
		tessera.timbrodivoto = true;
//		n_votanti++;
		tessera.scelta = scelta;
		return tessera;
	}

}
