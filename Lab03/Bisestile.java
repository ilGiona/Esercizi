import java.util.Scanner;
public class Bisestile
{
	public static void main (String [] args)
	{
		System.out.println("Inserire un anno:");
		Scanner annoin=new Scanner(System.in);
		int anno=annoin.nextInt();
		
		int check1=anno%4;
		int check2=anno%100;
		int check3=anno%400;
		
		if (anno<0)
			System.out.println("L'anno inserito ("+anno+") è negativo.");
		else if (anno<7)
			System.out.println("L'anno inserito ("+anno+") non è bisestile.");
		else
		{
			if (anno<1582)
			{
				if (check1==0)
					System.out.println("L'anno inserito ("+anno+") è bisestile.");
				else
					System.out.println("L'anno inserito ("+anno+") non è bisestile.");
			}
			else if (((check1==0)&&(check2!=0))||(check3==0))
				System.out.println("L'anno inserito ("+anno+") è bisestile.");
			else
				System.out.println("L'anno inserito ("+anno+") non è bisestile.");
		}
	}
}