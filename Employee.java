import java.util.Scanner;
public class Employee
{
    int empid,TA,DA,HRA,Tax,basic,netsal;
    String empname;
    void getdata()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("\n\n Enter Employee Name,ID,TA,DA,HRA,Basic and Tax");
        empname=s.nextLine();
        empid=s.nextInt();
        TA=s.nextInt();
        DA=s.nextInt();
        HRA=s.nextInt();
        basic=s.nextInt();
        Tax=s.nextInt();
    }
    void cal()
    {
        netsal=(TA+DA+HRA+basic)-Tax;
        System.out.println("Net Salary="+netsal);
    }
    public static void main(String args[])
    {
        Employee e= new Employee();
        e.getdata();
        System.out.println("\n\n Employee Details\n");
        System.out.println("Employee ID:"+e.empid);
        System.out.println("Employee name:"+e.empname);
        e.cal();
    }
}
