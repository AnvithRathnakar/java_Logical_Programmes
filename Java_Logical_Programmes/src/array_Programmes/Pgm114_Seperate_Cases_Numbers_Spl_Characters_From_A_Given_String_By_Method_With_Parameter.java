package array_Programmes;

public class Pgm114_Seperate_Cases_Numbers_Spl_Characters_From_A_Given_String_By_Method_With_Parameter {
	public static void main(String[] args) {
		seperate("dhDGDdh837GDGDh^#@#$23");
	}

	static void seperate(String s) {
		String uc = "";
		String lc = "";
		String no = "";
		String spl = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				uc = uc + c;
			} else if (Character.isLowerCase(c)) {
				lc = lc + c;
			} else if (Character.isDigit(c)) {
				no = no + c;
			} else {
				spl = spl + c;
			}
		}
		System.out.println(uc);
		System.out.println(lc);
		System.out.println(no);
		System.out.println(spl);
	}
}
