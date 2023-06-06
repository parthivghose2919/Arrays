package questions;
import java.util.*;
//Print Subarrays Problem with Time Complexity:-O(n^2)
public class Print_Subarrays {
     public static void printsubarrays(int numbers[])
     {
    	 int ts=0;
    	 for(int i=0;i<numbers.length;i++)
    	 {
    		 int start=i;
    		 for(int j=i;j<numbers.length;j++)
    		 {
    			 int end=j;
    			 for(int k=start;k<=end;k++)//print use only
    			 {
    				 System.out.print(numbers[k]+" ");//subarrays
    				 
    			 }
    			 ts++;
    			 System.out.println();
    		 }
    		 System.out.println();
    	 }
    	 System.out.println("The Total no. of subarrays are:"+ts);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner (System.in);
	       System.out.println("Enter the size of the array");
	       int n=sc.nextInt();
	       int numbers[]=new int[n];
	       System.out.println("Enter the numbers in the array");
	       for(int i=0;i<numbers.length;i++)
	       {
	          numbers[i]=sc.nextInt();
	       }
	       printsubarrays(numbers);
	}

}
