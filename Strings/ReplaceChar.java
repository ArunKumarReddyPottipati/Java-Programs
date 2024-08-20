/*
 In Java, here we are given a string, the task is to replace a character at a specific index in this string.

Examples of Replacing Characters in a String
Input: String = "Geeks Gor Geeks", index = 6, ch = 'F'
Output: "Geeks For Geeks."

Input: String = "Geeks", index = 0, ch = 'g'
Output: "geeks"

*/

import java.util.Scanner;
public class ReplaceChar
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = sc.next();
		System.out.print("Enter the Index: ");
		int n = sc.nextInt();
		System.out.print("Enter the character: ");
		String ch = sc.next();
		System.out.println("After replacing the character");
		System.out.println(s.substring(0,n)+ch+s.substring(n+1));
	}
}