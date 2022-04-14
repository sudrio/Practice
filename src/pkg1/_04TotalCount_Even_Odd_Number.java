package pkg1;

public class _04TotalCount_Even_Odd_Number {

	public static void main(String[] args) {
		
		int num =123456789;
		int even_count = 0;
		int odd_count = 0;
		int rem;
		
		
		while(num>0)
		{
			rem = num%10;
			num=num/10;
			
		   if(num % 2 == 0)
		   {
			   even_count++;
			   
		   }
		   else
		   {
			   odd_count++;
	
		   }
		}
		System.out.println("Total count of even numbers : " + even_count);
        System.out.print("Total count of odd numbers : " + odd_count);
	}

}
