
public class ViacrozmernePole {

	public static void main(String[] args) {

	int[][] matica = new int[3][3];
	
	int[][] mm = {
			{1,2,4},
			{1,10,123,178},
			{1}
	};
	
	matica[0][0] = 1;
	matica[0][1] = 2;
	matica[0][2] = 3;
	matica[1][0] = 4;
	matica[1][1] = 5;
	matica[1][2] = 6;
	matica[2][0] = 7;
	matica[2][1] = 8;
	matica[2][2] = 9;
	
	for(int i = 0; i<matica.length;i++) {
		for(int j = 0; j < matica[i].length;j++) {
			System.out.print(matica[i][j] + " ");
		}
		System.out.println("");
	}

	}

}
