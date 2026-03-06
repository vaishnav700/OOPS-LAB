import java.util.Scanner;
class Student
{
    int sNo;
    String sName;
    int marks;
    Student(int n,String name,int m)
    {
        sNo=n;
        sName=name;
        marks=m;
    }
}
    class StudSearch
    {
        public static void main(String args[])
        {
            Scanner s=new Scanner(System.in);
            System.out.print("Enter the number of students:");
            int n=s.nextInt();
            Student st[]=new Student[n];
            for(int i=0;i<n;i++)
            {
             System.out.println("\n Enter details for student"+(i+1)+":");
             System.out.print("Student Number");
             int sno=s.nextInt();
             System.out.println("Student Name:");
             String name=s.next();
             System.out.print("Student mark:");
             int mark=s.nextInt();
             st[i]=new Student(sno,name,mark);
            }
            System.out.print("\n Enter the student number to search:");
            int searchSno=s.nextInt();
            int flag=0;
            for(Student stud:st)
            {
                if(stud.sNo==searchSno)
                {
                 System.out.println("Student found:");
                 System.out.println("Student Number:"+stud.sNo);
                 System.out.println("Student Name:"+stud.sName);
                 System.out.println("Student mark:"+stud.marks);
                 flag=1;
                 break;
                }
            }
            if(flag==0)
            {
                System.out.println("Student with Student number"+searchSno+"not found");
            }
        }
    }
