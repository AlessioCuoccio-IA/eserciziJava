package esercizi.tesseraElettoraleEccezione;

public class Minorenne extends Cittadino {

	String nome;

	public Minorenne(String nome) {
		super(nome);
		this.nome = nome;
	}

	@Override
	public TesseraElettorale vota(Opzione scelta) throws Exception {
		throw new Exception();
	}

}
