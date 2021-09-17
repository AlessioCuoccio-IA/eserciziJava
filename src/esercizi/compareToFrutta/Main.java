package esercizi.compareToFrutta;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Mela mela = new Mela("Mela", 5.00);
		Pesca pesca = new Pesca("Pesca", 3.50);
		Banana banana = new Banana("Banana", 7.80);
		
		ArrayList<Frutto> frutti = new ArrayList<>();
		
		frutti.add(banana);
		frutti.add(pesca);
		frutti.add(mela);
		
		for(Frutto f : frutti) {
			System.out.println(f);
		}
		
		Collections.sort(frutti);
		
		System.out.println("-------");
		for(Frutto f : frutti) {
			System.out.println(f);
		}
	}

}
