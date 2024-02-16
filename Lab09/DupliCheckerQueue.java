import java.util.*;
public class DupliCheckerQueue
{
	public static void main (String[] args)
	{
		Queue q=new ArrayQueue();
		Scanner s=new Scanner(System.in);
		System.out.println("Inserire valori:");
		while (s.hasNextInt())
			q.enqueue(new Integer(s.nextInt()));
		DupliCheck(q);
		System.out.println("Coda senza duplicati:");
		while (!q.isEmpty())
		System.out.println(q.dequeue());
	}
	public static void DupliCheck(Queue q)
	{
		q.enqueue(null);
		int count = -1;
		Object obj;
		do
		{
			obj = q.dequeue();
			q.enqueue(obj);
			count++;
		}	while (obj != null);
		while (count>0)
		{
			obj= q.dequeue();
			count--;
			for (int i=count;i>0;i--)
			{
				Object test=q.dequeue();
				if (!obj.equals(test))
					q.enqueue(test);
				else
					count--;
			}
			q.enqueue(obj);
			do
			{
				obj = q.dequeue();
				q.enqueue(obj);
			} 	while (obj != null);
		}
		while (true)
		{
			obj = q.dequeue();
			if (obj == null)
            break;
			q.enqueue(obj);
		}
	}
}