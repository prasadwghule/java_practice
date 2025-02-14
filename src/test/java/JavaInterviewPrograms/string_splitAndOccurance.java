package JavaInterviewPrograms;

import java.util.HashMap;
import java.util.HashSet;

public class string_splitAndOccurance {

	public static void main(String[] args) {
		//number of occurances in each word
//		c2r2
		String str="This is current interview";
		
		String[] words = str.split(" ");
		
		for(String word:words)
		{
			System.out.println(word);
			if(!(getOccurances_of_word(word).size()>0))
			{
				System.out.println("No any duplicate charecter in word: "+word);
				System.out.println();
			}
			else
			{
				System.out.println("Duplicate charecters are : " +getOccurances_of_word(word));
				System.out.println();
			}
			
			
		}

		
		

		
		
	}

	public static  HashSet<Character> getOccurances_of_word(String word)
	{
		HashMap<Character, Integer> hs=new HashMap<Character, Integer>();
		HashSet<Character> duplicate=new HashSet<Character>();
		for(char c: word.toCharArray())
		{
			hs.put(c, hs.getOrDefault(c, 0)+1);
		}
		
		for(char c: hs.keySet())
		{
			
			if(hs.get(c)>1)
			{
				duplicate.add(c);				
			}
		}
		
		return duplicate;
	}
}
