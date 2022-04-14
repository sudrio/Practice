package pkg1;

public class _03Count_totaldigit_number {

	public static void main(String[] args) {
		
      int num = 1234567;
      int count =0;
    
      while(num>0)
      {
    	  num=num/10;
    	  count++;
    	  
      }
      System.out.print("Total count of digits :" + count);
	}

}
