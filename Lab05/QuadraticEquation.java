/*
    Gli oggetti di questa classe sono immutabili: non esistono metodi che permettano di modificare i coefficienti a, b, c dopo la creazione di un oggetto.
    E` stato scritto un costruttore di default, che inizializza a 0 tutti i coefficienti dell'equazione
    Poiche` il calcolo della seconda soluzione e` identico al calcolo della prima soluzione (a meno di un segno), e` stato scritto un metodo ausiliario 
	getSolution che viene richiamato (con argomenti diversi) da getSolution1 e getSolution2. Questo scelta evita una inutile duplicazione di codice.
    Poiche` il calcolo del Delta dell'equazione di secondo grado va effettuato sia nei metodi getSolution che nel metodo hasSolution, e` stato scritto un 
	metodo ausiliario getDelta che calcola il Delta. Questo scelta evita una inutile duplicazione di codice. Inoltre il metodo e` private perche` deve 
	essere usato unicamente da altri metodi della classe QuadraticEquation.
    Si e` scelto di fare restituire il valore NaN ai metodi getSolution, nei casi in cui l'equazione non ha soluzione oppure ha infinite soluzioni. Una 
	soluzione piu` corretta dovrebbe prevedere che in questi casi i metodi lancino un'eccezione. 

*/

public class QuadraticEquation
{
    public QuadraticEquation()
    {
        a = 0;
        b = 0;
        c = 0;
    }

    public QuadraticEquation(double acoeff, double bcoeff, double ccoeff)
    {
        a = acoeff;
        b = bcoeff;
        c = ccoeff;
    }
    
    public double getSolution1()
    {
        return getSolution(1);
    }
    
    public double getSolution2()
    {
        return getSolution(-1);
    }
    
    public boolean hasSolutions()
    {
    if(getDelta()>=0 && !( (a == 0) && (b == 0) && (c != 0) ) )
        return true;
    else
        return false;
    }
    
    // ********************** metodi ausiliari privati *********************

    /*
      Calcola una soluzione dell'equazione: se i e` positivo usa il segno "+" 
      nella formula quadratica, se i e` negativo usa il segno "-"
    */
    private double getSolution(int i)
    {
        double solution;
        if(!hasSolutions())  //nessuna soluzione
            solution = Double.NaN;
        else if (a != 0)    // caso a!=0, due soluzioni reali
        {   //la variabile root ha il segno di i
            double root = Math.signum(i) * Math.sqrt(getDelta());
            solution = (-b + root)/(2*a);
        }
        else if (b != 0)    // caso a=0,b!=0, una soluzione reale
            solution = -c/b;// la formula quadratica non e` utilizzabile
        else                // caso a=b=c=0; infinite soluzioni
            solution = Double.NaN;

    return solution;
    }
    
    /*
      Calcola il Delta dell'equazione di secondo grado 
    */
    private double getDelta()
    {
        double delta = b*b -4*a*c;
        return delta;
    }
    
    //********************* campi di esemplare (privati) **************
    private double a;
    private double b;
    private double c;   
}