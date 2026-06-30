package firstPackage;

public class keypadProblem {
	public static void main(String[] args) {
		keyPad("", "9");

	}

	static void keyPad(String p, String up) {
		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}

		int digit = (int) up.charAt(0) - '0';

		for (int i = (digit - 1) * 3; i < digit * 3; i++) {
			char ch = (char) ('a' + i);
			keyPad(p + ch, up.substring(1));
		}
	}

}
