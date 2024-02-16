import java.util.*;

public class StudentManager
{
	public static void main(String[] args)
	{
		System.out.println("Inserire i dati degli studenti:");
		Scanner console=new Scanner(System.in);
		Student[] classe=new Student[20];
		int counter=0;
		boolean done=false;
		while (!done)
		{
			Student s = Student.readStudent(console);
			if (s != null)
			{
				classe[counter] = s;
				counter++;
			}
			else
				done=true;
		}
		String cmd="";
		done=false;
		while (!done)
		{
			System.out.println("Inserire un comando:");
			System.out.println("S = Ricerca studente\tQ = Termina programma");
			cmd=console.nextLine();
			if (cmd.equalsIgnoreCase("S"))
			{
				System.out.println("Inserire il cognome dello studente da ricercare:");
				cmd=console.nextLine();
				int searchResult=Student.search(classe,cmd);
				if (searchResult<0)
					System.out.println("Studente non trovato.");
				else
					System.out.println("Media di "+cmd+": "+Student.media(classe,searchResult));
				
			}
			else if (cmd.equalsIgnoreCase("Q"))
			{
				done=true;
			}
			else
				System.out.println("Inserire un comando valido.");
		}
		System.out.println("Arrivederci.");
	}
}