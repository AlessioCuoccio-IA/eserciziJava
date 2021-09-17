package esercizi.matrimonioEreditarietaInterface;


public class Sindaco implements PubblicoUfficiale{
	String nome;

	public Sindaco(String nome) {
		this.nome = nome;
	}

	@Override
	public void unisceInMatrimonio(Maschio m, Femmina f) {
		System.out.println("Il sindaco "+ nome +
				" ha sposato in Comune un individuo maschio di nome " + m.nome +
				" e un individuo femmina di nome " + f.nome);
		
	}

	
}
