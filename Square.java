public class Square 
{
 double side;
 void getinput(double s)
 {
   side=s;
 }
 double calArea()
 {
    return side*side;
 }
 public static void main(String args[])
 {
    Square ob=new Square();
    ob.getinput(4);
    System.out.println("Area of Square="+ob.calArea());
 }
    
}
