package JavaPractice;

public class StringEvenOddSwap {

	public static void main(String[] args) {
		
//		input=abcd;
//		output=badc;
		
		String str="abcd";
		char [] arr=str.toCharArray();
		
		for (int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
//				System.out.println(i);
				char temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
				
				
			}
		}
		System.out.println("Old: "+str);
		
		// Convert the character array back to a string and store in same variable
		str=new String(arr);
		System.out.println("New: "+str);
		

	}

}
