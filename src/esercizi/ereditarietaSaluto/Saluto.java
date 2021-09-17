package esercizi.ereditarietaSaluto;



public abstract class Saluto {
	
	String nome;
	
	
	public Saluto(String nome) {
		this.nome = nome;
	}

	public void buongiorno() {
		System.out.println("Buongiorno ");
	}
	
	public abstract void titolo();
	
	public void nome() {
		System.out.println(nome); 
	};
	
	public void saluto() {
		 buongiorno();
		 titolo();
		 nome();
	}

	
	
}
