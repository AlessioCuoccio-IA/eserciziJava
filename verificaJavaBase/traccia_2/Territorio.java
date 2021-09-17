package traccia_2;

import java.util.ArrayList;

public class Territorio {

	protected String nome;
	protected ArrayList<Territorio> territoriConfinanti = new ArrayList<Territorio>();

	public Territorio(String nome) {
		this.nome = nome;
	}

	public void setTerritoriConfinanti(Territorio nome) {
		territoriConfinanti.add(nome);
	}

	public String confini() {
		
		if (territoriConfinanti.size() > 0) {
			
			String output = "I confini del territorio della città di " + nome + " sono:\n";

				for (Territorio t : territoriConfinanti) {
					output += t + "\n";
				}
	
				return output;
		}
		else return "Non sono stati ancora inseriti i confini del territorio della città di " + nome;
	}
}
