package array_Programmes;

public class Pgm175_Print_Only_Digits_and_Special_Characters {
	public static void main(String[] args) {

		String s1 = "1a2b3c#t&u*";

		char ch[] = s1.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) {
				System.out.println(ch[i]);
			} else if (Character.isAlphabetic(ch[i])) {

			} else {
				System.out.println(ch[i]);
			}
		}
	}
}
