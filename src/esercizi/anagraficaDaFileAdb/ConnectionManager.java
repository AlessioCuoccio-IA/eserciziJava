package esercizi.anagraficaDaFileAdb;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	String fileProperties;
	Properties props;

	public ConnectionManager(String fileProperties) {

		try (FileReader dbPropFile = new FileReader(fileProperties)) {
			props = new Properties();
			props.load(dbPropFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Connection getConnection() throws SQLException {

		return DriverManager.getConnection(props.getProperty("url"), props);
	}

}
