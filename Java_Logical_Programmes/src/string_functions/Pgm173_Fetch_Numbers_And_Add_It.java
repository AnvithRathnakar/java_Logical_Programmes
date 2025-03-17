package string_functions;

public class Pgm173_Fetch_Numbers_And_Add_It {
	public static void main(String[] args) {
		String s = "CID999";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				String n = "";
				n = n + ch;
				int no = Integer.parseInt(n);
				sum = sum + no;
			}
		}
		System.out.println(sum);
	}
}
