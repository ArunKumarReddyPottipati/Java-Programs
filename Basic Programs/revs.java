//reversing a string
import java.util.Scanner;
public class revs
{	public static void main(String[] args)
	{	String s;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the String:");
		s=obj.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
			rev+=s.charAt(i);
		System.out.println("Reversed string is:"+rev);
	}
}