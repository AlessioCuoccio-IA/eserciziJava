package esercizi.switchExample;

public class Esercizio05 {

	public static void main(String[] args) {
		int mese = 3;
		
		switch (mese) {
		
		case 1:
			System.out.print("Inverno");
		case 2:
			System.out.print("Inverno");
		case 3:
			System.out.print("Inverno");
		case 4:
			System.out.println("Primavera ");
		break;
		
		case 5:
			System.out.println("Primavera ");
		case 6:
			System.out.println("Primavera ");
		break;
		
		case 7:
			System.out.println("Estate ");
		case 8:
			System.out.println("Estate ");
		case 9:
			System.out.println("Estate");
		break;
		
		case 10:
			System.out.println("Autunno ");
		case 11:
			System.out.println("Autunno ");
		case 12:
			System.out.println("Autunno");
		break;
		
		default:
			System.out.println("Valore errato");
		}

	}

}
