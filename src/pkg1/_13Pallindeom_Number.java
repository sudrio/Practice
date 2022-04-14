package pkg1;

import java.util.Scanner;

public class _13Pallindeom_Number {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num= sc.nextInt();
        
        int org_num=num;
        int rev=0;
        
        while(num!=0)
        {
        	rev=rev*10 + num%10;
        	num= num/10;
        	
        }
        if(rev==org_num)
        {
        	System.out.println("Number is Pallindrom Number: " + rev);
        }
        else
        {
        	System.out.println("Number is not Pallindrom Number : " + rev);
        }
	}

}
