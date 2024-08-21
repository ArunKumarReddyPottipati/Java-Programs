/*

write a program to count the appearence of 2 in a given range
input:35
output:14

Explanation: 2 in 0 to 35 are 2,12,21,22,23,24,25,26,27,28,29,32
note: add 2times when n=22

*/
import java.util.Scanner;
public class Count2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str,ch="2";
		int count=0;
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			if(i==22)
				count+=2;
			else
			{
				str=String.valueOf(i);
				if(str.contains(ch))
					count++;
			}
		}
		System.out.println("Count="+count);
	}
}

/*

Output:
Enter a number:
35
Count=14



Enter a number:
61
Count=16

*/
		