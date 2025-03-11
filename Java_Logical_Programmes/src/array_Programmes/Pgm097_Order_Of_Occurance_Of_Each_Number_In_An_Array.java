package array_Programmes;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Pgm097_Order_Of_Occurance_Of_Each_Number_In_An_Array {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 2, 5, 6, };
		LinkedHashMap<Integer, Integer> l1 = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!l1.containsKey(arr[i])) {
				l1.put(arr[i], 1);
			} else {
				int x = l1.get(arr[i]);
				x++;
				l1.put(arr[i], x);
			}
		}
		for (Entry<Integer, Integer> a : l1.entrySet()) {
			System.out.println(a.getKey() + " " + a.getValue());
		}
	}
}
