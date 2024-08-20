/*

Given a string of digits, remove leading zeros from it.

Illustrations: 

Input : 00000123569
Output: 123569

Input: 000012356090
Output: 12356090

*/
import java.util.Scanner;
public class RemoveLeadingZeros
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int index=0;
		System.out.println("Enter the string");
		String s = sc.next();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='0')
			{
				index=i;
				break;
			}
		}
		System.out.println("String Without any leading zero's : "+s.substring(index));
	}
}