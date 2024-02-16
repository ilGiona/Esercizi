import java.util.Scanner;

public class Primi
{
    public static void main(String[] args) 
    {
        System.out.println("Inserire un numero:");
        Scanner console = new Scanner(System.in);
        int max=0;
        boolean done=false;
		
        while (!done)
        {
            try
			{
				String line=console.nextLine();
				max=Integer.parseInt(line);
				if (max>=1)
					done=true;
				else
					System.out.println("Inserire un numero maggiore o uguale a 1.");	
			}
			catch (NumberFormatException e)
			{
				System.out.println("La stringa inserita non é valida, riprovare.");
			}
        
			System.out.println("I numeri primi da 1 a "+max+" sono:\n1");
			for (int numTest=1;numTest<=max;numTest++)
			{
				for (int tester=2;tester<=numTest;tester++)
				{
					if (numTest%tester==0 && numTest==tester)
						System.out.println(numTest);
					else if (numTest%tester==0)
						break;
				}
			}
        }
    }
}