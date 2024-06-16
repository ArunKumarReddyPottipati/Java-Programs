import java.util.Scanner;
public class palindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,temp,dig,sum=0;
		System.out.print("Enter the number to be checked : ");
		n = sc.nextInt();
		temp=n;
		while(n>0)
		{
			dig=n%10;
			sum=(sum*10)+dig;
			n/=10;
		}
		if(temp==sum)
			System.out.println(sum+" is a palindrome");
		else
			System.out.println(sum+" is not a palindrome");
	}
	
}



/*

Enter the number to be checked : 12321
12321 is a palindrome

Enter the number to be checked : 6754
4576 is not a palindrome

*/
