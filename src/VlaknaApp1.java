
public class VlaknaApp1 {

	public static void main(String[] args) {
		
		UlohaVlakna uloha = new UlohaVlakna();
		Thread vlakno = new Thread(uloha);
		vlakno.start();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main: " + i);
		}
		
		
	}

}
