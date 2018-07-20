
public class Pole {

	public static void main(String[] args) {
int[] vyska;   //deklaracia
vyska = new int[7]; //inicializacia

int[] sirka = new int[6]; //deklaracia a inicializacia v jednom

int hmotnost[] = new int[5]; //druhy spolsob

vyska[0] = 186;
vyska[1] = 186;
vyska[2] = 184;
vyska[3] = 175;
vyska[4] = 178;
vyska[5] = 163;
vyska[6] = 210;

System.out.println("Vyska ucastnika : " + vyska[2]);


String[] mena = {"Lukas","Roman", "Matus","Benji","Richard", "Renata","Fero"};

for(int i = 0; i<mena.length;i++) {
	System.out.println("Ucastnik " + mena[i] + " meria " + vyska[i] + " cm. ");
}

//for each cyklus

for(int s: vyska ) {
	System.out.println(s);}


// zistenie priemernej vysky
int suma =0;

for(int i = 0; i<mena.length;i++) {
	
	suma+=vyska[i];	
}

double priemerVyska =0;
priemerVyska = (double)suma / vyska.length;

System.out.println("Priemerna vyska je " + priemerVyska + " cm");

//zistenie najvyssieho clena
int max = vyska[0];
String meno = mena[0];
for(int i = 1; i<vyska.length;i++) {
	if(vyska[i]> max) {
		max = vyska[i];
		meno = mena[i];
	}
}
System.out.println("Najvyssi ucastnik je " + meno + " meria " + max + " cm.");

	}

}
