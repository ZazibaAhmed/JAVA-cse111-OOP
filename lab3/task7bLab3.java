import java.util.Scanner;
public class task7bLab3
{
    public static void main(String []args)
    {
        String a="SAME sentence";
        String b="same sentence";
        String c="same sentence";        
        int i=a.compareToIgnoreCase(b);
        int j=a.compareToIgnoreCase(c);
        int k=c.compareToIgnoreCase(b);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}