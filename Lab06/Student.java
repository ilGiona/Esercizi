import java.util.*;

public class Student
{
	private String cognome;
	private double scritto;
	private double orale;
	
	public Student(String c,double s,double o)
	{
		cognome=c;
		scritto=s;
		orale=o;
	}
	public String getCognome()
	{
		return cognome;
	}
	public double getScritto()
	{
		return scritto;
	}
	public double getOrale()
	{
		return orale;
	}
	
	public static double media(Student[] c,int i)
	{
		double avg=(c[i].getScritto()+c[i].getOrale())/2;
		return avg;
	}
	public static int search(Student[] c,String s)
	{
		for (int i=0;i<c.length;i++)
		{
			String test="";
			if (c[i]!=null)
				test=c[i].getCognome();
				if (test.equalsIgnoreCase(s))
					return i;
		}
		return -1;
	}
	public static Student readStudent(Scanner in)
    {   
        String line = in.nextLine();
        if (line.length() == 0)
            return null;
        Scanner t = new Scanner(line);
        String cognome = t.next(); 
        double scritto = Double.parseDouble(t.next());
        double orale = Double.parseDouble(t.next());
        return new Student(cognome, scritto, orale);
    }
}