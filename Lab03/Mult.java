public class Mult
{
	public static void main (String [] args)
	{
		final int MULT=5;
		final int START=10;
		final int FINISH=100;
		
		System.out.println("Multipli di "+MULT+" tra "+START+" e "+FINISH+":");
		
		int num=START;
		while (num<=FINISH)
		{
			if (num%MULT!=0)
			num++;
				else
				{
				System.out.println(num);
				num+=MULT;
				}
		}
	}
}