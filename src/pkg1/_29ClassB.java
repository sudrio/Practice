package pkg1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class _29ClassB {

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
