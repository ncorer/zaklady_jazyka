import java.util.Arrays;

public class WrapperParsingDemo {

	public static void main(String[] args) {
	
		int a = 10;
		
		//int - Integer
		//double - Double
		//short - Short
		//char - Character
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		String c1 = "123";
		String c2 = "2";
		String d1 = "12.25";
		System.out.println(c1 + c2);
		
		int cc1 = Integer.parseInt(c1);
		int cc2 = Integer.parseInt(c2);
		System.out.println(cc1 + cc2);
		
		double dd1 = Double.parseDouble(d1);

		int[] pole = new int[10];
		Arrays.fill(pole, 10); //vyplni pole desiatkami
		for(int cislo: pole) {
			System.out.print(cislo + ", ");
		}
		
		int[] pole2 = new int[10];
		Arrays.fill(pole2, 10);
		
		System.out.println(Arrays.equals(pole, pole2));  //porovna ci sa polia rovnaju
		
		int[] pole3 = {123,12,45,-9,78};
		for(int cislo: pole3) {
			System.out.print(cislo + ", ");}
		
		System.out.println();
		
		Arrays.sort(pole3);
		for(int cislo: pole3) {
			System.out.print(cislo + ", ");}
		
		
		
		
		
		
		
		
	}

}
