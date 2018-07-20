
public class DatoveTypy {

	public static void main(String[] args) {

		//deklaracia premennej
		int cislo;
		
		cislo = 584;
		
		byte bb = 127;
		
		long ll = 7978645531l;
		
		int hex = 0xff;
		int oct = 0123;
		int bin = 0b10000000;
		//0b na zaciatku je povinne
		
		int usa = 1_258_251;
		//nesposobi chybu, casto uvadzane ako chytak, od java 8
		
		char zavinac = '@';
		char zavinac2 = 64;
		//moze pouzit cislo a to je odkaz na dany kod v ascii tabulke
		char zavinac3 = '\u0065';
		//ked chceme pouzit unicode tak pouzijeme backlash u, v apostrofoch, toto je napriklad male E
		
		System.out.println(zavinac3);
		
		String meno = "Fero";
		
		short cast = (short)cislo;
		//premena na 
		
		char znak = 49;
		byte cslo = (byte)znak;
		//pri konverzii vezme literarnu hodnotu 49, nie znak z ascii tabulky
		
		System.out.println(znak);
		System.out.println(cslo);
	}

}
