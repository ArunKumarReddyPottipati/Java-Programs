import java.util.Scanner;
public class factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		long fact=1;
		System.out.print("Enter the number to find factorial: ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
			fact*=(long)i;
		System.out.println(n+"! = "+fact);
	}
}

/* Sample Outputs 

Enter the number to find factorial: 5
5! = 120

Enter the number to find factorial: 10
10! = 3628800

Enter the number to find factorial: 12
12! = 479001600

*/
