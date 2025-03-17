package string_functions;

import java.util.HashMap;
import java.util.Map.Entry;

public class Pgm172_Duplicate_Characters_In_A_String {
	public static void main(String[] args) {
		String s = "shabdavedi";
		HashMap<Character, Integer> h = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (h.containsKey(ch)) {
				h.put(ch, h.get(ch) + 1);
			} else {
				h.put(ch, 1);
			}
		}
		for (Entry<Character, Integer> k : h.entrySet()) {
			if (k.getValue() > 1) {
				System.out.println(k);
			}
		}
	}
}
