package questions;
import java.util.*;
//Reverse an array of an sorted or unsorted array with time complexity:-O(n) and Space complexity:-O(1)
public class Reverse_array {
   public static void reverse(int numbers[])
   {
	   int start=0,end=numbers.length-1;
	   while(start<end)
	   {   //swap
		   int temp=numbers[end];
		   numbers[end]=numbers[start];
		   numbers[start]=temp;
		   start ++;
		   end--;
	   }
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
       reverse(numbers);
       System.out.println("The reverse of an array is:");
       for(int i=0;i<numbers.length;i++)
       {
       System.out.println(numbers[i]+" ");
	}
}}

