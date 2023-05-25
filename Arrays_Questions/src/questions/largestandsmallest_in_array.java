package questions;
import java.util.*;
//Largest and smallest Number in the array  Time complexity(O(n))
public class largestandsmallest_in_array {
   public static int getlargest(int numbers[])
   {
	   int largest=Integer.MIN_VALUE;//-Infinity
	   for(int i=0;i<numbers.length;i++)
	   {
		  if(largest<numbers[i])
			  largest=numbers[i];
	   }
	   return largest;
   }
   public static int getsmallest(int numbers[])
   {
	   int smallest=Integer.MAX_VALUE;//+Infinity
	   for(int i=0;i<numbers.length;i++)
	   {
		  if(smallest>numbers[i])
			  smallest=numbers[i];
	   }
	   return smallest;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the Number of arrays You Want to make");
	     int n=sc.nextInt();
	     int arr[]=new int[n];
	     System.out.println("Enter the Numbers in  the array");
		 for(int i=0;i<n;i++)
		   {
			arr[i]=sc.nextInt();
		   } 
		System.out.println("Largest in the array is:"+getlargest(arr));
		System.out.println("Smallest in the array is:"+getsmallest(arr));;
		}
}



