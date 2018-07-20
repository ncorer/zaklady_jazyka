
public class UlohaVlakna2 implements Runnable {

	@Override
	public void run() {
		String menoVlakna = Thread.currentThread().getName();
		for (int i = 1; i <= 10; i++) {
			System.out.println(menoVlakna +": "+ i);
			
		}
		
	}

	
	
}
