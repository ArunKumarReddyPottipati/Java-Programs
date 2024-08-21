/*
Write a proram to print the product of max three numbers in an integer array

input: {6,3,0,1,10)
output: 180 //10*6*3

*/

import java.util.Scanner;
public class MaxProduct3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int temp,prodt;
		System.out.println("Enter the size of Array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		prodt=arr[n-1]*arr[n-2]*arr[n-3];
		System.out.println("Product of max three elements= "+prodt);
	}
}


/*

Output:
Enter the size of Array:
5
Enter the array elements:
6
3
0
10
1
Product of max three elements= 180

*/