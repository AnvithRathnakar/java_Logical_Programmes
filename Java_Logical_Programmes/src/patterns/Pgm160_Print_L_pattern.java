package patterns;

public class Pgm160_Print_L_pattern {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (j == 1 || i == 3) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
