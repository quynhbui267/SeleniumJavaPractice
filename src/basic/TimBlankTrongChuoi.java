package basic;
import static java.lang.Character.isWhitespace;
//Nếu chỗ này ko import static method thì phải viết Character.isWhitespace
//Để gọi tới 1 method ở khác class thì: 1/Nếu method = static then Class.method hoặc import method; 2/Nếu method != static then khởi tạo bien instance cho class đó rồi gọi bien.method


public class TimBlankTrongChuoi {
	public static void main(String[] args) {
		//Neu viet ben trong method thi phai khoi tao gia tri ban dau, con viet ben ngoai method thi ko can
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