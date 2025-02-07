package JavaInterviewPrograms;

public class string_removeDuplicatechar {

	public static void main(String[] args) {
		System.out.println("Hello World");
		String name= "Prasad Walmik Ghule";
		
		for (int i=0;i<(name.length());i++)
		{
		    for (int j=i+1;j<(name.length());j++)
		    {
//		    	char abc = name.charAt(i); 
		    if(name.charAt(i)==name.charAt(j))
		        {
		           name=name.replace(name.charAt(j),'$');
		        }
		    }
//		    System.out.println(name);
		    }
		System.out.println(name);
	}


}
