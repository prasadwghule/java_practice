package java_PracticeProgram;

public class String_reverse {
	public static void main(String[] args) {
		
		String str="My Java";
		char[] a = str.toCharArray();
		String rev="";
			
			for(int i=str.length()-1;i>=0;i--)
			{
				rev=rev+a[i];
//				System.out.println(a[i]);
			}
			System.out.println(rev);
	}

}
