package array_Programmes;

public class Pgm180_Right_Rotate_Elements_In_An_Array {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };

		int last = a[a.length - 1];

		for (int i = a.length - 1; i > 0; i--) {
			a[i] = a[i - 1];
		}
		a[0] = last;

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
