import java.util.Scanner;
import java.lang.Math;
public class Armstrong
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,dig,temp,num,count=0,sum=0;
		System.out.print("Enter the number to be checked: ");
		n=sc.nextInt();
		temp=n;
		num=n;
		while(temp>0)
		{
			dig=temp%10;
			count++;
			temp/=10;
		}
		while(n>0)
		{
			dig=n%10;
			sum+=Math.pow(dig,count);
			n/=10;
		}
		if(num==sum)
			System.out.println(num+" is a Armstrong Number");
		else
			System.out.println(num+" is not a Armstrong Number");
	}
}

/* Sample Outputs 

Enter the number to be checked: 153
153 is a Armstrong Number

Enter the number to be checked: 127
127 is not a Armstrong Number

*/
