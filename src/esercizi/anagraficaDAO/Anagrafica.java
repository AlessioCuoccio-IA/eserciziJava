package esercizi.anagraficaDAO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Anagrafica implements Comparable<Anagrafica>{

	private Integer id;
	private String nome; 
	private String cognome;
	private String citta;
	private LocalDate dataDiNascita;

	public Anagrafica(Integer id, String nome, String cognome, String citta, LocalDate dataDiNascita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.citta = citta;
		this.dataDiNascita = dataDiNascita;
		this.id = id;
	}
	
	public Anagrafica(String nome, String cognome, String citta, String dataDiNascita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.citta = citta;
		setDataDiNascitaFormatted(dataDiNascita);
	}
	
	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}
	
	public String getDataDiNascitaFormatted() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return getDataDiNascita().format(formatter);
	}

	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
	
	public void setDataDiNascitaFormatted(String dataDiNascita) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.dataDiNascita = LocalDate.parse(dataDiNascita, formatter);
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int compareTo(Anagrafica a) {
		return this.cognome.compareTo(a.getCognome());
	}
	
	@Override
	public String toString() {
		return "[" + this.nome + "|" + this.cognome + "|" + this.citta + "|" + getDataDiNascitaFormatted() + "]";
	}
	
}
