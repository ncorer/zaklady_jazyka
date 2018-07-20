
public class VlaknaApp2 {

	public static void main(String[] args) {
		
		UlohaVlakna2 uloha = new UlohaVlakna2();
		Thread vlakno1 = new Thread(uloha);
		vlakno1.setName("prve");
		vlakno1.start();
		Thread vlakno2 = new Thread(uloha);
		vlakno2.setName("druhe");
		vlakno2.start();
		System.out.println("Cakam na smrt");

		
	}

}
