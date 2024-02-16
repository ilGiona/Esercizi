import java.util.Scanner;

public class FibonacciAlgs
{
	public static long recursiveFib(int n)
	{
		if (n==0)
			return 0;
		if (n==1)
			return 1;
		return recursiveFib(n-2)+recursiveFib(n-1);
	}
	public static long iterativeFib(int n)
	{
		long fStart=0;
		long fNext=1;
		long tmp=0;
		if (n==1)
			return 1;
		for (int i=2;i<=n;i++)
		{
			tmp=fNext;
			fNext+=fStart;
			fStart=tmp;
		}
		return fNext;
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Inserire un numero:");
		boolean done=false;
		int num=0;
		while (!done)
		{
			num=in.nextInt();
			if (num>0)
				done=true;
			else
				System.out.println("Riprova.");
		}
			long time=0;
			time = System.nanoTime();
			System.out.println("Il numero alla posizione "+num+" della sequenza di fibonacci è: "+recursiveFib(num)+".");
			time = System.nanoTime() - time;
			System.out.printf("Tempo impiegato (algoritmo ricorsivo): %.3f s%n",time/1E9);
			time = System.nanoTime();
			System.out.println("Il numero alla posizione "+num+" della sequenza di fibonacci è: "+iterativeFib(num)+".");
			time = System.nanoTime() - time;
			System.out.printf("Tempo impiegato (algoritmo iterativo): %.3f s%n",time/1E9);
	}
}