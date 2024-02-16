import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args)
    {
        System.out.println("Inserire una posizione nella sequenza di fibonacci:");
        Scanner pos=new Scanner(System.in);
        int p=pos.nextInt();
        
        if (p<1)
            System.out.println("La posizione inserita non é valida.");
        else if (p==1)
            System.out.println("Il numero alla posizione 1 nella sequenza di fibonacci é: 0");
        else
        {
            int fib1=0;
            int fib2=1;
            int fibp=1;
            
            for (int counter=2;counter<p;counter++)
            {
                fibp=fib1+fib2;
                fib1=fib2;
                fib2=fibp;
            }
            
            System.out.println("Il numero alla posizione "+p+" nella sequenza di fibonacci é: "+fibp);
        }
    }
}