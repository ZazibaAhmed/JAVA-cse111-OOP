import java.util.*;
public class Task14_Lab8{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of Circle: ");
        double r1=sc.nextDouble();
        Point s1=new Area(r1);
        System.out.println("Creating a Cirle...done!");
        System.out.print("The area of the Circle is ");
        System.out.println(s1.space());
        
        System.out.print("Enter radius of Sphere: ");
        double r2=sc.nextDouble();
        Point s2=new Volume(r2);
        System.out.println("Creating a Cirle...done!");
        System.out.print("The area of the Circle is ");
        System.out.println(s2.space());
    }
}
        
        
        
        