
public class UlohaVlakna3 implements Runnable {

	private Pocitadlo pocitadlo;
	
	public UlohaVlakna3(Pocitadlo pocitadlo) {
		this.pocitadlo = pocitadlo;
	}

	@Override
	public void run() {
		
		
		
		String menoVlakna = Thread.currentThread().getName();
		for (int i = 1; i <= 1000; i++) {
			synchronized(this) {
			System.out.println(menoVlakna +": "+ pocitadlo.getNext());}
			
		}
		
	}

	
	
}
