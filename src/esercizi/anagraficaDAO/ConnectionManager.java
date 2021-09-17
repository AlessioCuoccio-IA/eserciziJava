package esercizi.anagraficaDAO;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	
	private Properties dbProperties;
	
	public ConnectionManager(String fileProperties) {
		try (FileReader dbPropFile = new FileReader(fileProperties);) {
			dbProperties = new Properties();
			dbProperties.load(dbPropFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
    public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(dbProperties.getProperty("url"), dbProperties);
    }
	
	
}