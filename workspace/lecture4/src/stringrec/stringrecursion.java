package stringrec;

import java.util.ArrayList;

public class stringrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> result = new ArrayList<>();
		specialkeypad(123, "", result);
		System.out.println(result);
	}

	public static ArrayList<String> subsequence(String str) {
		if (str.equals("")) {
			ArrayList<String> my = new ArrayList<>();
			my.add("");
			return my;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);// substring after first charcater

		ArrayList<String> recresult = subsequence(ros);
		ArrayList<String> myresult = new ArrayList<>();

		for (int i = 0; i < recresult.size(); i++) {
			myresult.add(" " + recresult.get(i));
			myresult.add(cc + recresult.get(i));
		}
		return myresult;
	}

	public static ArrayList<String> permutations(String str) {

		if (str.equals("")) {
			ArrayList<String> my = new ArrayList<>();
			my.add("");
			return my;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);// substring after first charcater

		ArrayList<String> recresult = permutations(ros);
		ArrayList<String> myresult = new ArrayList<>();

		for (int i = 0; i < recresult.size(); i++) {
			String mystring = recresult.get(i);
			for (int j = 0; j <= mystring.length(); j++) {
				myresult.add(mystring.substring(0, j) + cc + mystring.substring(j));
			}
		}
		return myresult;
	}

	public static ArrayList<String> subsequencewithascii(String str) {
		if (str.equals("")) {
			ArrayList<String> my = new ArrayList<>();
			my.add("");
			return my;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);// substring after first charcater

		ArrayList<String> recresult = subsequencewithascii(ros);
		ArrayList<String> myresult = new ArrayList<>();

		for (int i = 0; i < recresult.size(); i++) {
			myresult.add(" " + recresult.get(i));
			myresult.add(cc + recresult.get(i));
			myresult.add((int) (cc) + recresult.get(i));
		}
		return myresult;
	}

	public static String retstr(char a) {
		switch (a) {
		case '1':
			return "abc";
		case '2':
			return "def";
		case '3':
			return "ghi";
		case '4':
			return "jkl";
		case '5':
			return "mno";
		case '6':
			return "pqr";
		case '7':
			return "stu";
		case '8':
			return "vwx";
		case '9':
			return "yz";
		case '0':
			return ".,";
		default:
			return "hello";
		}
	}

	public static ArrayList<String> keypad(String str) {

		if (str.equals("")) {
			ArrayList<String> my = new ArrayList<>();
			my.add("");
			return my;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);// substring after first charcater

		ArrayList<String> recresult = permutations(ros);
		ArrayList<String> myresult = new ArrayList<>();

		for (int i = 0; i < recresult.size(); i++) {
			String mystring = recresult.get(i);
			for (int j = 0; j <= mystring.length(); j++) {
				myresult.add(mystring.substring(0, j) + cc + mystring.substring(j));
			}
		}
		return myresult;
	}

	// pubic static int specialchess()
	{

	}
	// public static ArrayList<String> permutations(String str)
	{

	}

	public static void specialkeypad(int original, String osf, ArrayList<String> result) {
		if (original == 0) {
			result.add(osf);
			return;
		}
		int temp1 = original % 10;
		int temp2 = original % 100;
		if (temp1 != temp2) {
			specialkeypad(original / 10, (char)('a' + temp1 - 1) + osf, result);
			if (temp2 <= 26)
				specialkeypad(original / 100, (char)('a' + temp2 - 1) + osf, result);
		} else {
			specialkeypad(original / 100, (char)('a' + temp2 - 1) + osf, result);
		}
	}

}
