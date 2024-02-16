import java.util.Scanner;

public class Massimo
{
	public static int massimo(int[] i,int l)
	{
		if (l-1==0)
			return i[0];
		return max(massimo(i,l-1),i[l]);
	}
	public static int max(int a,int b)
	{
		if (a>b)
			return a;
		return b;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int[] input=new int[100];
		int length=0;
		System.out.println("Inserire valori:");
		while (s.hasNext())
		{
			input[length]=s.nextInt();
			length++;
		}
		System.out.println("Il valore massimo inserito è "+massimo(input,length)+".");
	}
}