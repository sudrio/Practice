package pkg1;

import java.util.Arrays;

public class _19Array_Assending_Desendig_Order {

	public static void main(String[] args) {

		
		int [] arr = {1,28,39,25,7,9,16};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]>arr[i])
				{
					
					int h = arr[i];
					arr[i] = arr[j];
					arr[j]=h;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
 

	}

}
