package pkg1;

import java.util.Scanner;

public class _14Prime_Number {

	public static void main(String[] args) {
       
		int num = 7;
		int count = 0;
		
		if(num>1)
		{
			for(int i=1; i<=num; i++)
			{
				if(num % i == 0)
				{
					count ++;
				}
			}
			if(count == 2)
			{
				System.out.println("Number is prime number");
			}
			else
			{
				System.out.println("Number is not prime");
			}
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}

}
