package esercizi.anagraficaDAO;

public class MainAL {

	public static void main(String[] args) {
		AnagraficaDaoImplAL gestoreAnagrafiche = AnagraficaDaoImplAL.getInstance();
		GestoreLogica gestoreLogicaBusiness = new GestoreLogica(gestoreAnagrafiche);
		gestoreLogicaBusiness.init();

	}

}
