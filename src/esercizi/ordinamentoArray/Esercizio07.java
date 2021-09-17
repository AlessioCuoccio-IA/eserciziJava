package esercizi.ordinamentoArray;
//
import java.util.Arrays;

public class Esercizio07 {

	public static void main(String[] args) {
		
		int [] numeri = {3, 7, 9, 8, 5, 1, 6, 2, 4, 10};
		
		int massimo = numeri[0];

		for(int i=0; i<=numeri.length-1; i++) {
		      if( numeri[i]>massimo ) {
		        massimo=numeri[i];
		      }
		    }
		
		System.out.println("Il massimo e' "+massimo);
		System.out.println("");
		System.out.println("");
				
		Arrays.sort(numeri);
		
		for(int i=0;i<numeri.length;i++)
        {
            System.out.println(numeri[i]);
        }
		
		System.out.println("");
		System.out.println("");
		
		int [] numeri2 = new int[10];
		
		int i;
		int j;
		
		for(i=0,j=numeri.length-1; j>=0; i++, j--)
        {
			numeri2[i] = numeri[j];
			System.out.println(numeri2[i]);
            
        }
				
	}

}
