/*Write a program to print the below pattern based on the user input

input:7

      *
     **
    ***
   ****
  *****
 ******
*******

*/

import java.util.Scanner;
public class RightSideRightTriangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n-i;j>=1;j--)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print("*");
			System.out.println();
		}
	}
}

/*

Output:

Enter a number:
9
        *
       **
      ***
     ****
    *****
   ******
  *******
 ********
*********

*/
