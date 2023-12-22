import java.util.Scanner;
import java.lang.Math;
public class Compare
{
    public static void main(String[] args) {
        System.out.println("Inserire il primo numero:");
        Scanner num1=new Scanner(System.in);
        double n1=num1.nextDouble();
        
		System.out.println("Inserire il secondo numero:");
        Scanner num2=new Scanner(System.in);
        double n2=num1.nextDouble();
        
        double n1r=Math.round(n1*100.0)/100.0;
        double n2r=Math.round(n2*100.0)/100.0;
        
        if (n1==n2)
			System.out.println("I due numeri sono uguali");
        else if (Math.abs(n1r-n2r)<0.01)
			System.out.println("I due numeri sono approssimativamente uguali");
        else
        {
			System.out.println("I due numeri non sono uguali");
			System.out.println("Numero 1 arrotondato:\t"+n1r);
			System.out.println("Numero 2 arrotondato:\t"+n2r);
        }
    }
}