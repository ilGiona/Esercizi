public class Ascii
{
	public static void main (String [] args)
	{
		for (int i=0;i<=255;i++)
		{
			char ascii = (char) i;
			System.out.print("Carattere n°"+i);
			System.out.printf("\t%c\n",ascii);
		}
	}
}