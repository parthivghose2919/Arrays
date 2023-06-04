package questions;
import java.util.*;
//Binary Search Time Complexity:-O(log n)
public class Binary_Search {
	public static int binarysearch(int arr[],int k)
	{
		int start=0,end=arr.length-1;
		while (start<=end)
		{
			int mid=(start+end)/2;
			//comparisions
			if(arr[mid]==k)
				return mid;
			if(k>arr[mid])//right
				start=mid+1;
			else 
				end=mid-1;//left
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter the Size of the array");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter the numbers in the arrays");
      for(int i=0;i<n;i++)
      {
    	  arr[i]=sc.nextInt();
      }
      System.out.println("Enter the number You want to find");
      int k=sc.nextInt();
      System.out.println("The index of the key is found in the position:"+binarysearch(arr,k));
	}

}
