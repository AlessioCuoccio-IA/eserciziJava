package esercizi.matrimonioEreditarietaInterface;


public class Parroco implements PubblicoUfficiale{
	String nome;

	public Parroco(String nome) {
		this.nome = nome;
	}

	@Override
	public void unisceInMatrimonio(Maschio m, Femmina f) {
		System.out.println("Il parroco "+ nome +
				" ha sposato in Chiesa un individuo maschio di nome " + m.nome +
				" e un individuo femmina di nome " + f.nome);
		
	

		
	}

	
}
