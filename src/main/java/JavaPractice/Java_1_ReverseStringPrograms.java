package JavaPractice;

public class Java_1_ReverseStringPrograms {

	public static void main(String[] args) {
		// by using chartAt method

		String myString = "Selenium";
		String myString1 = "This via method";
		String revStr="";

		for (int i = (myString.length() - 1); i >= 0; i--)
		{
//			System.out.print(myString.charAt(i))
			revStr += (myString.charAt(i));
		}
		System.out.println("By using direct charAt : "+revStr);
		System.out.println("By using method parameterization: "+ makeStringReverse(myString));
	}
	
	public static String makeStringReverse(String str)
	{
		int strLength = str.length();
		String revStr="";
		for (int i=(strLength-1);i>=0;i--)
		{
			char abc = str.charAt(i);
			revStr=revStr+abc;
		}
		return revStr;
	}
	
	
}
