import java.util.Scanner;
public class Ordina
{
	public static void main (String [] args)
	{
		System.out.println("Inserire tre stringhe:");
		Scanner stringa=new Scanner(System.in);
		
		String s1="";
		String s2="";
		String s3="";
		String ord="";
		
		while (stringa.hasNextLine())
		{
			s1=stringa.nextLine();
			s2=stringa.nextLine();
			s3=stringa.nextLine();
		}
		
		System.out.println("Le stringhe inserite ordinate lessicograficamente sono:");
		if ((s1.compareTo(s2)<0)&&(s1.compareTo(s3)<0))
		{
			System.out.println("1. "+s1);
			if (s2.compareTo(s3)<0)
			{
				System.out.println("2. "+s2);
				System.out.println("3. "+s3);
			}
			else
			{
				System.out.println("2. "+s3);
				System.out.println("3. "+s2);
			}
		}
		else if (s2.compareTo(s3)<0)
		{
			System.out.println("1. "+s2);
			if (s1.compareTo(s3)<0)
			{
				System.out.println("2. "+s1);
				System.out.println("3. "+s3);
			}
			else
			{
				System.out.println("2. "+s3);
				System.out.println("3. "+s1);
			}
		}
		else
		{
			System.out.println("1. "+s3);
			if (s1.compareTo(s2)<0)
			{
				System.out.println("2. "+s1);
				System.out.println("3. "+s2);
			}
			else
			{
				System.out.println("2. "+s2);
				System.out.println("3. "+s1);
			}
		}
	}
}		