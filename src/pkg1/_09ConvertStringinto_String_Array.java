package pkg1;

import java.util.Arrays;

public class _09ConvertStringinto_String_Array {

	public static void main(String[] args) {
	
		String s = "I am Softwere test Engineer with CTC of 7,50,000 INR";
		
		String s1[]= s.split("  ");
		
		//char s1[] = s.toCharArray();	
		
		System.out.print(Arrays.toString(s1));

	}

}
