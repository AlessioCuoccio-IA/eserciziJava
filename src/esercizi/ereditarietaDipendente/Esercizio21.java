package esercizi.ereditarietaDipendente;


public class Esercizio21 {

	public static void main(String[] args) {
		
		Dipendente d = new Dipendente("Alessio");
		
		
		
		Quadro q = new Quadro("Andrea");
		
		
		
		System.out.println("Il dipendente guadagna "+d.calcolaStipendio(30));
		System.out.println("Il quadro guadagna "+q.calcolaStipendio(30));

	}

}
