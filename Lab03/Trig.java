import java.util.Scanner;
public class Trig
{
    public static void main(String[] args) 
    {
        System.out.println("Inserire un angolo in gradi:");
        Scanner angolo=new Scanner(System.in);
        double ang=angolo.nextDouble();
        final int NULLANG=360;
        double angdeg=ang%NULLANG;
        
        double angrad=angdeg*Math.PI/180;
        double angradsimple=angrad/Math.PI;
        double sin=Math.sin(angrad);
        double cos=Math.cos(angrad);
        double tan=Math.tan(angrad);
        
        System.out.printf("Angolo inserito:\t%.3f",angdeg);
        System.out.println("º");
        System.out.printf("Angolo in radianti:\t%.3f",angradsimple);
        System.out.println("π rad");
        System.out.printf("sin(%.3f",angradsimple);
        System.out.printf("π)=\t\t%.3f\n",sin);
        System.out.printf("cos(%.3f",angradsimple);
        System.out.printf("π)=\t\t%.3f\n",cos);
        System.out.printf("tan(%.3f",angradsimple);
        System.out.printf("π)=\t\t%.3f\n",tan);
    }
}