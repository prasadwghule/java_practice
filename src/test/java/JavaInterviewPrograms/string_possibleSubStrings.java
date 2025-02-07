package JavaInterviewPrograms;

public class string_possibleSubStrings {
	public static void main(String[] args) {
		System.out.println("Hello World");
// 		find all possible substring of String

        String str="adbd";
        for (int i=0; i<str.length(); i++)
        
        {
            char ch1=str.charAt(i);
            for (int j=i+1; j<str.length(); j++)
            {
                char ch2=str.charAt(j);
                System.out.println(ch1+ch2);
            }
            // System.out.println();
        }
	}

}
