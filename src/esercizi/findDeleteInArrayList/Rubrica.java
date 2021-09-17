package esercizi.findDeleteInArrayList;


import java.util.ArrayList;

public class Rubrica 
{
	
	private static ArrayList<Contatto> contatti2 = new ArrayList<Contatto>();
	private static int numerocontattiinseriti = 0;
	
	public Rubrica()
	{
		
	}

	public static void aggiungicontatto(Contatto c)
	{
		contatti2.add(c);
		numerocontattiinseriti++;
	}
	@Override
	public String toString() 
	{
		String s = "Rubrica\n";
		s += "----------------\n";
		for (Contatto contatto : contatti2)
		{
			//System.out.println(contatto);
			s += contatto + "\n";
		}
		return s;
	}

	public void rimuovicontatto(String nome, String cognome) 
	{
		for (Contatto c : contatti2)
		{
			
			if (c.nome.equals(nome) && c.cognome.equals(cognome))
			{	
				contatti2.remove(c);
				System.out.println("Contatto eliminato");
			}
				
			}
		
	}
	
	public void cerca_numero(String nome, String cognome)
	{
		for (Contatto c : contatti2)
		{
			
			if (c.nome.equals(nome) && c.cognome.equals(cognome))
			{
				System.out.println("Contatto trovato \n" + c.numero);
				break;
			}
			
			
		}
		
	}
	
}
