package JavaImportantPrograms;

public class FindLowerCaseLetter2 {

	public static void main(String[] args) {
		String s = "Welcome to Automation";
		String lowerCase = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (Character.isLowerCase(ch)) {
				lowerCase = lowerCase + ch;
			}
		}

		System.out.println(lowerCase);
	}
}