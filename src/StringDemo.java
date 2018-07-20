
public class StringDemo {

	public static void main(String[] args) {

		String meno = "Lukas";
		String meno2 = new String("Lukasa");

		System.out.println(meno.equalsIgnoreCase(meno2));

		char[] m = { 'L', 'U', 'K', 'A', 'S' };

		String meno3 = new String(m);
		System.out.println(meno3);

		System.out.println("Pocet znakov meno: " + meno.length());
		System.out.println("Znak na pozicii 3 v mene " + meno.charAt(2));
		System.out.println("Pozicia u v mene: " + (meno.indexOf('a')+1));
		System.out.println(meno.toUpperCase());
		System.out.println(meno.toLowerCase());
		System.out.println(meno.toLowerCase().equals(meno3.toLowerCase()));
		
		System.out.println(meno2.trim()); //odstrani prazdne znaky a entery
		
		System.out.println(meno.startsWith("Lu"));
		System.out.println(meno.endsWith("as"));
		
		String ret ="abeceda";
		System.out.println(ret.substring(3,6)); //vypise dany retazec od indexu az do konca, vratane indexu, koncovy index tam uz ale nepatri
		
		System.out.println(ret.replace('b', 'B')); //toto vsak nic nezmeni ak chceme zmenit tak 
		String ret2 = ret.replace('b', 'B');
		
		String jazyky = "Java#HTML#Perl#C";
		String[] pole = jazyky.split("#");
		for(String nieco:pole) {
			System.out.print(nieco + ", ");
			
		}
		
		System.out.println();
		System.out.println(jazyky.concat("Tralala"));
	
		
	}

}
