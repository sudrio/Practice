package pkg1;

public class _10FactorialNumber {

	public static void main(String[] args) {
	
		int num = 5;
		long factorial = 1;
		
	/*5!=1*2*3*4*5=120 below loop is for ascending order
		for(int i=1; i<=num; i++)
		{
			factorial = factorial*i;		
		}*/
		
		//5=5*4*3*2*1 = 120 below loop is for descending order
		
		for(int i=num; i>=1; i--)
		{
			factorial = factorial*i;
		}
          System.out.println(factorial );
	}

}
