package day1;

public class SentenceUser {
	public static String getlargestWord(String str) {
		String str1[], largest, word;
		str1 = str.split(" ");
		largest = str1[0];
		for (int i = 1; i < str1.length; i++) {
			word = str1[i];
			if (word.length() > largest.length()) {
				largest = word;

			}
		}
		return largest;
	}

	

}
