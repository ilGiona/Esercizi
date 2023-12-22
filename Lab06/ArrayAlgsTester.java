import java.util.Scanner;

public class ArrayAlgsTester
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Inserire la dimensione dell'array:");
		int size=in.nextInt();
		if (size<1)
			throw new IllegalArgumentException();
		System.out.println("Inserire il valore massimo dell'array:");
		int max=in.nextInt();
		if (max<1)
			throw new IllegalArgumentException();
		
		int[] a=ArrayAlgs.randomIntArray(size,max);
		System.out.println("Array generato:");
		System.out.println(ArrayAlgs.printArray(a,size));
		
		System.out.println("Scegliere il metodo di ordinamento:");
		System.out.println("S = Selection sort\tI = Insertion Sort\tM = Merge sort\tQ = Quit");
		String cmd=in.next();
		if (cmd.equalsIgnoreCase("S"))
		{
			ArrayAlgs.selectionSort(a,size);
			System.out.println("Array ordinato:");
			System.out.println(ArrayAlgs.printArray(a,size));
		}
		else if (cmd.equalsIgnoreCase("I"))
		{
			ArrayAlgs.insertionSort(a,size);
			System.out.println("Array ordinato:");
			System.out.println(ArrayAlgs.printArray(a,size));
		}
		else if (cmd.equalsIgnoreCase("M"))
		{
			ArrayAlgs.mergeSort(a,size);
			System.out.println("Array ordinato:");
			System.out.println(ArrayAlgs.printArray(a,size));
		}
		else if (cmd.equalsIgnoreCase("Q"))
		{
			System.out.println("Arrivederci.");
			System.exit(0);
		}
		else
			throw new IllegalArgumentException();
		
		System.out.println("Inserire un valore da ricercare, oppure inserire \"Q\" per uscire.");
		if (cmd.equalsIgnoreCase("Q"))
		{
			System.out.println("Arrivederci.");
			System.exit(0);
		}
		int value=in.nextInt();
		if (value<1)
			throw new IllegalArgumentException();
		
		System.out.println("Scegliere il metodo di ricerca:");
		System.out.println("L = Linear search\tB = Binary Search");
		cmd=in.next();
		int result=0;
		if (cmd.equalsIgnoreCase("L"))
		{
			result=ArrayAlgs.linearSearch(a,size,value);
			if (result==-1)
				System.out.println("Valore non trovato.");
			else
				System.out.println("Valore trovato alla posizione "+result+".");
		}
		else if (cmd.equalsIgnoreCase("B"))
		{
			result=ArrayAlgs.binarySearch(a,size,value);
			if (result==-1)
				System.out.println("Valore non trovato.");
			else
				System.out.println("Valore trovato alla posizione "+result+".");
		}
		else
			throw new IllegalArgumentException();
	}
}
