package esercizi.eccezioni;

public class Divisione {

	public static void dividi(Integer a, Integer b) throws ArithmeticException {
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		Integer dividendo = (int) (Math.random() * 3);
		Integer divisore = (int) (Math.random() * 3);

		try {
			Divisione.dividi(dividendo, divisore);
		} catch (ArithmeticException a) {
			System.out.println("Attenzione divisione per " + divisore);
			return;
		} finally {
			System.out.println("FINE");
		}

		System.out.println("Il numero non � stato diviso per 0");
	}

}
