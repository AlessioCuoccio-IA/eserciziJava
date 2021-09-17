package esercizi.es56;



import java.util.ArrayList;

public interface AnagraficaDAO {

	public void insertAnagrafica(Anagrafica persona);

	public void rimuoviAnagrafica();

	public ArrayList<Anagrafica> getAnagrafica();

}
