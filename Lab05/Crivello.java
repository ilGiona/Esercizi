import java.util.Scanner;
public class Crivello
{
	public static void main(String[] args)
	{
		Scanner console=new Scanner(System.in);
		System.out.println("Inserire il valore massimo della ricerca:");
		boolean[] nonprimi= new boolean[console.nextInt()];
		
		for (int i=2;i<nonprimi.length;i++)
		{
			for (int j=2;i*j<nonprimi.length;j++)
			{
				nonprimi[i*j]=true;
			}
		}
		
		System.out.println("I numeri primi minori di "+nonprimi.length+" sono:");
		for (int k=1;k<nonprimi.length;k++)
		{
			if (nonprimi[k]==false)
				System.out.println(k);
		}
	}
}