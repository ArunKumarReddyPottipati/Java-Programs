/*Write a program to print the below pattern based on the user input

input:7

   *
  ***
 *****
*******

*/

import java.util.Scanner;
public class EquiTriangleWithoutSpace
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int m=0;
		int n=sc.nextInt();
		for(int i=1;i<=n/2+1;i++)
		{
			for(int j=n/2+1-i;j>=1;j--)
				System.out.print(" ");
			for(int k=1;k<=i+m;k++)
			{
				System.out.print("*");
			}
			m++;
			System.out.println();
		}
	}
}

/*

Output:

Enter a number:
11
     *
    ***
   *****
  *******
 *********
***********

*/