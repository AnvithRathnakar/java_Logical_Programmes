package patterns;

public class Pgm156_Inverted_Right_Angled_Triangle_Mirror {
	public static void main(String[] args) {
		int star = 4;
		int space = 0;
		for (int k = 1; k <= 4; k++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= star; i++) {
				System.out.print("*");
			}
			System.out.println();
			star--;
			space++;
		}

	}
}
