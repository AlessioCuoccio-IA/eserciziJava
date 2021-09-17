package esercizi.anagraficaCRUDdbParametriche;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dataParsed = LocalDate.parse(data, formato);
			ConnectionManager connessione = new ConnectionManager(filePropertiesPostgres);
			String insert = "insert into anagrafica (nome, cognome, citta_di_nascita, data_di_nascita) values(?, ?, ?, ?)";
			String update = "UPDATE anagrafica set citta_di_nascita= ?, data_di_nascita= ? WHERE nome= ? and cognome= ? ";
			try (Connection c1 = connessione.getConnection(); PreparedStatement stmt = c1.prepareStatement(insert)) {
				stmt.setString(1, nome);
				stmt.setString(2, cognome);
				stmt.setString(3, citta);
				stmt.setDate(4, Date.valueOf(dataParsed));
				int righe = stmt.executeUpdate();
				System.out.println("Righe inserite: " + righe);

			} catch (SQLException e) {

				try (Connection c1 = connessione.getConnection();
						PreparedStatement stmt = c1.prepareStatement(update)) {
					stmt.setString(1, nome);
					stmt.setString(2, cognome);
					stmt.setString(3, citta);
					stmt.setDate(4, Date.valueOf(dataParsed));
					int righe = stmt.executeUpdate();
					System.out.println("Righe aggiornate: " + righe);
				} catch (SQLException e1) {

				}

			}

		}

	}

	public static void rimuoviAnagrafica() {
		System.out.println("Inserisci la data");
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataParsed = LocalDate.parse(data, formato);
		ConnectionManager connessione = new ConnectionManager(filePropertiesPostgres);
		String delete = "delete from anagrafica where data_di_nascita<?";
		try (Connection c1 = connessione.getConnection(); PreparedStatement stmt = c1.prepareStatement(delete)) {
			stmt.setDate(1, Date.valueOf(dataParsed));
			int righe = stmt.executeUpdate();
			System.out.println("Righe cancellate: " + righe);
			scan.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void mostraAnagrafica() {
		ConnectionManager connessione = new ConnectionManager(filePropertiesPostgres);
		try (Connection c1 = connessione.getConnection(); Statement stmt = c1.createStatement()) {
			String query = "select * from anagrafica";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				String id = rs.getString(1);
				String nome = rs.getString(2);
				String cognome = rs.getString(3);
				Date data = rs.getDate(4);
				System.out.println(id + " " + nome + " " + cognome + " " + data + "\n");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
