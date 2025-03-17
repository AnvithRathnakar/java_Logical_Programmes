package patterns;

public class Pgm162_Print_Star_And_Number_In_Alternate_Rows {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == 0 || i == 2) {
					System.out.print("5");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
