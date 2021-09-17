package traccia4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Traccia4 {

	static StudenteDAOimpl gestore = new StudenteDAOimpl();
	static ArrayList<Studente> studentiDaOrdinare = gestore.getStudente();

	public static void menu() throws IOException {

		String messaggio = "MENU" + "\n" + "(I) Inserisci studente" + "\n" + "(L) Lista studenti" + "\n"
				+ "(D) Ordina per data di nascita" + "\n" + "(C) Ordina per giorno del compleanno" + "\n" + "(E) Esci"
				+ "\n" + "Scegli l'operazione da fare:";

		String opzione = JOptionPane.showInputDialog(messaggio);

		if (opzione.equalsIgnoreCase("I")) {
			inserisciStudente();
		} else if (opzione.equalsIgnoreCase("L")) {
			listaStudenti();
		} else if (opzione.equalsIgnoreCase("E")) {
			JOptionPane.showMessageDialog(null, "Il programma è stato chiuso");

			System.exit(0);
		} else if (opzione.equalsIgnoreCase("D")) {
			ordinaPerAnnoNascita();
		} else if (opzione.equalsIgnoreCase("C")) {
			ordinaPerCompleanno();
		} else {
			JOptionPane.showMessageDialog(null, "Attenzione! Hai scelto un valore sbagliato, riprova", "ERRORE",
					JOptionPane.ERROR_MESSAGE);

			menu();
		}

	}

	private static void ordinaPerCompleanno() {
		studentiDaOrdinare.sort(new ComparatoreDataCompleanno());

		for (Studente s : studentiDaOrdinare) {
			System.out.println("Lo studente " + s.nome + " compie gli anni il " + s.dataNascita.getDayOfMonth() + " "
					+ s.dataNascita.getMonth());
		}

	}

	public static void listaStudenti() throws IOException {
		for (Studente s : gestore.getStudente()) {
			System.out.println(s);
		}
		JOptionPane.showMessageDialog(null, "Cosa vuoi fare adesso?");

		menu();

	}

	public static void inserisciStudente() throws IOException {

		String nome = JOptionPane.showInputDialog("Inserisci nome:");

		String dataNascita = JOptionPane.showInputDialog("Inserisci data di nascita nel formato gg/mm/yyyy:");

		gestore.insertAnagrafica(new Studente(nome, dataNascita));
		JOptionPane.showMessageDialog(null, "Cosa vuoi fare adesso?");

		menu();

	}

	public static void ordinaPerAnnoNascita() throws IOException {
		Collections.sort(studentiDaOrdinare);

		for (Studente s : studentiDaOrdinare) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {

		try {
			menu();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}