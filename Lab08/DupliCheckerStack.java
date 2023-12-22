import java.util.*;
public class DupliCheckerStack
{
	public static void dupliCheck(Stack s)
	{
		Stack temp1=new ArrayStack();
		Stack temp2=new ArrayStack();
		while (!s.isEmpty())
		{
			Object obj=s.pop();
			while (!s.isEmpty())
			{
				Object test=s.pop();
				if (!obj.equals(test))
					temp1.push(test);
			}
			temp2.push(obj);
			while (!temp1.isEmpty())
				s.push(temp1.pop());
		}
		while (!temp2.isEmpty())
			s.push(temp2.pop());
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Stack s=new ArrayStack();
		System.out.println("Inserire valori:");
		while (in.hasNextInt())
			//s.push(new Integer(in.nextInt()));
		{
			Object tmp = (int) in.nextInt();
			s.push(tmp);
		}
		dupliCheck(s);
		System.out.println("Pila senza duplicati:");
		while (!s.isEmpty())
			System.out.println(s.pop());
	}
}