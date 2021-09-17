package esercizi.anagraficaDAO;

import java.util.ArrayList;
import java.util.List;

public class AnagraficaDaoImplAL implements AnagraficaDao{
	
	private static AnagraficaDaoImplAL instance = null;
	
	private AnagraficaDaoImplAL() {};
	
	public static AnagraficaDaoImplAL getInstance() {
		if (instance == null) {
			instance = new AnagraficaDaoImplAL();}
		
		return instance;
		}
		
	
	
	ArrayList<Anagrafica> anagrafiche = new ArrayList<Anagrafica>();
	@Override
	public void insertAnagrafica(Anagrafica anagrafica) {
		anagrafiche.add(anagrafica);
	}
	@Override
	public List<Anagrafica> getAnagrafiche() {
		return anagrafiche;
	}
}
