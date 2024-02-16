import java.util.Scanner;

public class BankAccountTest
{	public double getBalance()
	{  return balance;
	}
	public boolean deposit(double amount)
	{	if (amount > 0)
		{	balance += amount;
			return true;
		} 
		return false;
	}
	public boolean withdraw(double amount)
	{  if (amount > 0 && amount <= getBalance())
		{	balance -= amount;
			return true;
		}
		return false;
	}
	private double balance;

	public static void main(String[] args)
	{	Scanner console = new Scanner(System.in);
		BankAccountTest account = new BankAccountTest();
		do
		{	System.out.println("Comando? (Q, B, D, W, A)");
			if (!console.hasNext())
			break;
			String command = console.next();
			if (command.equalsIgnoreCase("q"))
			{	System.out.println("Arrivederci");
				break;
			}
			else if (command.equalsIgnoreCase("b"))
			{	System.out.println("Saldo attuale: " + account.getBalance());
			}	
			else if (command.equalsIgnoreCase("d"))
			{	String param = console.next();
				try
				{	double amount = Double.parseDouble(param);
					if (account.deposit(amount))
					System.out.println("Versamento effettuato: " + amount);
					else
					System.out.println("Versamento non corretto");
				}
				catch (NumberFormatException e)
				{
				}
			} 
			else if (command.equalsIgnoreCase("w"))
			{	String param = console.next();
				try
				{	double amount = Double.parseDouble(param);
					if (account.withdraw(amount))
					System.out.println("Prelievo effettuato: " + amount);
					else
					System.out.println("Prelievo non autorizzato");
				}
				catch (NumberFormatException e)
				{
				}
			}
			else if (command.equalsIgnoreCase("a"))
			{	String param = console.next();
				try
				{	double rate = Double.parseDouble(param);
					if (rate > 0)
					{	double interest = account.getBalance() * rate / 100;
						account.deposit(interest);
						System.out.println("Interessi calcolati e accreditati: " + interest);
					}
					else
					System.out.println("Tasso di interesse non valido");
				}
				catch (NumberFormatException e)
				{
				}
			}
		}
		while (true);
	}
}