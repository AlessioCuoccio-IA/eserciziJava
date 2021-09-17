package esercizi.cicloDueIndici;


public class Esercizio08 {

	public static void main(String[] args) {
		
		int [] giorniMese = new int [30];
		
		int i;
		int j;
		
		for (i=0, j=1; i<giorniMese.length; i++, j++) {
			giorniMese[i]=j;
		}
		
		
		String [] giorniSettimana = {"lunedi", "martedi", "mercoled�", "gioved�", "venerd�", "sabato", "domenica"};

		int z;
		int a;
		
		for (z = 0, a=0; z<giorniMese.length; z++, a++) {
			
			if (a<7) {
				System.out.println(giorniMese[z]+" "+giorniSettimana[a]);
			}
			else {
				a=0;
				System.out.println(giorniMese[z]+" "+giorniSettimana[a]);
			}
			
				
				
			
		}
		
		
		
		
		
		
		
		
		
	}

}
