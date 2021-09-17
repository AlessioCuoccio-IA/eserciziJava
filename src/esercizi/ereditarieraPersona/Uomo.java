package esercizi.ereditarieraPersona;

import java.time.LocalDate;
import java.time.Period;

public class Uomo extends Persona {
	String nome;
	LocalDate dataDiNascita;
	int eta;

	public Uomo(String nome, LocalDate dataDiNascita) {
		super(nome, dataDiNascita);
		this.nome = nome;
		this.dataDiNascita = dataDiNascita;
		this.eta = Period.between(dataDiNascita, LocalDate.now()).getYears();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Quanti anni ha " + nome + "? " + eta;
	}

}
