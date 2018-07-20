
public class Operatory {

	public static void main(String[] args) {
// aritmeticke operacie
		
		System.out.println(10 + 5);
		System.out.println(10 * 5);
		System.out.println(10 / 5);
		System.out.println(10 % 3);

		
		//relacne operatory
		
		System.out.println(10 < 5);
		System.out.println(10 > 5);
		System.out.println(10 <= 5);
		System.out.println(10 >= 5);
		System.out.println(10 == 5);
		System.out.println(10 != 5);
		
		//logicke operatory
		
		System.out.println((10 < 5) & (10 == 5));
		System.out.println((10 < 5) | (10 !=5));
		
		int a = 10;
		int b = a + 10;
		
		b = b + 10;
		b += 10;
		
		b +=1; // b = b + 1
		b++; // najprv sa priradi potoms a inkrementuje
		++b; // najprv sa inkrementuje potom sa priradi
		
b = 0;
int c = 0;

System.out.println((b == 0) || (c++ > 0));
System.out.println((b == 0) && (c > 0));


int DPHCKO = 52;

DPHCKO = 48;
		
	}

}
