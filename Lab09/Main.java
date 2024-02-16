import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		MiaCD uno=new MiaCD();
		MiaCD due=new MiaCD();
		MiaCD tre=new MiaCD();
		Scanner in=new Scanner(System.in);
		System.out.println("Inserire valori:");
		while (in.hasNextInt())
			uno.addLast(new Integer(in.nextInt()));
		while (!uno.isEmpty())
			due.addFirst(uno.removeLast());
		while (!due.isEmpty())
			tre.addLast(due.removeFirst());
		while (!tre.isEmpty())
			System.out.println(tre.removeFirst());
	}
}