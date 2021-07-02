import java.util.Scanner;
public class task3Lab3
{
    public static void main(String []args)
    {
        System.out.print("Enter a word");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++)
        {
            char b=a.charAt(i);
            int codeForb=(int)b;
            System.out.println(b+"="+codeForb);
        }
    }
}