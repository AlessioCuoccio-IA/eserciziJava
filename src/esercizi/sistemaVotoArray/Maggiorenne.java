package esercizi.sistemaVotoArray;


public class Maggiorenne {
	
	
	public String nome;
	public TesseraElettorale t;
	public static int n_elettori = 0;
	public static int n_votanti = 0;

	public Maggiorenne(String nome)
	{
		this.nome = nome;
		t = new TesseraElettorale();
		n_elettori++;
	}
	
	public void vota()
	{
		t.timbrodivoto = true;
		n_votanti++;
	}
	
	public void ha_votato()
	{
		if (t.timbrodivoto == true)
		{
			System.out.println(nome + " ha votato");
		}
		else
		{
			System.out.println(nome + " non ha votato");
		}
	}
	
	
}
