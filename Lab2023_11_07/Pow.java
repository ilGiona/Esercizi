public class Pow
{
	public static void main (String [] args)
	{
		for (int x=1;x<=4;x++)
		{
			for (int y=1;y<=5;y++)
			{
			System.out.print(x+"^"+y+" =");
			System.out.printf("\t%d", (int)Math.pow(x,y));
			System.out.print("\t");
			}
			System.out.println("");
		}
	}
}