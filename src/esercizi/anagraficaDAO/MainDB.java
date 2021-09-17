package esercizi.anagraficaDAO;

public class MainDB {
	
	public static void main(String[] args) {
		
		AnagraficaDaoImplDB gestoreAnagrafiche = AnagraficaDaoImplDB.getInstance("postgreSQL.properties");
		GestoreLogica gestoreLogicaBusiness = new GestoreLogica(gestoreAnagrafiche);
		gestoreLogicaBusiness.init();
		
		

	}
	
	
}
