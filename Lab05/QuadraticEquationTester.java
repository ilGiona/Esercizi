import java.util.Scanner;

public class QuadraticEquationTester
{
	public static void main(String[] args)
	{
		Scanner console=new Scanner(System.in);
		System.out.println("Inserire i coefficienti di un equazione di secondo grado:");
		double acoeff=console.nextDouble();
		double bcoeff=console.nextDouble();
		double ccoeff=console.nextDouble();
		QuadraticEquation eq=new QuadraticEquation(acoeff,bcoeff,ccoeff);
		
		if (eq.hasSolutions())
		{
			System.out.println("Soluzione 1\tX = "+eq.getSolution1());
			System.out.println("Soluzione 2\tX = "+eq.getSolution2());
		}
		else
			System.out.println("L'equazione non ha soluzioni");
	}
}