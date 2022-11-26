package experience5;

public class Search {
	public static void b(String a, String word) {
		int count = 0;
		String substr;
		int index = 0;
		for (int i = 0; i < a.length(); i++) {
			index = a.indexOf(word);
			if (index == -1) {
				break;
			} else {
				substr = a.substring(index + word.length(), a.length());
				a = substr;
				count++;
			}
		}
		System.out.println(word + "出现的次数为:" + count);
	}

}