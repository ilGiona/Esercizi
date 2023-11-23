import java.util.Scanner;

public class Triangolo
{
	public Triangolo (double la, double lb, double lc)
	{
		a=la;
		b=lb;
		c=lc;
		
		if (a>b)
		{
			double tmp=a;
			a=b;
			b=tmp;
		}
		if (b>c)
		{
			double tmp=b;
			b=c;
			c=tmp;
		}
		if (a>c)
		{
			double tmp=a;
			a=c;
			c=tmp;
		}
	}

	public String info()
	{
		if (a+b<c)
			return "I lati inseriti non possono formare un triangolo";
		else
		{
			if (a==b && b==c)
				return "Equilatero";
			
			String infoStr = "";
			if ((a==b && c!=a)||(b==c && b!=a)) 
				infoStr="Isoscele ";
			else
				infoStr="Scaleno ";

			if (c * c - a* a - b * b > 0)
				infoStr+="ottusangolo";
			else if  (c * c - a* a - b * b == 0)
				infoStr+="rettangolo";
			else
				infoStr+="acutangolo";
			
			return infoStr;
		}
	}

	public String toString()
	{
		return "Triangolo ("+a+" "+b+" "+c+")";
	}

    public double perimetro()
	{
		return a+b+c;
	}
	
	public double area()
    {
		double p=(a+b+c)/2;
		double surf=Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return surf;
    }

    public double h()
    {
		double p=(a+b+c)/2;
		double surf=Math.sqrt(p * (p - a) * (p - b) * (p - c));
		double ch=2*surf/c;
		return ch;
		
    }
	
	private double a; 
	private double b; 
	private double c;
}