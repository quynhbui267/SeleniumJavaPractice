package basic;
import static java.lang.Character.isWhitespace;
//Nếu chỗ này ko import static method thì phải viết Character.isWhitespace

public class TimBlankTrongChuoi {
	public static void main(String[] args) {
			int count=0;
		String text = "This code appears bit shorter than the traditional approach of checking the returned value directly for";
		for (int i = 0; i < text.length(); i++) {
			//chỗ này dùng được cả hàm isSpacechar này nếu là white blank thông thường, isWhitespace thì cover rộng hơn
			if (isWhitespace(text.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
	}
}