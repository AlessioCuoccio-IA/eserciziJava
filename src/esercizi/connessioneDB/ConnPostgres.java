package esercizi.connessioneDB;


import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnPostgres {

	public static void main(String[] args) {
		String fileProperties = "postgres.properties";

//		String url="jdbc:postgresql://localhost:5432/postgres";
//		String user="postgres";
//		String password="135790";

		Properties props = new Properties();
//		props.setProperty("user", user);
//		props.setProperty("password", password);

		try (FileReader dbPropFile = new FileReader(fileProperties)) {
			props.load(dbPropFile);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String query = "select * from anagrafica;";
		String insert = "insert into anagrafica (nome, cognome) values ('Alessio', 'Cuoccio')";
		Statement stmt = null;
		ResultSet rs = null;

		try (Connection conn2 = DriverManager.getConnection(props.getProperty("url"), props);
				Statement stmt2 = conn2.createStatement()){
			int righe = stmt2.executeUpdate(insert);
			System.out.println(righe);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (Connection conn = DriverManager.getConnection(props.getProperty("url"), props)) {
			System.out.println("Connessione avvenuta con successo");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				String id = rs.getString(1);
				String nome = rs.getString(2);
				String cognome = rs.getString(3);
				Date data = rs.getDate(4);
				System.out.println(id + "\n" + nome + "\n" + cognome + "\n" + data);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
