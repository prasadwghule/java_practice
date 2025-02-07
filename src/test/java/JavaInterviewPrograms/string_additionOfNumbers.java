package JavaInterviewPrograms;

public class string_additionOfNumbers {
	public static void main(String[] args) {
		String str="Pra123sad4@56";
		
		String numStr=str.replaceAll("[^0-9]","");
//		int intstr=Integer.parseInt(numStr);
//		System.out.println(numStr);

		int sum=0;
		
		for (char c : numStr.toCharArray()) 
		{
			System.out.println(c);
            // Convert the character to an integer and add it to the sum
            sum += c-'0'; // Subtract '0' to convert char to its corresponding integer value
//            Ass is if its character it will perform actions based on ASCII values
//            0->48
//            1->49 
//            so for any character between 0-9[48-57] if we substarct 0 char it will give the orignal ineger value
//            If c = '3', then '3' - '0' becomes 51 - 48 = 3.
//            If c = '7', then '7' - '0' becomes 55 - 48 = 7.
//            System.out.println(sum);
        }
		System.out.println(sum);

		
//		String numStr1 = str.replaceAll("[^0-]", "");
//		char[] cArray = numStr1.toCharArray();
//		
//		for(char c: cArray)
//		{
//			sum+=c-'0';
//		}

		
	}

}
