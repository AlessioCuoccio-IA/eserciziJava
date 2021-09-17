package esercizi.studenteComparator;

import java.time.LocalDate;
import java.time.Period;

public class Studente {
	String nome;
	String cognome;
	LocalDate dataDiNascita;
	Integer eta;

	public Studente(String nome, String cognome, LocalDate dataDiNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.eta = Period.between(dataDiNascita, LocalDate.now()).getYears();
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}

}
