import java.util.Scanner;
public class Triangolo
{
    public static void main(String[] args) 
    {
        System.out.println("Inserire lunghezza cateto 1:");
        Scanner cat1=new Scanner(System.in);
        double c1=cat1.nextDouble();
        
        System.out.println("Inserire lunghezza cateto 2:");
        Scanner cat2=new Scanner(System.in);
        double c2=cat2.nextDouble();
        
        double ip=0;
        ip=Math.sqrt(Math.pow(c1,2)+Math.pow(c2,2));
        
        double per=0;
        per=c1+c2+ip;
        double area=0;
        area=c1*c2/2;
        
        double ang1rad=0;
        ang1rad=Math.atan(c1/c2);
        double ang1=0;
        ang1=ang1rad*180/Math.PI;
        double ang2=0;
        ang2=90-ang1;
        
        System.out.printf("Cateto 1:\t%.2f",c1);
        System.out.println("cm");
        System.out.printf("Cateto 2:\t%.2f",c2);
        System.out.println("cm");
        System.out.printf("Ipotenusa:\t%.2f",ip);
        System.out.println("cm");
        System.out.printf("Perimetro:\t%.2f",per);
        System.out.println("cm");
        System.out.printf("Area:\t\t%.2f",area);
        System.out.println("cm²");
        System.out.printf("Angolo 1:\t%.2f",ang1);
        System.out.println("º");
        System.out.printf("Angolo 2:\t%.2f",ang2);
        System.out.println("º");
    }
}