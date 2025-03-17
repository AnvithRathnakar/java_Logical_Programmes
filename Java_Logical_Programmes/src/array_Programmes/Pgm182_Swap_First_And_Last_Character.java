package array_Programmes;

public class Pgm182_Swap_First_And_Last_Character {
	public static void main(String[] args) {

		String s1 = "hello";

		char a = s1.charAt(0);

		char b = s1.charAt(s1.length() - 1);

		System.out.println(a + "  " + b);

		char c = a;

		a = b;

		b = c;

		System.out.println(a + "  " + b);

	}
}
