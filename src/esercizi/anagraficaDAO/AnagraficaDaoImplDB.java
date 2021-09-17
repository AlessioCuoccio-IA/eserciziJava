package esercizi.anagraficaDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class AnagraficaDaoImplDB implements AnagraficaDao{
	
	ConnectionManager connectionManager;
	
	private static AnagraficaDaoImplDB instance = null;
	
	private AnagraficaDaoImplDB(String fileConf) {
		this.connectionManager = new ConnectionManager(fileConf);
	}
	
	public static AnagraficaDaoImplDB getInstance(String fileConf) {
		if (instance == null) {
		 instance = new AnagraficaDaoImplDB(fileConf);}
		return instance;
	}
	
	

	private Connection getConnection() throws SQLException {
		return connectionManager.getConnection();
	}
	
	@Override
	public void insertAnagrafica(Anagrafica anagrafica) {
		String sql_insert = "INSERT INTO anagrafica "
				+ "(nome, cognome, data_di_nascita, citta_di_nascita) "
				+ "VALUES(?, ?, ?, ?)";

		try (PreparedStatement stmt = getConnection().prepareStatement(sql_insert)){
   				
			    stmt.setString(1, anagrafica.getNome());
			    stmt.setString(2, anagrafica.getCognome());
			    stmt.setDate(3, Date.valueOf(anagrafica.getDataDiNascita()));
			    stmt.setString(4, anagrafica.getCitta());
			    stmt.executeUpdate();
		
		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
			updateAnagrafica(anagrafica);
        }
	}

	public String updateAnagrafica(Anagrafica anagrafica) {
		String messaggio="Eseguito l'update dell'anagrafica di " + anagrafica.getNome() + " " + anagrafica.getCognome();
		String sql_insert = "UPDATE anagrafica "
				+ "SET  data_di_nascita=?, citta_di_nascita=? "
				+ "WHERE nome=? AND cognome=?";

		try (PreparedStatement stmt = getConnection().prepareStatement(sql_insert)){
   				
				stmt.setDate(1, Date.valueOf(anagrafica.getDataDiNascita()));
		    	stmt.setString(2, anagrafica.getCitta());
			    stmt.setString(3, anagrafica.getNome());
			    stmt.setString(4, anagrafica.getCognome());
			    stmt.executeUpdate();
			    
		} catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
		return messaggio;
	}
	
	@Override
	public List<Anagrafica> getAnagrafiche() {
		List<Anagrafica> anagrafiche=new ArrayList<Anagrafica>();
		String sql_insert = "SELECT id, nome, cognome, data_di_nascita, citta_di_nascita "
				+ "FROM anagrafica;";

		try (PreparedStatement stmt = getConnection().prepareStatement(sql_insert);
				ResultSet rs = stmt.executeQuery()){
   				
			while (rs.next()) {
				Integer id = rs.getInt("id");
				String nome = rs.getString("nome") ;
				String cognome = rs.getString("cognome");
				String citta = rs.getString("citta_di_nascita");
				LocalDate data = rs.getDate("data_di_nascita").toLocalDate();
				anagrafiche.add(new Anagrafica(id,nome, cognome, citta, data));
			}
			
		} catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
		return anagrafiche;
	}
}
