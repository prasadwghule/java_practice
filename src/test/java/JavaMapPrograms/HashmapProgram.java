package JavaMapPrograms;

import java.util.HashMap;

public class HashmapProgram {
	public static void main(String[] args) {
		String a = "Java Selenium Java Cucumber Java TestNG Cucumber";

		String [] abc = a.split(" ");
		
		HashMap<String,Integer> h1 =new HashMap<String,Integer>();
		
		for(String b: abc)
		{
			if(h1.containsKey(b))
			{
				h1.put(b, h1.get(b)+1);
			}
			else {
			h1.put(b, 1);
			}
		}
		
		String str="cucumber";

		char [] pqr = str.toCharArray();

		HashMap<Character, Integer> h2 =new HashMap<Character, Integer> ();


		for(char b: pqr)
		{
				if(h2.containsKey(b))
				{
						int capturedValue = h2.get(b);
						h2.put(b, capturedValue+1);
				}
				else
				{
					h2.put(b,1);
				}
		

		}
		
		System.out.println(h2.entrySet());
		System.out.println(h2.keySet()+" "+h2.values());
		
		for (Character key : h2.keySet()) {
		    System.out.println("Key: " + key + ", Value: " + h2.get(key));
		}
		
		for (Integer t:h2.values())
		{
		    System.out.println("Values " + t);

		}
	}

}
