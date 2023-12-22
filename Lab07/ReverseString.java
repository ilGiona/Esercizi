public class ReverseString
{
	public static String reverse(String s)
	{
		if (s == null)
			throw new IllegalArgumentException();
		if (s.length() < 2)
			return s;
		return reverse(s.substring(1)) + s.charAt(0) ;
	}

	public static void main(String[] args)
	{
		if (args.length != 0)
		   System.out.println(reverse(args[0]));
	}
}