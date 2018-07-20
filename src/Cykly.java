
public class Cykly {

	public static void main(String[] args) {
		//
		
		for(int i=1; i < 5; i*=2) {
			System.out.println("Ahoj");
		}

		
		//while ak podmienka neplati nevykona sa aspon raz
		int a=0;
		while(a<5) {
			System.out.println("Ahoj");
			a++;
		}
		
		
		//do while vykona sa aspon raz
		
		int b=0;
		do {
			System.out.println("Ahoj");
			b++;
		}while(b<5);
		
		//nekonecne while s breakom
		while(true) {
			System.out.println("Ahoj");
			b++;
			if(b==5)break;
		}
		
		//ukazka continue ked nechceme vypisat 6tku
		System.out.println("************");
		int x = 1;
		while(true) {
			System.out.println(x + ", ");
			x++;
			
			if(x==6) {
				x++;
				continue;
			}
			
			if(x==10) {
				break;
			}
		
		}
	}

}
