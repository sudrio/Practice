package pkg1;

public class _20Array_Find_Smallnumber_biggestnumber {

	public static void main(String[] args) {

		int [] arr = {1,28,39,25,7,9,16};
		  
		int bignumber = arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(bignumber < arr[i])
			{
				bignumber = arr[i];
			}
		}
		System.out.println((" biggst number : " + bignumber));
		
		
		

	}

}
