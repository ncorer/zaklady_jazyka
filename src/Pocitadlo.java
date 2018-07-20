
public class Pocitadlo {

	private int pocet = 0;

	public int getNext() {
		synchronized (this) {
			
			return ++pocet;
		}
	}

}
