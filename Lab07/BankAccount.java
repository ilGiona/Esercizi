public class BankAccount
{
    public BankAccount()
    {
        balance = 0;
    }

    public BankAccount(double initialBalance)
    {   
        deposit(initialBalance);
    }

    public void deposit(double amount)
    {
        if (amount <= 0)
            throw new IllegalArgumentException();
        balance = balance + amount;
    }

    public void withdraw(double amount)
    {
        if (amount > balance || amount <= 0)
            throw new IllegalArgumentException();
        balance = balance - amount;
    }

    public void transfer(double amount, BankAccount other)
    { 
        withdraw(amount);
        other.deposit(amount);
    }


    // ------- metodi di accesso --------

    public double getBalance()
    {   
        return balance;
    }


    // ------ metodi di Object da sovrascrivere ---------
    // ......... toString e equals ......................
	public String toString()
	{
		return "Saldo: "+getBalance();
	}
	
	public boolean equals (BankAccount other)
	{
		double b1=getBalance();
		double b2=other.getBalance();
		if (b1==b2)
			return true;
		return false;
	}


    // -------- campi di esemplare ---------

    private double balance;
}
