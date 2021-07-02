import java.util.Scanner;
public class task2Lab3
{
    public static void main(String []args)
    {
        System.out.print("Enter a word");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++)
        {
            char b=a.charAt(i);
            System.out.println(b);
        }
    }
}
                
            
        