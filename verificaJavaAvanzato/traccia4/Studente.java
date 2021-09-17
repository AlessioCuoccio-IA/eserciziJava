package traccia4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Studente implements Comparable<Studente> {
	String nome;
	LocalDate dataNascita;
	Integer eta;

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Studente(String nome, LocalDate dataNascita) {
		this.nome = nome;
		this.dataNascita = dataNascita;
		this.eta = Period.between(dataNascita, LocalDate.now()).getYears();
	}

	public Studente(String nome, String dataNascita) {
		this.nome = nome;
		this.dataNascita = stringToDate(dataNascita);
		this.eta = Period.between(this.dataNascita, LocalDate.now()).getYears();
	}

	public String dateToString() {
		String dataString = dataNascita.format(formatter);
		return dataString;
	}

	public LocalDate stringToDate(String date) {
		LocalDate data = LocalDate.parse(date, formatter);
		return data;
	}

	@Override
	public int compareTo(Studente studente) {
		if (this.eta > studente.eta) {
			return 1;
		} else if (this.eta < studente.eta) {
			return -1;
		} else
			return 0;
	}

	@Override
	public String toString() {
		return "Lo studente " + nome + " nato il " + dateToString() + " ha " + eta + " anni ";
	}

}
