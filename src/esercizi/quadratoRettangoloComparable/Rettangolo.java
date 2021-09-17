package esercizi.quadratoRettangoloComparable;

public class Rettangolo implements Comparable<Rettangolo> {
	int base;
	int altezza;

	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public int Area() {
		return altezza * base;
	}

	public int Perimetro() {
		return (base + altezza) * 2;
	}

	@Override
	public String toString() {
		return base + " e " + altezza;
	}

	@Override
	public int compareTo(Rettangolo r) {

		if (Area() > r.Area()) {
			return 1;
		} else if (Area() < r.Area()) {
			return -1;
		} else
			return 0;
	}

}
