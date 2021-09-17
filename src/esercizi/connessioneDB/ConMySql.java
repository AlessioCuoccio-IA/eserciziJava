package esercizi.connessioneDB;


import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConMySql {

	public static void main(String[] args) {
		String fileProperties = "mysql.properties";

		Properties props = new Properties();

		try (FileReader dbPropFile = new FileReader(fileProperties)) {
			props.load(dbPropFile);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String query = "select * from db_anagrafiche.anagrafica;";
		Statement stmt = null;
		ResultSet rs = null;

		try (Connection conn = DriverManager.getConnection(props.getProperty("url"), props)) {
			System.out.println("Connessione avvenuta con successo");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				String id = rs.getString(1);
				String nome = rs.getString(2);
				String cognome = rs.getString(3);
				String data = rs.getString(4);
				System.out.println(id + "\n" + nome + "\n" + cognome + "\n" + data);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
