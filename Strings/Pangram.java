import java.util.Scanner;
public class Pangram
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int c=0;
		System.out.println("Enter the string");
		String s = sc.next();
		s=s.toLowerCase();
		String alp="abcdefghijklmnopqrstuvwxyz";
		if(s.length()<26)
			System.out.println("Not a Pangram");
		else
		{
			for(int i=0;i<26;i++)
			{
				String ch = ""+alp.charAt(i);
				if(s.contains(ch))
					c++;
			}
			if(c==26)
				System.out.println("Is a pangram");
			else
				System.out.println("Not a pangram");
		}
	}
}