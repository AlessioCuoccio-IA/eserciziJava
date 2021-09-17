package esercizi.tesseraElettoraleEccezione;

import java.util.ArrayList;

public class Maggiorenne extends Cittadino {

	public String nome;
	public static TesseraElettorale tessera;
	public static int n_elettori = 0;
	static ArrayList<TesseraElettorale> listaTessere = new ArrayList<>();

	public Maggiorenne(String nome) {
		super(nome);
		this.nome = nome;
		n_elettori++;
	}

	public static void spoglio() {
		for (TesseraElettorale t : listaTessere) {
			System.out.println(t);
		}

	}

	@Override
	public TesseraElettorale vota(Opzione scelta) throws Exception {
		TesseraElettorale tessera = new TesseraElettorale(scelta);
		listaTessere.add(tessera);
		tessera.timbrodivoto = true;
		tessera.scelta = scelta;
		return tessera;
	}

}
