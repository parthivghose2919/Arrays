package questions;
import java.util.*;
//Linear Search Code
public class Linear_Search {
public static int linearsearch(int arr[],int element)
{
	for(int i=0;i<arr.length;i++) {
		if (arr[i]==element)
			return i;
	}
	return -1;
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
	 System.out.println("Enter the element You want to search");
	 int element=sc.nextInt();
	int search=linearsearch(arr,element);
	if(search==-1)
	{
		System.out.println("Element Not Found");
	}
	else {
	System.out.println("The Element is Present at position:"+search);
	}
 }
}
