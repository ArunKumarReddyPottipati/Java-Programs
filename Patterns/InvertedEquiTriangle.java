/*Write a program to print the below pattern based on the user input

input:5

* * * * *
 * * * *
  * * *
   * *
    *


*/

import java.util.Scanner;
public class InvertedEquiTriangle
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
			for(int k=n+1-i;k>=1;k--)
				System.out.print("* ");
			System.out.println();
		}
	}
}

/*

Output:
Enter a number:
8
* * * * * * * *
 * * * * * * *
  * * * * * *
   * * * * *
    * * * *
     * * *
      * *
       *

*/
				
			