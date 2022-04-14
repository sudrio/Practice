package pkg1;

import java.util.HashSet;

public class _12Duplicate_String_Array {

	public static void main(String[] args) {

		//Aproche 1
		
	/*	String arr[] = {"java","c","c++","python","java"};
		boolean flag =false;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Found duplicate Element : " + arr[i]);
					flag=true;
				}
				
			}
		}
		
		if(flag == false)
		{
			System.out.print("Not found any Duplicate Element");
		}*/
		
		//Aproche 2
		
		String arr[]= {"java","c","c++","python","java"};
		
		HashSet<String> langs = new HashSet();
		boolean flag = false;
		
		for(String l :arr)
		{
			if(langs.add(l)==false)
			{
				System.out.println("Found Duplicate Element : " + l);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Not Found Duplicates : ");
		}
		
		
		

	}

}
