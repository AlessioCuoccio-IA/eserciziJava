package esercizi.tesseraElettoraleInterface;


public class Maggiorenne extends Cittadino {

	public String nome;
	public static TesseraElettorale tessera;
	public static int n_elettori = 0;
//	public static int n_votanti = 0;
//	static ArrayList<TesseraElettorale> listaTessere = new ArrayList<>();

	public Maggiorenne(String nome) {
		super(nome);
		this.nome = nome;
		n_elettori++;
	}

//	public TesseraElettorale vota(Opzione scelta)
//	{
//		TesseraElettorale tessera = new TesseraElettorale(scelta);
//		listaTessere.add(tessera);
//		tessera.timbrodivoto = true;
//		n_votanti++;
//		tessera.scelta=scelta;
//		return tessera;
//	}

	public static void spoglio() {
		for (TesseraElettorale t : listaTessere) {
			System.out.println(t);
		}

	}

}
