package esercizi.anagraficaArrayList;

import java.util.ArrayList;

public class Gestore {
	
ArrayList<Persona> anagrafiche = new ArrayList<>();
public static Integer contatore=1;

public void insertAnagrafica(Persona persona) {
	anagrafiche.add(persona);
}

}
