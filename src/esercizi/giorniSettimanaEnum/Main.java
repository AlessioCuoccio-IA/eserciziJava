package esercizi.giorniSettimanaEnum;


public class Main {
	
	public enum GiorniDellaSettimana {
		LUNEDI,
		MARTEDI,
		MERCOLEDI,
		GIOVEDI,
		VENERDI,
		SABATO,
		DOMENICA;
		
		public GiorniDellaSettimana next() {
			return values()[(ordinal()+1) % values().length];   
		}
	}
	
	 static GiorniDellaSettimana d = GiorniDellaSettimana.values()[0];
	
	
	public static void main(String[] args) {
		
		System.out.println("Oggi � "+d);
		System.out.println("Domani sar� "+d.next());
		System.out.println("Dopodomani sar� "+d.next().next());
	}

}
