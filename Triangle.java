package graphics;
import java.util.Scanner;
public class Triangle implements Area_cal
{
    int b,h;
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Breadth:");
        b=sc.nextInt();
        System.out.println("Input Height:");
        h=sc.nextInt();
        System.out.println("Area of Triangle:"+(0.5*b*h));
    }
}