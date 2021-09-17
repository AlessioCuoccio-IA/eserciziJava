package esercizi.es56;

import java.io.IOException;

import javax.swing.JOptionPane;

public class MenuDB {

	static AnagraficaDAOimplDB implDB = new AnagraficaDAOimplDB();

	public static void menu() throws IOException {

		String messaggio = "MENU" + "\n" + "(I) Inserisci anagrafica" + "\n" + "(L) Lista anagrafiche" + "\n"
				+ "(E) Esci" + "\n" + "Scegli l'operazione da fare:";

		String opzione = JOptionPane.showInputDialog(messaggio);

		if (opzione.equalsIgnoreCase("I")) {
			inserisciAnagrafica();
		} else if (opzione.equalsIgnoreCase("L")) {
			listaAnagrafiche();
		} else if (opzione.equalsIgnoreCase("E")) {
			JOptionPane.showMessageDialog(null, "Il programma è stato chiuso");

			System.exit(0);
		} else {
			JOptionPane.showMessageDialog(null, "Attenzione! Hai scelto un valore sbagliato, riprova", "ERRORE",
					JOptionPane.ERROR_MESSAGE);

			menu();
		}

	}

	private static void listaAnagrafiche() throws IOException {
		for (Anagrafica a : implDB.getAnagrafica()) {
			System.out.println(a);
		}
		JOptionPane.showMessageDialog(null, "Cosa vuoi fare adesso?");

		menu();

	}

	private static void inserisciAnagrafica() throws IOException {

		String nome = JOptionPane.showInputDialog("Inserisci nome:");

		String cognome = JOptionPane.showInputDialog("Inserisci cognome:");

		String citta = JOptionPane.showInputDialog("Inserisci città di nascita:");

		String dataNascita = JOptionPane.showInputDialog("Inserisci data di nascita nel formato gg/mm/yyyy:");
		implDB.insertAnagrafica(new Anagrafica(nome, cognome, citta, dataNascita));
		JOptionPane.showMessageDialog(null, "Cosa vuoi fare adesso?");

		menu();

	}

	public static void main(String[] args) {

		try {
			menu();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
