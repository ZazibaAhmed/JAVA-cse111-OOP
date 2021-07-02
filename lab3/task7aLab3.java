import java.util.Scanner;
public class task7aLab3
{
    public static void main(String []args)
    {
        String a="SAME sentence";
        String b="same sentence";
        String c="same sentence";        
        int i=a.compareTo(b);
        int j=a.compareTo(c);
        int k=c.compareTo(b);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}