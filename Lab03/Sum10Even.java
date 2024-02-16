public class Sum10Even
{
    public static void main(String[] args)
    {
        int tot=0;
        for (int i=1;i<=10;i++)
        {
            tot=tot+2*i;
        }
        System.out.print("La somma dei primi 10 numeri é: "+tot);
    }
}