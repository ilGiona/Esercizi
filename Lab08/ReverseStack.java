import java.util.*;
public class ReverseStack
{
	public static void reverse(Stack s)
	{
		Stack temp1 = new ArrayStack();
		int count = 0;
		while (!s.isEmpty())
		{  temp1.push(s.pop());
			count++;
		}
		while (!temp1.isEmpty())
			s.push(temp1.pop());
		while (count > 0)
		{
			count--;
			Object obj = s.pop();
			for (int i = 0; i < count; i++)
				temp1.push(s.pop());
			s.push(obj);
			for (int i = 0; i < count; i++)
				s.push(temp1.pop());
		}
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Stack s=new ArrayStack();
		System.out.println("Inserire valori:");
		while (in.hasNextInt())
			s.push(new Integer(in.nextInt()));
		reverse(s);
		System.out.println("Pila rovesciata:");
		while (!s.isEmpty())
			System.out.println(s.pop());
	}
}