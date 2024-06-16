import java.util.Scanner;
public class fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int first=0,second=1,third,n;
		System.out.print("Enter the range of the Fibonacci Series:");
		n = sc.nextInt();
		if(n==0)
			System.out.println(first);
		else if(n==1)
			System.out.println(second);
		else
		{
			System.out.print(first+" "+second+" ");
			for(int i=3;i<=n;i++)
			{
				third=first+second;
				first=second;
				second=third;
				System.out.print(third+" ");
			}
		}
	}
}	



/* Sample output

Enter the range of the Fibonacci Series:10
0 1 1 2 3 5 8 13 21 34 
 
  */
