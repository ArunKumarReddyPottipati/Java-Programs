/*
Write a program to print the below pattern

input:5
output:

*
**
***
****
*****

*/

import java.util.Scanner;
public class RightTriangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*

Output1:

Enter a number:
7
*
**
***
****
*****
******
*******

Output2:

Enter a number:
15
*
**
***
****
*****
******
*******
********
*********
**********
***********
************
*************
**************
***************

*/