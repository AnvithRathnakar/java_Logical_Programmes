package patterns;

public class Pgm164_Print_ASCII_Values_Of_UpperCase_Alphabets {
	public static void main(String[] args) {

		for (char k = 'A'; k <= 'Z'; k++) {
			System.out.println(k + " = " + (int) k);
		}

		for (char A = 'a'; A <= 'z'; A++) {
			System.out.println(A + " = " + (int) A);
		}
	}
}
