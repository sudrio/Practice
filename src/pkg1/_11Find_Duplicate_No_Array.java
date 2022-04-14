package pkg1;

import java.util.HashSet;

public class _11Find_Duplicate_No_Array {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,1};    //"1","2","3","4","5","6","1"
		boolean flag =false;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Found Duplicate Number : " + arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Not Found any Duplicate number : ");
		} 
		
		/*int arr[]= {1,2,3,4,5,6,1};
		boolean flag=false;
		
		HashSet<Integer> nums = new HashSet();
		
		for(Integer i :arr)
		{
			if(nums.add(i)==false)
			{
				System.out.println("Found Dupliate Number : " + i);
				flag=true;
				
			}
		}
		if(flag==false)
		{
			System.out.println("Not Found Any Duplicate Number : ");
		}*/
		
	}

}
