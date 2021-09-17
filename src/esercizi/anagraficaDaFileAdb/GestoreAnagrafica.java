package esercizi.anagraficaDaFileAdb;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GestoreAnagrafica {

	static ArrayList<Anagrafica> anagrafiche = new ArrayList<>();
	public static Integer contatore = 0;

	public static void insertAnagrafica(Anagrafica persona) {
		anagrafiche.add(persona);
		contatore = anagrafiche.size();
	}

	public static void creaAnagrafica(ArrayList<String> stringhe, ConnectionManager connessione) {
		for (String s : stringhe) {
			String[] persone = s.split(";");
			String nome = persone[0];
			String cognome = persone[1];
			String citta = persone[2];
			String data = persone[3];

			try (Connection c1 = connessione.getConnection(); Statement stmt = c1.createStatement()) {
				int righe = stmt.executeUpdate(
						"insert into anagrafica (nome, cognome, citta_di_nascita, data_di_nascita) values('" + nome
								+ "','" + cognome + "','" + citta + "','" + data + "')");

				System.out.println(righe);

			} catch (SQLException e) {
				try (Connection c1 = connessione.getConnection(); Statement stmt = c1.createStatement()) {
					int righe = stmt
							.executeUpdate("UPDATE anagrafica set citta_di_nascita='" + citta + "', data_di_nascita='"
									+ data + "' WHERE nome='" + nome + "'and cognome='" + cognome + "'");
				} catch (SQLException e1) {
					System.out.println("UPDATE anagrafica set citta_di_nascita='" + citta + "', data_di_nascita='"
							+ data + "' WHERE nome='" + nome + "'and cognome='" + cognome + "'");
					e1.printStackTrace();

				}

			}
//			Anagrafica p = new Anagrafica(persone[0], persone[1], persone[2], persone[3]);
//			insertAnagrafica(p);
		}

	}

	public static void mostraAnagrafica() {
		for (Anagrafica p : anagrafiche) {
			System.out.println(p);
		}
	}
}
