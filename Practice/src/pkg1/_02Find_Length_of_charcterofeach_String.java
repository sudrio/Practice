package pkg1;

import java.util.Scanner;

public class _02Find_Length_of_charcterofeach_String {

	public static void main(String[] args) {
	
	/*Scanner sc = new Scanner(System.in);
	System.out.println("Enter your String :");
	String s = sc.next();*/
	
		String s = "I am Softwere Test Engineer with CTC of 7.5 Lakh";
		
		int initial_length =s.length();
		
		int Afeter_length =s.replace("e", "").length();
		
	   int total_count = initial_length - Afeter_length;
	   System.out.println("Total count of character e = " + total_count);
	
		
	
}
}