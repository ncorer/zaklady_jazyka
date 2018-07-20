import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		
		String meno = "";
		int rokNarodenia = 0;
		
		
		Scanner vstup = new Scanner(System.in);
		
		System.out.println("Zadaj meno: ");
		meno = vstup.nextLine();
		
		
		System.out.println("Ahoj " + meno);

		System.out.println("Zadaj rok narodenia: ");
		rokNarodenia = vstup.nextInt();
		
		System.out.println("Mas " + (2018 - rokNarodenia) + " rokov.");
		
	}

}
