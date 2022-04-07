package pkg1;

import java.util.Scanner;

public class FindArmstring_Number {

	public static void main(String[] args) {
			
		/*Scanner s = new Scanner(System.in);
		System.out.print("Enter Number =");
		int no=s.nextInt();*/
		
		int no =153;
		int t1=no;
		int length=3;
		/*while(t1 !=0)
		{
			length=length+1;
			t1=t1/10;
			//System.out.print(length);
		}*/
		
		int t2=no;
		int arm=0;
		int rem;
		 
		while(t2 !=0)
		{	
			rem =t2%10;
			int mul=1;
			for(int i=1; i<=length; i++)
			{
				mul=mul*rem;		
			}
			 arm=arm+mul;
			 t2=t2/10;	
		}
	
	  if(arm==no)
	  {
		System.out.println("Number is ArmStrong");
	  }
	  else
	  {
		  System.out.println("Number is not ArmStrong");
	  }

}
}