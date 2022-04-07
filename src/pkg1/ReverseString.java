package pkg1;

public class ReverseString {

	

	public static void main(String[] args) {
		
		// Reverse the string 
		
		String s = "Velocity";  
		String s1 = "";
		
		System.out.println("Original String = " + s );
		char ch;
		
		for(int i=0; i<s.length(); i++)
		{
			ch= s.charAt(i);
			s1=ch+s1;
			
			System.out.println("Reverse String =" +s1);
			
		}

	}

}
