package pkg1;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		// swapping 2 numbers
		
		//logic 1 using temp variable
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number = ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		//int a=10, b=20;
		System.out.println("Before swapping values are ="+ a+" "+ b );
	 
		/* int t=a;
		     a=b;
		     b=t;*/
		     
		   //logic 2
		     
		    /* a=a+b;
		     b=a-b;
		     a=a-b;*/
		
		//logic 3
		
		b=a+b-(a=b);
			     
	    System.out.println("After swappinh values are ="+a+" " +b);	   
		     
	}

}
