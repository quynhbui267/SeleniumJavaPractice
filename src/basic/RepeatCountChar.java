package basic;

import java.util.HashMap;

public class RepeatCountChar {
	public static void main(String[] args) {
		System.out.println(checkRepeatCountOfChar2("approach of checking"));
	}

	public static String checkRepeatCountOfChar(String text) {
		String temp = "";
		for (int i = 0; i < text.length(); i++) {
			if (temp.indexOf(text.charAt(i)) == -1) {
				temp += text.charAt(i);
			}
		}
		String temp2 = "{";
		int[] count = new int[temp.length()];
		String[] str = new String[temp.length()];
		for (int j = 0; j < temp.length(); j++) {
			str[j] = text.replace(String.valueOf(temp.charAt(j)), "");
			count[j] = text.length() - str[j].length();
			if (j == temp.length() - 1) {
				temp2 += temp.charAt(j) + "=" + count[j] + "}";
				break;
			}
			temp2 += temp.charAt(j) + "=" + count[j] + ",";

		}

		return temp2;

	}

	public static HashMap<String, Integer> checkRepeatCountOfChar2(String text) {
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < text.length(); i++) {
			String str = Character.toString(text.charAt(i));
			if (!map.containsKey(str)) {
				map.put(str, 1);				
			}
			else {
			map.put(str,map.get(str) +1);
			}
		}
		return map;
	}
}
