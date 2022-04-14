package pkg1;

import java.util.Scanner;

public class _06Odd_Even_Numbers {

	public static void main(String[] args) {
		
      Scanner scn = new Scanner(System.in);
      System.out.print("Enter your Number = ");
      int no = scn.nextInt();
        
	
      if (no % 2 == 0)
      { 
    	 System.out.println("Number is even");
      }
      else
      {
    	  System.out.println("Number is odd");
      }


	}

}
