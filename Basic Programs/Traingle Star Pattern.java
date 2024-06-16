import java.util.Scanner;
public class pattern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter the range: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
	}
}


/* Sample Output 

Enter the range: 5
*
**
***
****
*****

Enter the range: 10
*
**
***
****
*****
******
*******
********
*********
**********

*/
