package multi_Dimensional_Array;

public class Pgm169_Add_Two_MultiDimensional_Arrays {
	public static void main(String[] args) {

		int[][] arr = { { 1, 2 }, { 3, 4 } };

		int[][] arr1 = { { 1, 2 }, { 3, 4 } };

		int[][] arr2 = new int[2][2];
		// 0<2
		for (int i = 0; i < arr.length; i++) { // 1<2
			for (int j = 0; j < arr1.length; j++) {
				arr2[i][j] = arr[i][j] + arr1[i][j];

				System.out.println(arr[i][j]);
			}

		}
	}
}
