package JavaInterviewPrograms;

public class string_newLineAlphaNumericString {
	public static void main(String[] args) {
		

        String str = "a\r\n" + 
        		"newline\r\n" + 
        		"4\r\n" + 
        		"7";  // String with characters separated by new lines
        
        // Method 1: Using replaceAll() to remove newlines
        System.out.println("Input String: "+str);
        String[] mergedString = str.split("\n");
        
        for(String str1:mergedString)
        {
        	System.out.print(str1);
        }
//        System.out.println(mergedString);  // Output: abcde
    
	}

}
