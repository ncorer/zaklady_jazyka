
public class VlaknaApp3 {

	public static void main(String[] args) {
		
		Pocitadlo pocitadlo = new Pocitadlo();
		
		
		UlohaVlakna3 uloha = new UlohaVlakna3(pocitadlo);
		Thread vlakno1 = new Thread(uloha);
		vlakno1.setName("prve");
		vlakno1.start();
		Thread vlakno2 = new Thread(uloha);
		vlakno2.setName("druhe");
		vlakno2.start();
		System.out.println("Cakam na smrt");

		
	}

}
