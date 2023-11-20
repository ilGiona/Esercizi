import java.util.Scanner;
public class Counter
{
    public static void main(String[] args)
    {
        System.out.println("Inserire un numero:");
        Scanner n=new Scanner(System.in);
        int num=n.nextInt();
        if (num<=10)
        System.out.println("Il numero é pari o inferiore a 10.");
        else
            System.out.println("I numeri tra 10 e il numero inserito sono:");
            for (int i=0;i<=num-10;i++)
            {
                System.out.print(10+i+" ");
            }
        
    }
    
}