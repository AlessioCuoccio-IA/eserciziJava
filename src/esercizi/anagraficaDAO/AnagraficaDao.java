package esercizi.anagraficaDAO;

import java.util.List;

public interface AnagraficaDao {

	public void insertAnagrafica(Anagrafica anagrafica);
	
	public List<Anagrafica> getAnagrafiche();
}
