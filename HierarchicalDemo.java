import java.util.Scanner;
class Manager
{
    String MngrName;
    Manager(String mname)
    {
        MngrName=mname;
    }
}
class Employee extends Manager
{
    String empName;
    Employee(String mname,String ename)
    {
        super(mname);
        empName=ename;
    }
    void display()
    {
        System.out.println("Manager:"+MngrName);
        System.out.println("Employee:"+empName);
        
    }
}
class Staff extends Manager
{
    String stfname;
    Staff(String mname,String sname)
    {
        super(mname);
        stfname=sname;
    }
    void display()
    {
        System.out.println("Manager:"+MngrName);
        System.out.println("Staff:"+stfname);
    }
}
public class HierarchicalDemo
{
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter details");
        System.out.print("Manager name:");
        String m=s.next();
        System.out.print("Employee name:");
        String e=s.next();
        System.out.print("Staff name:");
        String st=s.next();
        Employee ob1=new Employee(m,e);
        System.out.println("Manager-Employee Details");
        System.out.println("------------------------");
        ob1.display();
        Staff ob2=new Staff(m,st);
        System.out.println("Manager-Staff Details");
        System.out.println("---------------------");
        ob2.display();
        s.close();
    }
}