package traccia4;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudenteDAOimpl implements StudenteDAO {

	static String filePropertiesPostgres = "postgres.properties";

	@Override
	public void insertAnagrafica(Studente studente) {
		ConnectionManager connessione = new ConnectionManager(filePropertiesPostgres);
		String insert = "insert into studenti (nome, data_di_nascita) values(?, ?)";
		String update = "UPDATE studenti set nome= ?, data_di_nascita= ? WHERE nome= ? and data_di_nascita= ? ";
		try (Connection c1 = connessione.getConnection(); PreparedStatement stmt = c1.prepareStatement(insert)) {
			stmt.setString(1, studente.nome);
			stmt.setDate(2, Date.valueOf(studente.dataNascita));
			int righe = stmt.executeUpdate();
			System.out.println("Righe inserite: " + righe);

		} catch (SQLException e) {
			e.getStackTrace();
			try (Connection c1 = connessione.getConnection(); PreparedStatement stmt = c1.prepareStatement(update)) {
				stmt.setString(1, studente.nome);
				stmt.setDate(4, Date.valueOf(studente.dataNascita));
				int righe = stmt.executeUpdate();
				System.out.println("Righe aggiornate: " + righe);
			} catch (SQLException e1) {

			}

		}

	}

	@Override
	public ArrayList<Studente> getStudente() {
		ArrayList<Studente> studenti = new ArrayList<>();
		ConnectionManager connessione = new ConnectionManager(filePropertiesPostgres);
		try (Connection c1 = connessione.getConnection(); Statement stmt = c1.createStatement()) {
			String query = "select * from studenti";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				Studente studente = new Studente(rs.getString(2), rs.getDate(3).toLocalDate());
				studenti.add(studente);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return studenti;

	}
}
