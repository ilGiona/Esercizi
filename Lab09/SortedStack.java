import java.util.*;
public class SortedStack
{
	public static void sort(Stack s)
	{
		Stack temp=new ArrayStack();
		int counter=0;
		while (!s.isEmpty())
		{
			temp.push(s.pop());
			counter++;
		}
		for (int i=counter-1;i>0;i--)
		{
			Integer min=(Integer)temp.pop();
			for (int j=i;j>0;j--)
			{
				if (min.compareTo((Integer)temp.top())>0)
				{
					s.push(min);
					min=(Integer)temp.pop();
				}
				else 
					s.push(temp.pop());
			}
			temp.push(min);
			while (!s.isEmpty())
				temp.push(s.pop());
		}
		while (!temp.isEmpty())
			s.push(temp.pop());
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Stack s=new ArrayStack();
		System.out.println("Inserire valori:");
		while (in.hasNextInt())
			s.push(new Integer(in.nextInt()));
		sort(s);
		System.out.println("Pila ordinata:");
		while (!s.isEmpty())
			System.out.println(s.pop());
	}
}