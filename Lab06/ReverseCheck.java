import java.util.Scanner;

public class ReverseCheck
{
	public static char[] toArray(String s)
	{
		char[] a=new char[s.length()];
		for (int i=0;i<a.length;i++)
			a[i]=s.charAt(i);
		return a;
	}
	public static boolean reverseEquals(char[] a,char[] b)
	{
		if (a.length!=b.length)
			return false;
		char[] reverse=new char[a.length];
		for (int i=0;i<a.length;i++)
			reverse[i]=a[a.length-i-1];
		for (int i=0;i<a.length;i++)
			if (reverse[i]!=b[i])
				return false;
		return true;
	}
	public static void main(String[] args)
	{
		System.out.println("Inserire due stringhe:");
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		String s2=in.nextLine();
		
		char[] a1=Reverse.toArray(s1);
		char[] a2=Reverse.toArray(s2);
		
		if (Reverse.reverseEquals(a1,a2))
			System.out.println("Le due stringhe sono una l'inversa dell'altra.");
		else
			System.out.println("Le due stringhe non sono una l'inversa dell'altra.");
	}
}