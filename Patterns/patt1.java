/*
Write a program to print the below pattern

input: 12345
output:

1    5
 2  4
  3 
 2  4
1     5

*/

import java.util.Scanner;
public class patt1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(j==i || j==s.length()-1-i)
					System.out.print(s.charAt(j)+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}


/*

Output1:
Enter the string
welcome
w      e
 e    m
  l  o
   c
  l  o
 e    m
w      e

Output 2:

Enter the string
123456789
1        9
 2      8
  3    7
   4  6
    5
   4  6
  3    7
 2      8
1        9



*/