import java.util.*;
public class CapsCopier
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		while (in.hasNextLine())
		{
			String line=in.nextLine();
			Scanner tk=new Scanner(line);
			tk.useDelimiter("'| ");
			while (tk.hasNext())
			{
				String str=tk.next();
				if (str.length()==1)
				{
					if (str.equalsIgnoreCase("L"))
						System.out.print(str.toUpperCase()+"'");
					else
						System.out.print(str.toUpperCase()+" ");
				}
				else
				{
					String init=str.substring(0,1);
					str=str.substring(1);
					System.out.print(init.toUpperCase()+str.toLowerCase()+" ");
				}
			}
			System.out.println();
		}
	}
}