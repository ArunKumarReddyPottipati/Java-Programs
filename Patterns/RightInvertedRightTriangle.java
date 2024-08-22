/*Write a program to print the below pattern based on the user input

input:7

*******
 ******
  *****
   ****
    ***
	 **
	  *
    

*/

import java.util.Scanner;
public class RightInvertedRightTriangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i-1;j++)
				System.out.print(" ");
			for(int k=n-i;k>=0;k--)
				System.out.print("*");
			System.out.println();
		}
	}
}



/*

output:

Enter a number:
9
*********
 ********
  *******
   ******
    *****
     ****
      ***
       **
        *

*/