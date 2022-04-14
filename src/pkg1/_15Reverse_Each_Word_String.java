package pkg1;

public class _15Reverse_Each_Word_String {

	public static void main(String[] args) {
		
		String str = "Welcome to java";
		
		String []words= str.split(" ");
		
		String revString = "";
		
		for(String w:words)
		{
			String revWords = "";
			for(int i=w.length()-1; i>=0; i--)
			{
				revWords =revWords + w.charAt(i);
				
			}
			
			revString = revString + revWords + " ";
		}
		System.out.println("Reversed the String : " + revString);
		
		

	}

}
