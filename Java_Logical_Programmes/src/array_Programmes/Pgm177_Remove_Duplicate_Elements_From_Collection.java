package array_Programmes;

import java.util.ArrayList;
import java.util.HashSet;

public class Pgm177_Remove_Duplicate_Elements_From_Collection {
	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<Integer>();

		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(2);
		ar.add(4);

		// int count = ar.size();
		// System.out.println(count);

		HashSet<Integer> hs1 = new HashSet<Integer>(ar);

		for (Integer a : hs1) {
			System.out.println(a);
		}

	}
}
