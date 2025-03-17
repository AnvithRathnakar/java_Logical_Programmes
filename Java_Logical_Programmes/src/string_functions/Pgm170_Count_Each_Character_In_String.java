package string_functions;

import java.util.HashMap;
import java.util.Map.Entry;

public class Pgm170_Count_Each_Character_In_String {
	public static void main(String[] args) {

		String s1 = "SatyaHarishChandra";

		char[] ch = s1.toCharArray();

		HashMap<Character, Integer> h = new HashMap<Character, Integer>();

		for (int i = 0; i < ch.length; i++) {
			if (h.containsKey(ch[i])) {
				h.put(ch[i], h.get(ch[i]) + 1);
			} else {
				h.put(ch[i], 1);
			}
		}

		for (Entry<Character, Integer> entry : h.entrySet()) {
			System.out.println(entry.getKey() + "    " + entry.getValue());
		}
	}
}
