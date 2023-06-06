package questions;
import java.util.*;
//Pairs in Arrays with Time Complexity:-O(n^2)
public class pairs_in_arrays {
	public static void pairsarrays(int numbers[])
	{
		int tp=0;
	  for (int i=0;i<numbers.length-1;i++)
	  {
		  int curr=numbers[i];
		  for(int j=i+1;j<numbers.length;j++)
		  {
			System.out.print("("+curr+","+numbers[j]+")");
			tp++;
		  }
		  System.out.println();
	  }
	  System.out.println("The total number of pairs are:"+tp);
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
       pairsarrays(numbers);
}
}