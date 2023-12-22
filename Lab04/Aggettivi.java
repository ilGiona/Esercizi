import java.util.Scanner;

public class Aggettivi
{
	public static void main (String[] args)
	{
		System.out.println("Inserire un aggettivo:");
		Scanner console=new Scanner(System.in);
		String agg=console.nextLine();
		int length=agg.length();
		
		String iniz=agg.substring(0,1);
		iniz=iniz.toUpperCase();
		String body=agg.substring(1,length-1);
		String fine=agg.substring(length-1);
		
		System.out.println("Aggettivo inserito:\t"+iniz+body+fine);
		System.out.println("Diminutivo:\t\t"+iniz+body+"in"+fine);
		System.out.println("Superlativo assoluto:\t"+iniz+body+"issim"+fine);
	}
}
		
		