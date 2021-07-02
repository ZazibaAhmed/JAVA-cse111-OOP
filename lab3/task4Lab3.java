import java.util.Scanner;
public class task4Lab3
{
    public static void main(String []args)
    {
        System.out.print("Enter a word");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int x[]=new int[a.length()];
        int y[]=new int[26];
        for(int i=0;i<a.length();i++)
        {
            char b=a.charAt(i);
            int codeForb=(int)b;
            x[i]=codeForb;
        }
        for(int j=65;j<=90;j++)
        {
            
            for(int i=0;i<x.length;i++ )
            {
                if(x[i]==j)
                {
                    y[j-65]=y[j-65]+1;
                }
            }
        }
        int i=0;
        for(int j=65;j<=90;j++)
        {
            
            System.out.println((char)j+" which is "+j+" was found "+y[i]+" times");
            i++;
        }
    }
}

                
                    
                    
                    
                    
                    
                    
                    
                    