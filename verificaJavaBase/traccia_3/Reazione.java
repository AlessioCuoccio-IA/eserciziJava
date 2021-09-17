package traccia_3;

public class Reazione {
	boolean like;

	public Reazione(boolean like) {
		this.like = like;
	}

	@Override
	public String toString() {
		return "like: " + like;
	}

}
