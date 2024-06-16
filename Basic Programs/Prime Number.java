import java.util.Scanner;
public class prime_number
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,test=0;
		System.out.print("Enter the number to be checked : ");
		n = sc.nextInt();
		if(n<=1)
			System.out.println(n+" is not a prime number");
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					test++;
					break;
				}
			}
			if(test==0)
				System.out.println(n+" is a prime number");
			else
				System.out.println(n+" is not a prime number");
		}
	}
}


/*  Sample Outputs  

Enter the number to be checked : 2
2 is a prime number

Enter the number to be checked : 4
4 is not a prime number

Enter the number to be checked : 453
453 is not a prime number

Enter the number to be checked : 47
47 is a prime number

*/
