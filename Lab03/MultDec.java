public class MultDec
{
	public static void main (String [] args)
	{
		final int MULT=7;
		final int START=10;
		final int FINISH=100;
		
		System.out.println("Multipli di "+MULT+" tra "+START+" e "+FINISH+", in ordine decrescente:");
		
		int num=FINISH;
		while (num>=START)
		{
			if (num%MULT!=0)
			num--;
				else
				{
				System.out.println(num);
				num-=MULT;
				}
		}
	}
}