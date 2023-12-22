import java.util.Scanner;
public class NumScanner{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		System.out.print("Inserisci un numero intero tra 0 e 99999: ");
		int num = console.nextInt();
 		System.out.println("Il numero "+num+" \u00E9 composto dalle cifre:");
 		
 		int c1=num%10;
 		num=num/10;
 		
 		int c2=num%10;
 		num=num/10;
 		
 		int c3=num%10;
 		num=num/10;
 		
 		int c4=num%10;
 		num=num/10;
 		
 		int c5=num%10;
 		num=num/10;
 		
 		System.out.println(c5+" "+c4+" "+c3+" "+c2+" "+c1);
 	}
 }
