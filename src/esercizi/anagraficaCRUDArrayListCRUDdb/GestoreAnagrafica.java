package esercizi.anagraficaCRUDArrayListCRUDdb;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class GestoreAnagrafica {

	static ArrayList<Anagrafica> anagrafiche = new ArrayList<>();
	public static Integer contatore = 0;
	static String filePropertiesPostgres = "postgres.properties";
	String filePropertiesMySql = "mysql.properties";

	public static void insertAnagrafica(Anagrafica persona) {
		anagrafiche.add(persona);
		contatore = anagrafiche.size();
	}

	public static void creaAnagrafica(ArrayList<String> stringhe) {
		for (String s : stringhe) {
			String[] persone = s.split(";");
			String nome = persone[0];
			String cognome = persone[1];
			String citta = persone[2];
			String data = persone[3];
			ConnectionManager connessione = new ConnectionManager(filePropertiesPostgres);
			try (Connection c1 = connessione.getConnection(); Statement stmt = c1.createStatement()) {
				int righe = stmt.executeUpdate(
						"insert into anagrafica (nome, cognome, citta_di_nascita, data_di_nascita) values('" + nome
								+ "','" + cognome + "','" + citta + "','" + data + "')");

				System.out.println("Righe inserite: "+righe);

			} catch (SQLException e) {
				try (Connection c1 = connessione.getConnection(); Statement stmt = c1.createStatement()) {
					int righe = stmt.executeUpdate("UPDATE anagrafica set citta_di_nascita='" + citta + "', data_di_nascita='"
									+ data + "' WHERE nome='" + nome + "'and cognome='" + cognome + "'");
				System.out.println("Righe aggiornate: "+righe);
				} catch (SQLException e1) {
					System.out.println("UPDATE anagrafica set citta_di_nascita='" + citta + "', data_di_nascita='"
							+ data + "' WHERE nome='" + nome + "'and cognome='" + cognome + "'");
					e1.printStackTrace();

				}

			}

		}

	}

	public static void rimuoviAnagrafica() {
		System.out.println("Inserisci la data");
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();
		ConnectionManager connessione = new ConnectionManager(filePropertiesPostgres);
		try (Connection c1 = connessione.getConnection(); Statement stmt = c1.createStatement()) {
			int righe = stmt.executeUpdate("delete from anagrafica where data_di_nascita<'" + data + "'");
			System.out.println("Righe eliminate: "+righe);
			scan.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void mostraAnagrafica() {
		ConnectionManager connessione = new ConnectionManager(filePropertiesPostgres);
		try (Connection c1 = connessione.getConnection(); Statement stmt = c1.createStatement()){
			String query="select * from anagrafica";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				String id = rs.getString(1);
				String nome = rs.getString(2);
				String cognome = rs.getString(3);
				Date data = rs.getDate(4);
				System.out.println(id + " " + nome + " " + cognome + " " + data + "\n");}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
