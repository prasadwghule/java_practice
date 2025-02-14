package java_PracticeProgram;

import java.util.HashMap;

public class String_reverseByHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is my Name";
		
		HashMap<Integer,Character> hs=new HashMap<Integer,Character>();
		
		for(int i=0;i<str.length();i++)
		{
			hs.put(i, str.charAt(i));
		}
		System.out.println(hs);
		System.out.println(hs.size());
		
		StringBuilder sb=new StringBuilder();
		for(int i=hs.size()-1;i>=0;i--)
		{
			Character str11 = hs.get(i);
			sb.append(str11);
		}
		System.out.println(sb);
		
		
		
				
		
		

	}

}
