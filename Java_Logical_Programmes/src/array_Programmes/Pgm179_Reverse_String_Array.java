package array_Programmes;

public class Pgm179_Reverse_String_Array {
	public static void main(String[] args) {

		String b[] = { "hello", "hi", "bye" };

		int count1 = b.length;
		System.out.println(count1);

		for (int i = count1 - 1; i >= 0; i--) {
			System.out.print(b[i] + " ");
		}

	}
}
