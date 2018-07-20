
public class Metody {

	public static void main(String[] args) {
		
		System.out.println("Vitaj v programe Metoda");
		vlozCiaru();
		vlozCiaru("-----------**********-----------");
		
		int a = 10;
		int b= 20;
		vymen(a,b);
		System.out.println("a = "+ a + " b = " + b);
		
		vlozCiaru(50, "+");
		
		System.out.println(suma(58,45));

		
		int[] ppp = vytvorPole(100);
		System.out.println(ppp[ppp.length-1]);
		
	}
	
	static void vymen(int a, int b) {
		int temp = a ;
		a = b;
		b = temp;
		
		System.out.println("V metode a = " + a + " b = " + b);
		
		
	}

	static void vlozCiaru() {
		System.out.println("-------------------");
		System.out.println("-------------------");
	}
	
	static void vlozCiaru(String ciara) {
		System.out.println(ciara);
		System.out.println(ciara);
		System.out.println(ciara);
	}
	
	static void vlozCiaru(int pocetZnakov, String znak) {
		for(int i = 0;i<pocetZnakov;i++) {
			System.out.print(znak);
		}
		System.out.println();
	}
	
	static int suma(int a, int b) {
		 int c = a + b;
		 return c;
				
	}

	static int sucin(int...cisla) {
		int suc = 1;
		for(int i = 0; i<cisla.length; i++) {
			suc *= cisla[i];
		}
		return suc;
	}
	
	static int[] vytvorPole(int hornaHranica) {
		int[] pp = new int[hornaHranica];
		for(int i=0; i<hornaHranica;i++) {
			pp[i]=i;
		}
		return pp;
	}
	
}
