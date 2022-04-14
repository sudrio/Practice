package pkg1;

public class _05Addition_Total_digits {

	public static void main(String[] args) {
		
		int num = 123456;
		int sum =0;
		int rem;
		
		while(num>0)
		{
			sum= sum + num%10;
			num=num/10;
			
		}
		System.out.print("Total count of digits : "+ "" + sum);

	}

}
