
public class Vetvenie {

	public static void main(String[] args) {
		int a = 10;
		
		
		//neuplny podmieneny vyraz
		if(a > 0) {
			System.out.println("a je kladne");
		}
		
		//uplny podmieneny vyraz
		if(a % 2 == 0) {
			System.out.println("a je parne");
		}
		else {
				System.out.println("A je neparne");
			}
		
		//ternarny zapis
		
		boolean prsi = false;
		
		String topanky = (prsi) ? "nepremokave" : "tenisky";
		
		
		//zlozitejsi zapis
		
		int skore = 78;
		String znamka;
		if(skore >=90) {
			znamka = "1";
		}else if(skore >=80) {
			znamka = "2";
		}else if (skore >=70) {
			znamka = "3";
		}else if (skore >=60) {
			znamka = "4";
		}else {
			znamka = "5";
		}
		
		
		System.out.println("Program pokracuje dalej...");

		int den =4;
		if(den ==1) {
			System.out.println("Pondelok");
		}
		
		switch(den) {
		case 1:
			System.out.println("Pondelok");
			break;
		case 2:
			System.out.println("Utorok");
			break;
		case 3:
			System.out.println("streda");
			break;
		case 4:
			System.out.println("stvrtok");
			break;
		case 5:
			System.out.println("Piatok");
			break;
		default:
			System.out.println("Takyto den nejestvuje");
		}
		
		
		
		
	}

}
