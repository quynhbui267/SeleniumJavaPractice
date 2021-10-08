package basic;

public class CheckPalindromeText {
	public static void main(String[] args) {
		CheckPalindromeText t = new CheckPalindromeText();
		System.out.println(t.isPalindrome2("wow"));
	}

	public boolean isPalindrome1(String text) {
		for (int i = 0; i < text.length() / 2; i++) {
			if (text.charAt(i) == text.charAt(text.length() - 1 - i)) {
			} else {
				return false;
			}
		}
		return true;
	}

	
//equals chỉ so sánh
	public boolean isPalindrome2(String text) {
		StringBuilder str = new StringBuilder(text);
		if (text.equals(str.reverse().toString())){
			return true;
		}
		return false;
	}
}
