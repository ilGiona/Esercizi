import java.util.Scanner;
public class Elaboratore
{
	public static void main(String [] args)
	{
		System.out.println("Inserire una serie di numeri:");
		Scanner num=new Scanner(System.in);
		
		double n=0;
		int counter=0;
		double sum=0;
		double sum2=0;
		
		while (num.hasNextDouble())
		{
			n=num.nextDouble();
			counter++;
			sum+=n;
			sum2+=Math.pow(n,2);
		}
		
		double avg=sum/counter;
		double devstan=Math.sqrt((sum2-sum*sum/counter)/(counter));
		
		if (counter==0)
		{
			System.out.println("Media:\t\t\t0");
			System.out.println("Deviazione standard:\t0");
		}
		else
		{
			System.out.printf("Media:\t\t\t%.3f\n", avg);
			System.out.printf("Deviazione standard:\t%.3f\n", devstan);
		}
	}
}