package esercizi.anagraficaDB;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Anagrafica {
	Integer id;
	String nome;
	String cognome;
	String citta;
	LocalDate dataNascita;

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Anagrafica(String nome, String cognome, String citta, String dataNascita) {
		this.id = GestoreAnagrafica.contatore++;
		this.nome = nome;
		this.cognome = cognome;
		this.citta = citta;
		this.dataNascita = stringToDate(dataNascita);
	}

	public LocalDate stringToDate(String date) {
		LocalDate data = LocalDate.parse(date, formatter);
		return data;
	}

	public String dateToString() {
		String dataString = dataNascita.format(formatter);
		return dataString;
	}

	@Override
	public String toString() {
		return "|" + id + "|" + nome + "|" + cognome + "|" + citta + "|" + dateToString() + "|";
	}

}
