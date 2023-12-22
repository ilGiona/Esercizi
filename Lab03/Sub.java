import java.util.Scanner;
public class Sub 
{
    public static void main (String [] args)
    {
        System.out.println("Inserire la stringa da esaminare:");
        Scanner exam=new Scanner(System.in);
        String examin=exam.nextLine();
        
		System.out.println("Inserire la stringa di test:");
        Scanner test=new Scanner(System.in);
        String testin=test.nextLine();
        
        int i=0;
        int examl=examin.length();
        int testl=testin.length();
        
		if ((testl==0)||(examl==0))
            System.out.println("La stringa da esaminare e/o la stringa di test sono vuote.");
        else
        {
            for (i=0;i+testl<=examl;i++)
            {
                String examsub=examin.substring(i,i+testl);
                if (examsub.equalsIgnoreCase(testin))
                {
                    System.out.println("La stringa da esaminare contiene la stringa di test.");
                    break;
                }
            }
            if (i+testl>examl)
            System.out.println("La stringa da esaminare non contiene la stringa di test.");
        }
    }
}