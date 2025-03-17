package string_functions;

import java.util.HashMap;

public class Pgm171_Count_Each_Character_In_A_String {
	public static void main(String[] args) {

		String s1 = "Krishnadevaraya";
		HashMap<Character, Integer> h = new HashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			int count = 0;
			if (h.containsKey(ch)) {
				count = h.get(ch);
				count++;
				h.replace(ch, count);
			} else {
				count++;
				h.put(ch, count);
			}
			System.out.println(ch + " " + count);
		}
	}
}
