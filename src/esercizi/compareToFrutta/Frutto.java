package esercizi.compareToFrutta;

public abstract class Frutto implements Comparable<Frutto>{
	String nome;
	Double peso;
	
	public Frutto(String nome, Double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	

	@Override
	public int compareTo(Frutto o) {
		return peso.compareTo(o.peso);
	}

	
	
	
}
