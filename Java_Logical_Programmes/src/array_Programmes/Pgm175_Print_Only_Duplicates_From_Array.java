package array_Programmes;

public class Pgm175_Print_Only_Duplicates_From_Array {
	public static void main(String[] args) {

		int a[] = new int[] { 1, 2, 1, 3, 4, 3 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] == a[j]) && (i != j)) {
					System.out.println(a[j]);
				}
			}
		}

	}
}
