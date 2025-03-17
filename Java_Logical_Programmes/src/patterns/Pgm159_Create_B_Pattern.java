package patterns;

public class Pgm159_Create_B_Pattern {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i == 0 && j != 10 || i == 5 && j != 10 || i == 10 && j != 10 || j == 1
						|| j == 10 && (i != 0 && i != 5 && i != 10)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
