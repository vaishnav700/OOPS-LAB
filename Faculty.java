import java.util.Scanner;
public class Faculty
{
    String fname;
    int age;
    void getData()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("\n \n Enter faculty name:");
        fname=scan.nextLine();
        System.out.println( "\n\n Enter Faculty Age:");
        age=scan.nextInt();
    }
    void display()
    {
        System.out.println("Family Name:"+fname);
        System.out.println("Faculty Age:"+age);
    }
    public static void main(String args[])
    {
        Faculty f= new Faculty();
        f.getData();
        System.out.println("\n Faculty Details\n");
        System.out.println("\n\n-----------------\n");
        f.display();
    }

}