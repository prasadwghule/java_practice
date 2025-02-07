package JavaPractice;

import java.util.Scanner;

public class LongestStringInSentence {
	
	public static void main(String[] args) {
		String sentence="This is my name Prasad";
		String[] words = sentence.split(" ");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Strin: ");
		String str=scan.next();
		
		
		
		int maxLength = 0;
		String largestWord = null;
		for(String singleWord:words)
		{
			System.out.println(singleWord+" : ");
			int length=singleWord.length();
			if(length>maxLength)
			{
				 maxLength=length;
				 largestWord=singleWord;
				
			}
			
//			System.out.println(singleWord+" : ");
		}
		System.out.println("This is largest string: "+largestWord);
		System.out.println("This is given String: "+str);
	}

}
