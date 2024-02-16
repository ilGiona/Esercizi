import java.util.Scanner;

public class Euclide
{
	public static void main (String[] args)
	{
		System.out.println("Inserire due numeri:");
		Scanner console=new Scanner(System.in);
		int n=0;
		int m=0;
		boolean done=false;
		
		while (!done)
        {
            try
			{
				String line=console.nextLine();
				n=Integer.parseInt(line);
				if (n>=1)
					done=true;
				else
					System.out.println("Inserire un numero maggiore o uguale a 1.");	
			}
			catch (NumberFormatException e)
			{
				System.out.println("La stringa inserita non é valida, riprovare.");
			}
		}
		
		done=false;
		while (!done)
        {
            try
			{
				String line=console.nextLine();
				m=Integer.parseInt(line);
				if (m>=1 && m>n)
					done=true;
				else
					System.out.println("Inserire un numero maggiore o uguale a 1 e maggiore del numero inserito precedentemente.");	
			}
			catch (NumberFormatException e)
			{
				System.out.println("La stringa inserita non é valida, riprovare.");
			}
		}
		
		int N=n;
		int M=m;
		while (M%N!=0)
		{
			int resto=M%N;
			M=N;
			N=resto;
		}
		System.out.println("Il MCD tra "+n+" e "+m+" è: "+N);
	}
}