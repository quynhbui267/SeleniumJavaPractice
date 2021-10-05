package basic;
import static java.lang.Character.isDigit;

public class checkContainNumber {
	public static void main(String[] args) {
		System.out.println(isContainNumber("9999"));
	}
	public static boolean isContainNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			if (!isDigit(text.charAt(i))) {
				return false;
			}
		}
		return true;

	}
}
