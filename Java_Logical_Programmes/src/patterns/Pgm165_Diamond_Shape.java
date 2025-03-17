package patterns;

public class Pgm165_Diamond_Shape {
	public static void main(String[] args) {
		int space = 3;
		int star = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
			space--;
			star = star + 2;
		}
		space = 1;
		star = 5;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
			space++;
			star = star - 2;
		}
	}
}
