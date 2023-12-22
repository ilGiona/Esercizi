import java.util.Scanner;
public class Palindromi
{
	public static void main(String[] args)
	{
		System.out.println("Inserire una stringa:");
		Scanner console=new Scanner(System.in);
		String test=console.nextLine();
		
		if (test.length()==0 || test.length()==1)
			System.out.println("La stringa inserita è palindroma.");
		else
		{
			String test1=test.substring(0,test.length()/2);
			String test2="";
			if (test.length()%2==0)
				test2=test.substring(test.length()/2);
			else
				test2=test.substring(test.length()/2+1);
			String test1r="";
			for (int i=0; i<test1.length();i++)
				test1r=test1.substring(i,i+1)+test1r;
			
			if (test1r.equals(test2))
				System.out.println("La stringa inserita è palindroma.");
			else
				System.out.println("La stringa inserita non è palindroma.");
		}
	}
}