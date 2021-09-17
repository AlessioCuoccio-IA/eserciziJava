package esercizi.anagraficaDB;




import java.sql.Connection;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {

//		File file = new File("C:\\Users\\Alessio Cuoccio\\Desktop\\prova\\prova.csv");
//
//		ArrayList<String> stringhe = GestoreFile.leggiFile(file);
//		GestoreAnagrafica.creaAnagrafica(stringhe);
//
//		GestoreAnagrafica.mostraAnagrafica();

		String filePropertiesPostgres = "postgres.properties";
		String filePropertiesMySql = "mysql.properties";

		ConnectionManager connessione1 = new ConnectionManager(filePropertiesPostgres);
		ConnectionManager connessione2 = new ConnectionManager(filePropertiesMySql);

		try {
			Connection c1 = connessione1.getConnection();
			System.out.println("Connessione al DBMS PostgreSQL avvenuta con successo");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Connection c2 = connessione2.getConnection();
			System.out.println("Connessione al DBMS MySql avvenuta con successo");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
