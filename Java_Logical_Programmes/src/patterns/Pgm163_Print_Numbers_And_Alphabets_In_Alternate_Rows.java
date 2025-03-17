package patterns;

public class Pgm163_Print_Numbers_And_Alphabets_In_Alternate_Rows {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			System.out.print(i);
		}
		System.out.println();
		for (char k = 'A'; k <= 'D'; k++) {
			System.out.print(k);
		}
		System.out.println();
		for (int i = 5; i <= 8; i++) {
			System.out.print(i);
		}
		System.out.println();
		for (char k = 'E'; k <= 'H'; k++) {
			System.out.print(k);
		}
	}
}
