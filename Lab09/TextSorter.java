import java.util.*;
public class TextSorter
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		ArrayList<String> lista=new ArrayList<String>();
		while (in.hasNextLine())
			lista.add(new String(in.nextLine()));
		Riga[] r=new Riga[lista.size()];
		for (int i=0;i<lista.size();i++)
			r[i]=new Riga(lista.get(i));
		
        for (int i=1;i<r.length;i++) 
		{
            Riga tmp=r[i];
            int j;
            for (j=i-1;j>=0 && r[j].compareTo(tmp)>0;j--)
                r[j + 1] = r[j];
            r[j+1] = tmp; //ha senso perché alla fine del ciclo for j viene decrementato
        }
		
		String[] sorted=new String[r.length];
		int dim=0;
		for (int i=0;i<r.length-1;i++)
			if (r[i].compareTo(r[i+1])!=0)
				sorted[dim++]=r[i].getRiga();
		sorted[dim++]=r[r.length-1].getRiga();
		for (int i=0;i<dim;i++)
			System.out.println(sorted[i]);
	}
}
class Riga implements Comparable
{
	private String line;
	private int wNum;
	
	public Riga(String s)
	{
		line=s;
		Scanner line=new Scanner(s);
		int c=0;
		while (line.hasNext())
		{
			line.next();
			c++;
		}
		wNum=c;
	}
	public String getRiga()
	{
		return line;
	}
	public int compareTo(Object obj) throws ClassCastException
	{
		Riga other = (Riga) obj;
		if (wNum != other.wNum)
			return wNum - other.wNum;
		if (line.length() != other.line.length())
			return line.length() - other.line.length();
		return line.compareTo(other.line);
	}
}