package basic;
import static java.lang.Character.toLowerCase;

public class findUniqueChar {
	public static void main(String[] args) {
		System.out.println(returnUniqueChar2("Moo mok ki"));
		
		//Chỗ này nếu ko muốn tạo đối tượng mới thì phải gọi method static
		//Với method/class là static thì ko nhất thiết phải khởi tạo đối tượng mới gọi được method/class đó.
	}

	
	//Ko nên sử dụng 2 vòng for lồng nhau vì performance thấp
	public static char returnUniqueChar(String text) {
		String str = text.replaceAll("\\s", "");
		char[] ch = str.toCharArray();
		int[] count = new int[str.length()];
		int i;
		for (i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (toLowerCase(str.charAt(i))==toLowerCase(ch[j])) {
					count[i]++;
				}
			}
			if (count[i] == 1) {
				return str.charAt(i);
			}
		}
		return str.charAt(0);
	}

	//fromIndex phải sử dụng indexOf để from từ ký tự đầu tiên xuất hiện + 1
	public static char returnUniqueChar2(String text) {
		String str = text.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char j = str.charAt(i);
			if (str.indexOf(j, (str.indexOf(j) + 1)) == -1) {
				return j;
			}
		}
		return str.charAt(0);
	}
}

